package com.example.lesson_13

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity() {
    private var btnHome: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actyvity_third)
        btnHome = findViewById(R.id.btnHome)
        setOnclickListernes()
    }

    private  fun setOnclickListernes(){
        btnHome?.setOnClickListener {
            val intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}