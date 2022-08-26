package com.example.fastcampus

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.net.URL

class Intent_One : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_one)

        // 암시적 인텐트
        // - 전화, SMS, Google Play Store, WebSite, Google Map, 사진첩 등등
        //  - 상수
        //      - 변하지 않는 수(문자)
        //      - 상수의 변수명은 모두 대문자로 만드는 문화가 있다
        // - URI (Uniform Resource Indentifier)
        //      - id라고 생각하면 된다 -> 고유하다
        //      - 자원을 나타내는 주소
        //      - URL
        //          - 인터넷 페이지의 고유한 주소
        val implicit_intent: TextView = findViewById(R.id.implicit_intent)
        implicit_intent.setOnClickListener {
            val intent: Intent = Intent(
                Intent.ACTION_DIAL, Uri.parse("telL" + "010-111-1111")
            )
            startActivity(intent)
        }

        // 명시적 인텐트 + ComponentName -> 엑티비티 전환
        val intent_one: TextView = findViewById(R.id.intent_one)
        intent_one.setOnClickListener {
            val intent: Intent = Intent()
            val componentName: ComponentName = ComponentName(
                "com.example.fastcampus",
                "com.example.fastcampus.Intent_Two"
            )
            intent.component = componentName
            startActivity(intent)
        }

        // 명시적 인텐트 -> 엑티비티 전환
        // Context
        // - 문맥
        // A엑티비티 -> B엑테비티
        (findViewById<TextView>(R.id.intent_two)).apply {
            this.setOnClickListener {
                startActivity(
                    Intent(this@Intent_One, Intent_Two::class.java)
                )
            }
        }
        // 명시적 인텐트 + data 전달
        (findViewById<TextView>(R.id.intent_two)).apply {
            this.setOnClickListener {
                val Intent = Intent(this@Intent_One, Intent_Two::class.java)
                intent.putExtra("extra-data", "data-one")
                startActivity(intent)
            }
        }
    }
}