package com.grailsstartups



import org.junit.*
import grails.test.mixin.*

@TestFor(StartupController)
@Mock(Startup)
class StartupControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/startup/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.startupInstanceList.size() == 0
        assert model.startupInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.startupInstance != null
    }

    void testSave() {
        controller.save()

        assert model.startupInstance != null
        assert view == '/startup/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/startup/show/1'
        assert controller.flash.message != null
        assert Startup.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/startup/list'


        populateValidParams(params)
        def startup = new Startup(params)

        assert startup.save() != null

        params.id = startup.id

        def model = controller.show()

        assert model.startupInstance == startup
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/startup/list'


        populateValidParams(params)
        def startup = new Startup(params)

        assert startup.save() != null

        params.id = startup.id

        def model = controller.edit()

        assert model.startupInstance == startup
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/startup/list'

        response.reset()


        populateValidParams(params)
        def startup = new Startup(params)

        assert startup.save() != null

        // test invalid parameters in update
        params.id = startup.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/startup/edit"
        assert model.startupInstance != null

        startup.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/startup/show/$startup.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        startup.clearErrors()

        populateValidParams(params)
        params.id = startup.id
        params.version = -1
        controller.update()

        assert view == "/startup/edit"
        assert model.startupInstance != null
        assert model.startupInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/startup/list'

        response.reset()

        populateValidParams(params)
        def startup = new Startup(params)

        assert startup.save() != null
        assert Startup.count() == 1

        params.id = startup.id

        controller.delete()

        assert Startup.count() == 0
        assert Startup.get(startup.id) == null
        assert response.redirectedUrl == '/startup/list'
    }
}
