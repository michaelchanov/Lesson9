package com.michaelchanov.lesson9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf("You are beautiful!", "You are cool!",
        "You are kind!", "You are loved!", "God is pleased with you! ")
        tv_counter.text = list.random()

        btn_counter.setOnClickListener {
            tv_counter.text = list.random()
        }
    }
}