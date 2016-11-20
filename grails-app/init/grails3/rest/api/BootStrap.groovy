package grails3.rest.api

class BootStrap {

    def init = { servletContext ->
        new Payment(id: 1, name: "purchase", amount: 12D).save()
        new Payment(id: 2, name: "invoice", amount: 120D).save()
        new Payment(id: 3, name: "taxes", amount: 100D).save()

        new User(id: 1, name: "Hulk", lastName: "Hogan")
                .addToPurchase(new Purchase(id: 1, amount: 10D))
                .addToPurchase(new Purchase(id: 2, amount: 20D))
        .save()
    }

    def destroy = {
    }
}
