package com.grailsstartups

import org.springframework.dao.DataIntegrityViolationException

class StartupController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [startupInstanceList: Startup.list(params), startupInstanceTotal: Startup.count()]
    }

    def create() {
        [startupInstance: new Startup(params)]
    }

    def save() {
        def startupInstance = new Startup(params)
        if (!startupInstance.save(flush: true)) {
            render(view: "create", model: [startupInstance: startupInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'startup.label', default: 'Startup'), startupInstance.id])
        redirect(action: "show", id: startupInstance.id)
    }

    def show() {
        def startupInstance = Startup.get(params.id)
        if (!startupInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "list")
            return
        }

        [startupInstance: startupInstance]
    }

    def edit() {
        def startupInstance = Startup.get(params.id)
        if (!startupInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "list")
            return
        }

        [startupInstance: startupInstance]
    }

    def update() {
        def startupInstance = Startup.get(params.id)
        if (!startupInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (startupInstance.version > version) {
                startupInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'startup.label', default: 'Startup')] as Object[],
                          "Another user has updated this Startup while you were editing")
                render(view: "edit", model: [startupInstance: startupInstance])
                return
            }
        }

        startupInstance.properties = params

        if (!startupInstance.save(flush: true)) {
            render(view: "edit", model: [startupInstance: startupInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'startup.label', default: 'Startup'), startupInstance.id])
        redirect(action: "show", id: startupInstance.id)
    }

    def delete() {
        def startupInstance = Startup.get(params.id)
        if (!startupInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "list")
            return
        }

        try {
            startupInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'startup.label', default: 'Startup'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
