package com.example.appmad

import android.provider.ContactsContract.CommonDataKinds.Phone

class `BillingDetails` {

    var firstname: String?=null
    var secondname: String?=null
    var strtaddress: String?=null
    var city: String?=null
    var postalcode: String?=null
    var phonenum: String?=null
    var email: String?=null
    var notes: String?=null

    constructor(firstname: String?, secondname: String?,strtaddress: String?,city: String?,
                postalcode: String?,phonenum: String?,email: String?,notes: String?, ){
        this.firstname = firstname
        this.secondname = secondname
        this.strtaddress = strtaddress
        this.city = city
        this.postalcode = postalcode
        this.phonenum = phonenum
        this.email = email
        this.notes = notes
    }
}