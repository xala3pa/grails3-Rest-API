package grails3.rest.api

import grails.rest.Resource

@Resource(uri = '/Payments')
class Payment {
    long id
    String name
    BigDecimal amount

    static constraints = {
    }
}
