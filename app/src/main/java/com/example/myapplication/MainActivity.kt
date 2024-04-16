package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
     var price: Double = 0.0
    var date: String?=""
    var itemname:String?=""
    lateinit var pricetxt :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pricetxt = findViewById(R.id.txt_id)


        var itemlist =  ArrayList<Product>()
        itemlist.add(Product("10212023",Product.MyItem.Popcorn,8.0))
        itemlist.add(Product("10212023",Product.MyItem.Soda,2.5))
        itemlist.add(Product("10222023",Product.MyItem.Popcorn,8.0))
        itemlist.add(Product("10222023",Product.MyItem.Popcorn,8.0))
        //itemlist.add(Product("10232023",Product.MyItem.Soda,2.5))

        for (i in 0 until itemlist?.size!!){
            for (j in i+1 until itemlist?.size!!){
                if (itemlist?.get(i)?.date?.equals(itemlist?.get(j)?.date) == true){
                    if (itemlist?.get(i)?.item?.equals(Product.MyItem.Soda)!! && itemlist?.get(j)?.item?.equals(Product.MyItem.Popcorn)!! ||
                        itemlist?.get(i)?.item?.equals(Product.MyItem.Popcorn)!! && itemlist?.get(j)?.item?.equals(Product.MyItem.Soda)!!){
                       price = 9.0
                        date = itemlist?.get(i)?.date
                        itemname = itemlist?.get(i)?.item.toString() + " " +itemlist?.get(j)?.item.toString()
                        Log.e("amount , item and date",price.toString()+" "+itemname+" "+date)
                    }
                    else {
                        date = itemlist?.get(i)?.date
                        price = itemlist?.get(i)?.price?.plus(itemlist.get(j)?.price!!)!!
                        itemname = itemlist?.get(i)?.item.toString() + " " + itemlist?.get(j)?.item.toString()
                        Log.e("amount , item and date",price.toString()+" "+itemname+" "+date)
                    }

                }


            }
        }

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