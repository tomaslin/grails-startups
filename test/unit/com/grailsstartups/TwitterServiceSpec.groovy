package com.grailsstartups

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(TwitterService)
class TwitterServiceSpec extends Specification {

    def 'able to get new twitter details from an username'() {

        when:
            def startup = service.getDetails('secret_escapes')

        then:
            startup.profile_image_url == 'http://a1.twimg.com/profile_images/1207501313/se_twitter_avatar_03_normal.jpg'
            startup.name == 'Secret Escapes'
            startup.description == '...the worst-kept secret in luxury travel. Curating exclusive, members-only offers for 4/5* hotels and holidays. Tweeting live from SEHQ '
            startup.location == 'London - UK'
            startup.url == 'http://www.secretescapes.com/instant-access/tweet-tweet'

    }

}
