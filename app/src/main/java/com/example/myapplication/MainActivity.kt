package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
     var price: Double = 0.0
    var date: String?=""
    var itemname:String?=""
    var productname:Product.MyItem? =null
    lateinit var pricetxt :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pricetxt = findViewById(R.id.txt_id)


        var itemlist =  ArrayList<Product>()
        var itemlist2 =  ArrayList<Product>()
        itemlist.add(Product("10212023",Product.MyItem.Popcorn.toString(),8.0))
        itemlist.add(Product("10212023",Product.MyItem.Soda.toString(),2.5))
        itemlist.add(Product("10222023",Product.MyItem.Popcorn.toString(),8.0))
        itemlist.add(Product("10222023",Product.MyItem.Popcorn.toString(),8.0))
        itemlist.add(Product("10232023",Product.MyItem.Chips.toString(),7.0))
        itemlist.add(Product("10232023",Product.MyItem.Soda.toString(),2.5))
        itemlist.add(Product("10242023",Product.MyItem.Chips.toString(),7.0))
        itemlist.add(Product("10242023",Product.MyItem.Chips.toString(),7.0))
        itemlist.add(Product("10252023",Product.MyItem.Chips.toString(),7.0))

        for (i in itemlist)
        {
            var existingElement: Product? = null
            for (j in itemlist2)
            {
                if (j.date.equals(i.date)) {
                    existingElement = j
                    break
                }
            }
            if (existingElement == null)
            {
                itemlist2.add(i)
            } else
            {
                if (existingElement?.item?.equals(Product.MyItem.Soda.toString())!! && i?.item?.equals(Product.MyItem.Popcorn.toString())!! ||
                    existingElement?.item?.equals(Product.MyItem.Popcorn.toString())!! && i?.item?.equals(Product.MyItem.Soda.toString())!! ){
                    existingElement.setAmount(9.0)
                    existingElement.setItemName(existingElement?.getItemName()+" "+i?.getItemName())
                }
                else {
                    existingElement.setAmount(existingElement.getAmount()?.plus(i?.getAmount()!!)!!)
                    existingElement.setItemName(existingElement?.getItemName()+" "+i?.getItemName())
                }
            }
        }
        for (k in 0 until  itemlist2?.size!!){
            Log.d("amount , item and date",itemlist2?.get(k)?.price.toString()+" "+
                    itemlist2?.get(k)?.item.toString()+" "+itemlist2?.get(k)?.date.toString())
        }


        /*  for (i in 0 until itemlist?.size!!){
            for (j in i+1 until itemlist?.size!!){
                if (itemlist?.get(i)?.date?.equals(itemlist?.get(j)?.date) == true){
                    if (itemlist?.get(i)?.item?.equals(Product.MyItem.Soda)!! && itemlist?.get(j)?.item?.equals(Product.MyItem.Popcorn)!! ||
                        itemlist?.get(i)?.item?.equals(Product.MyItem.Popcorn)!! && itemlist?.get(j)?.item?.equals(Product.MyItem.Soda)!!){
                       price = 9.0
                        date = itemlist?.get(i)?.date
                        itemname = itemlist?.get(i)?.item.toString() + " " +itemlist?.get(j)?.item.toString()
                        itemlist2?.add(Product(date.toString(),itemname.toString(),price))
                        Log.e("amount , item and date",price.toString()+" "+itemname+" "+date)
                    }
                    else {
                        date = itemlist?.get(i)?.date
                        price = itemlist?.get(i)?.price?.plus(itemlist.get(j)?.price!!)!!
                        itemname = itemlist?.get(i)?.item.toString() + " " + itemlist?.get(j)?.item.toString()
                        itemlist2?.add(Product(date.toString(),itemname.toString(),price))
                        Log.e("amount , item and date",price.toString()+" "+itemname+" "+date)
                    }

                }


            }
        }
        for (k in 0 until  itemlist2?.size!!){
            Log.d("amount , item and date",itemlist2?.get(k)?.price.toString()+" "+
                    itemlist2?.get(k)?.item.toString()+" "+itemlist2?.get(k)?.date.toString())
        }*/

       /* for (i in 0 until itemlist.size) {
            var amt = 0.0
            val date1: String = itemlist.get(i).date
            val item: Product.MyItem = itemlist.get(i).item
            for (j in i + 1 until itemlist.size) {
                amt = if (date1.equals(itemlist.get(j).date)) {
                    amt + itemlist.get(j).price + itemlist.get(i).price
                } else {
                    itemlist.get(i).price
                }
            }
           // list1.add(DD_Details(date1, amt))
            Log.e("item and price",date1+" "+amt+" "+item)
        }*/


        //itemlist.add(Product("2",Product.MyItem.Popcorn,8.0))

     /*   for (i in 0 until itemlist.size) {
            for (j in i + 1 until itemlist.size) {
                if (itemlist.get(i)?.date?.equals(itemlist?.get(j)?.date)!!) {
                    System.out.println("item & price  " + itemlist.get(j)?.date+" "+itemlist.get(j)?.price)

//                    System.out.println("item: " + itemlist.get(i)?.item)
//                    System.out.println("price: " + itemlist.get(i)?.price)
                   *//* val finalprice = itemlist?.get(i)?.price?.plus(itemlist?.get(j)?.price!!)
                    System.out.println("Date" + itemlist.get(i)?.date)
                    System.out.println("item: " + itemlist.get(i)?.item)
                    System.out.println("Total Price" + finalprice)*//*
                }
            *//*    else{
                    val finalprice = itemlist?.get(i)?.price
                    System.out.println("Date" + itemlist.get(i)?.date)
                    System.out.println("item: " + itemlist.get(i)?.item)
                    System.out.println("Total Price" + finalprice)
                }
                if (itemlist.get(i)?.date?.equals(itemlist?.get(j)?.date)!! && itemlist?.get(i)?.item?.equals(Product.MyItem.Soda)!!) {
                    val finalprice = itemlist?.get(i)?.price?.plus(itemlist?.get(j)?.price!!)
                    System.out.println("Date" + itemlist.get(i)?.date)
                    System.out.println("item: " + itemlist.get(i)?.item)
                    System.out.println("Total Price" + finalprice)
                }
                else{
                    val finalprice = itemlist?.get(i)?.price
                    System.out.println("Date" + itemlist.get(i)?.date)
                    System.out.println("item: " + itemlist.get(i)?.item)
                    System.out.println("Total Price" + finalprice)
                }*//*
            }
        }*/

        /* val list: List<Product> = listOf(Product("10212023",Product.MyItem.Popcorn),Product("10212023",Product.MyItem.Soda),
            Product("10222023",Product.MyItem.Popcorn))
        list.forEach{
          *//*  if (it.date.equals("10212023") ){
                if (it.item.equals(Product.MyItem.Soda)){
                    price = 2.5
                    Log.e("soda price",price.toString())
                    //pricetxt?.setText(price.toString())
                }
                if (it.item.equals(Product.MyItem.Popcorn)){
                    price = 8.0
                    Log.e("popcorn price",price.toString())
                }
               // finalprice = 9.0

              *//**//*  if (it.item.equals(Product.MyItem.Soda) && it.item.equals(Product.MyItem.Popcorn)){
                    price = 9.0
                }*//**//*
               // pricetxt?.setText(price.toString())
                finalprice = 9.0
                //Log.e("price & date ",finalprice.toString()+" "+it.date)

            }
           else if (it.date.equals("10222023") ){
               price = 0.0
                finalprice = 0.0
                if (it.item.equals(Product.MyItem.Soda)){
                    price = 2.5
                }
                if (it.item.equals(Product.MyItem.Popcorn)){
                    price = 8.0
                }
               *//**//* if (it.item.equals(Product.MyItem.Soda) && it.item.equals(Product.MyItem.Popcorn)){
                    price = 9.0
                }*//**//*
               // pricetxt?.setText(price.toString())
                //Log.e("price",price.toString())
                finalprice+=price
                //Log.e("price & date ",finalprice.toString()+" "+it.date)
            }
            Log.e("price & date ",finalprice.toString()+" "+it.date)*//*
            if (it.date.equals("10212023") && it.item.equals(Product.MyItem.Soda))
            {
                price = 2.5
                Log.e("price ", price.toString())
            }
            if (it.date.equals("10212023") && it.item.equals(Product.MyItem.Popcorn))
            {
                price = 8.0
                Log.e("price ", price.toString())
            }

        }
*/





    }
}