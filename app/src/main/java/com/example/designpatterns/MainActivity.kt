package com.example.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.designpatterns.builder.Burger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Builder
        val burger = Burger.Builder().cheese(true).beef(true).chicken(true).butter(false).build()



    }
}