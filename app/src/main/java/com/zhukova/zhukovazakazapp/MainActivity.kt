package com.zhukova.zhukovazakazapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization);

        val btnStarter = findViewById<Button>(R.id.btnStarter)
        btnStarter.setOnClickListener {
            val authPhoneNumb = findViewById<EditText>(R.id.etAuthPhoneNumb)
            val intent = Intent(this, KorzinaZakaza::class.java)
            intent.putExtra("phone", String.format("Phone Number is %s",authPhoneNumb.text.toString()))
            startActivity(intent)
        }
    }

}
