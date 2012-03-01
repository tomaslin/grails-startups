package com.grailsstartups

import grails.converters.JSON

class TwitterService {

    def getDetails(String username) {
        def result
        try {
            result = JSON.parse(new URL("https://api.twitter.com/1/users/show.json?screen_name=$username").text)
        } catch (FileNotFoundException e) {

        }
        result
    }

}
