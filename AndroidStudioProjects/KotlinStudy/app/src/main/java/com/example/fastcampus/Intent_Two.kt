package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Intent_Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_two)

        // Intent_One -> Intent_Two
        // Intent_Two 엑티비티를 호출한 Activity의 Intent 이다
        val intent = intent
        val data: String? = intent.extras?.getString("extra-data")
        if(data != null) {
            Log.d("dataa", data)
        }
    }
}