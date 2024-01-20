package com.example.lesson_13

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    private var btnNavigationFirstScreen: Button? = null
    private var btnNavigationThirdScreen: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnNavigationFirstScreen = findViewById(R.id.btnNavigationFirstScreen)
        btnNavigationThirdScreen = findViewById(R.id.btnNavigationThirdScreen)
        setOnclickListernes()
    }
    private  fun setOnclickListernes(){
        btnNavigationFirstScreen?.setOnClickListener {
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
        btnNavigationThirdScreen?.setOnClickListener{
            val intent = Intent(this, ThirdActivity:: class.java)
            startActivity(intent)
        }
    }
}