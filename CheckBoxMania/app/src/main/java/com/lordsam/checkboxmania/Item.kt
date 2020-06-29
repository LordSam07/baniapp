package com.lordsam.checkboxmania

class Item {
    var itemName = ""
    var itemPrize = 0
    var itemSize = 0
    var totalAmount = 0

    constructor(itemName :String, itemPrize :Int, itemSize :Int, totalAmount :Int){
        this.itemName = itemName
        this.itemPrize = itemPrize
        this.itemSize = itemSize
        this.totalAmount = totalAmount
    }

    constructor()

}