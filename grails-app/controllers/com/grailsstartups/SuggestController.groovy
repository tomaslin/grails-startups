package com.grailsstartups

class SuggestController {

    def twitterService

    def index(String username) {

        if (!username) {
            return render('Please suggest an username')
        } else {

            if (username.startsWith('@')) {
                username = username.substring(1)
            }

            def details = twitterService.getDetails(username)

            if (!details) {
                return render('Username could not be found on Twitter')
            }

            [details: details, username: username]
        }

    }

}
