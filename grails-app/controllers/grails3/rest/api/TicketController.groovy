package grails3.rest.api

import grails.transaction.Transactional

@Transactional(readOnly = true)
class TicketController {

    def index() {
        respond tickets: Ticket.list()
    }

    def show() {
        respond Ticket.get(params.id)
    }
}
