package grails3.rest.api

import grails.rest.Resource

@Resource(uri= '/purchases')
class Purchase {
    static belongsTo = [user: User]

    long id
    BigDecimal amount

    static constraints = {
    }
}
