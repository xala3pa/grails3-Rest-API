package grails3.rest.api

import grails.rest.Resource

@Resource(uri = '/payments')
class Payment {
    long id
    String name
    BigDecimal amount

    static constraints = {
    }
}
