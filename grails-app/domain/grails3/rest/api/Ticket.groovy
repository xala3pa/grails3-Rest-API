package grails3.rest.api

import grails.rest.Resource

@Resource
class Ticket {
    long id
    BigDecimal price

    static constraints = {
    }
}