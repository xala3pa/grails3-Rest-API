package grails3.rest.api

class User {

    static hasMany = [purchase: Purchase]

    long id
    String name
    String lastName

    static constraints = {
    }
}
