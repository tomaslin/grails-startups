package com.grailsstartups

import org.grails.taggable.Taggable

class Startup implements Taggable{

	String name
	String twitter
	String website
	String description
    String image
    String location
    boolean approved = false

    Date dateCreated
    Date lastModified

    static constraints = {

    }
}
