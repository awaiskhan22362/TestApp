package com.example.myapplication


class Product(val date:String, val item : MyItem, var price:Double) {
    enum class MyItem {
     Soda,
        Popcorn
    }

    fun setAmount(amount: Double) {
        price = amount
    }

}

