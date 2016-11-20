package grails3.rest.api

import grails.rest.RestfulController

class PurchaseController extends RestfulController {
    static responseFormats = ['json', 'xml']

    PurchaseController() {
        super(Purchase)
    }

    @Override
    protected Purchase queryForResource(Serializable id) {
        def userId = params.userId

        Purchase.where {
            id == id && user.id == userId
        }.find()
    }
}
