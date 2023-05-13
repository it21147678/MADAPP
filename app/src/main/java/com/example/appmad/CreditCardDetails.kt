package com.example.appmad

class `CreditCardDetails` {

    var cardName: String?=null
    var cardNum: String?=null
    var date: String?=null
    var cvv: String?=null

    constructor(cardName: String?, cardNum: String?, date: String?, cvv: String?) {
        this.cardName = cardName
        this.cardNum = cardNum
        this.date = date
        this.cvv = cvv
    }
}