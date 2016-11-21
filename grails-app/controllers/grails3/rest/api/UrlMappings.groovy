package grails3.rest.api

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/users"(resources: "user") {
            "/purchases"(resources: "purchase")
        }

        "/tickets"(resources: "ticket")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
