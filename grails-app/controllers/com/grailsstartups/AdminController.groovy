package com.grailsstartups

class AdminController {

    def index() { 
		def list = Startup.findAllByReviewed( false ) 
		
		if( list.size() == 0 ){
			redirect( url: '/' )
		}
		
		[ startups : list ]
	}

	def modify(long id, boolean approved){
		def startup = Startup.get(id)
		startup.approved = approved
		startup.reviewed = true
		startup.save()
		redirect(action:'index')
	}

}
