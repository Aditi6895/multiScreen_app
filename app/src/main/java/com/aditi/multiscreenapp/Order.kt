package com.aditi.multiscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditi.multiscreenapp.MainActivity.Companion.KEY
import kotlinx.android.synthetic.main.activity_order.*

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCostumers= intent.getShortExtra(MainActivity.KEY)
        tvOrder.text= "Orders Placed" + ordersOfCostumers.toString()
    }
}





