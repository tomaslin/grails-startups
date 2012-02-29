package com.grailsstartups

import org.springframework.dao.DataIntegrityViolationException

class StartupController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def save() {
        def startupInstance = new Startup(params)
        if (!startupInstance.save(flush: true)) {
            render( 'Sorry, an error has occurred' )
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'startup.label', default: 'Startup'), startupInstance.id])

        render( 'Thank you for your submission, your startup has been submitted for approval' )

    }

}
