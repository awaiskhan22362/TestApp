package com.example.myapplication


class Product(val date:String, var item : String, var price:Double) {
    enum class MyItem {
     Soda,
        Popcorn,
        Chips
    }

    fun setAmount(amount: Double) {
        price = amount
    }
    fun getAmount(): Double? {
        return price
    }

    fun setItemName(items: String) {
        item = items
    }
    fun getItemName(): String? {
        return item
    }

}

