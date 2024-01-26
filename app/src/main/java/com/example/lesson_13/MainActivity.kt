package com.example.lesson_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Button

//Темы занятия Activity, Навигация между activity, Intent

class MainActivity : AppCompatActivity() {

    private var btnFirstActivity: Button? = null
    private var btnSecondActivity: Button? = null
    private var btnThirdActivity: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFirstActivity = findViewById(R.id.btnFirstActivity)
        btnSecondActivity = findViewById(R.id.btnSecondActivity)
        btnThirdActivity = findViewById(R.id.btnThirdActivity)

        setOnclickListernes()
    }
    private  fun setOnclickListernes(){
        btnFirstActivity?.setOnClickListener {
            var intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
        btnSecondActivity?.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnThirdActivity?.setOnClickListener {
            var intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}