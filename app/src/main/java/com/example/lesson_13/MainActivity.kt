package com.example.lesson_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//Темы занятия Activity, Навигация между activity, Intent

class MainActivity : AppCompatActivity() {

    private var btnNavigationSecondScreen: Button? = null
    private var btnNavigationThirdScreen: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNavigationSecondScreen = findViewById(R.id.btnNavigationSecondScreen)
        btnNavigationThirdScreen = findViewById(R.id.btnNavigationThirdScreen)

        setOnclickListernes()
    }
    private  fun setOnclickListernes(){
        btnNavigationSecondScreen?.setOnClickListener {
            val intent = Intent(this, SecondActivity:: class.java)
            startActivity(intent)
        }
        btnNavigationThirdScreen?.setOnClickListener{
            val intent = Intent(this, ThirdActivity:: class.java)
            startActivity(intent)
        }
    }
}