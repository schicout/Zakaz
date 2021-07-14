package com.zhukova.zhukovazakazapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KorzinaZakaza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korzina_zakaza)
        val tvPhoneNumb = findViewById<TextView>(R.id.tvPhoneNumber)
        tvPhoneNumb.text = intent.getStringExtra("phone")
    }
}