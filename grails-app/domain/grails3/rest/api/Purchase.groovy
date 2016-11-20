package grails3.rest.api

import grails.rest.Resource

@Resource(uri= '/purchases')
class Purchase {

    long id
    BigDecimal amount

    static constraints = {
    }
}
