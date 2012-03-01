import com.grailsstartups.Startup

class BootStrap {

    def init = { servletContext ->

        if (Startup.count() == 0) {

            new Startup(
                    name: 'Secret Escapes',
                    twitter: 'secret_escapes',
                    website: 'http://www.secretescapes.com/',
                    description: '...the worst-kept secret in luxury travel. Curating exclusive, members-only offers for 4/5* hotels and holidays',
                    image: 'http://a1.twimg.com/profile_images/1207501313/se_twitter_avatar_03_normal.jpg',
                    approved: true,
                    location: 'London, UK',
                	reviewed: true
            ).save( failOnError:  true)

            new Startup(
                    name: 'ClickOnero Mexico',
                    location: 'Cuidad de Mexico',
                    twitter: 'clickOneroDF',
                    website: 'http://www.clickonero.com.mx',
                    description: '¡La mayoría de los servicios que deseas con hasta un 90% de descuento! Llegó clickOnero: la manera más divertida de comprar en la web.',
                    image: 'http://a3.twimg.com/profile_images/1427828506/Profile_ClickOnero_DF-01_normal.jpg',
                    approved: true,
                	reviewed: true
            ).save()


            new Startup(
                    location: 'London, UK and Portland, ME',
                    name: 'CruiseLineFans',
                    twitter: 'cruiselinefans',
                    website: 'http://www.cruiselinefans.com',
                    description: 'Love to Cruise? Searching for a cruise vacation? Read reviews, get advice and find deals.',
                    image: 'http://a0.twimg.com/profile_images/1184767819/clf_twitter_logo-1_normal.jpg',
                    approved: true,
                	reviewed: true
            ).save()

            new Startup(
                    location: 'London, UK',
                    name: 'What\'s In My Handbag',
                    twitter: 'wimh_hq',
                    website: 'http://www.whatsinmyhandbag.com',
                    description: 'A new way for women to share & discover beauty products',
                    image: 'http://a2.twimg.com/profile_images/1573562362/WIMH_Small_Whiteonblack_normal.png',
                    approved: true,
                	reviewed: true
            ).save()

            new Startup(
                    location: 'London, UK',
                    name: 'Carmine UK',
                    twitter: 'carmine_UK',
                    website: 'http://www.carmine.co.uk',
                    description: "Beauty's best. In a box.",
                    image: 'http://a0.twimg.com/profile_images/1533170135/Carmine_image_RGB_normal.jpg',
                    approved: true,
                	reviewed: true
            ).save()

        }

    }
    def destroy = {
    }
}
