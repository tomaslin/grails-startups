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
	boolean reviewed = false

    Date dateCreated
    Date LastUpdated

    static constraints = {

    }
}
