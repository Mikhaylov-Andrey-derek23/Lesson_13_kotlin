package com.example.lesson_13

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {
    private var btnNavigationFirstScreen: Button? = null
    private var btnNavigationSecondScreen: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actyvity_third)
        btnNavigationSecondScreen = findViewById(R.id.btnNavigationSecondScreen)
        btnNavigationFirstScreen = findViewById(R.id.btnNavigationFirstScreen)
        setOnclickListernes()
    }

    private  fun setOnclickListernes(){
        btnNavigationFirstScreen?.setOnClickListener {
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        btnNavigationSecondScreen?.setOnClickListener{
            val intent = Intent(this, SecondActivity:: class.java)
            startActivity(intent)
        }
    }
}