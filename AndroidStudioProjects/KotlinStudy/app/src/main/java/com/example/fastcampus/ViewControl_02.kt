package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ViewControl_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control02)

        // 뷰를 코틀린 파일(Activity)로 가져오는 방법
        val textViewOne: TextView = findViewById(R.id.textViewOne)
        val buttonOne: Button = findViewById(R.id.buttonOne)
        Log.d("test", textViewOne.text.toString())

        // Listener 사용 방법
        buttonOne.setOnClickListener {
            // 버튼이 클릭되었을때 동작할 코드
            Log.d("test", "버튼 클릭!!")
        }
    }
}