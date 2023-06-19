package com.aditi.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    //creating key
    companion object {
        const val KEY = "com.aditi.com.aditi.multiscreenapp.MainActivity.KEY"
    }

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnOrder.setOnClickListener {
                val ordersPlaced =
                    editText1.text.toString() + " " + editText2.text.toString() + " " + editText3.text.toString() + " " + editText4.text.toString()
                intent = Intent(this, Order::class.java)
                intent.putExtra(KEY, ordersPlaced)
                startActivity(intent)
            }
        }
    }
}