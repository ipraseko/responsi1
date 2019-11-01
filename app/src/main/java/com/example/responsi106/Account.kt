package com.example.responsi106

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.responsi202.R
import kotlinx.android.synthetic.main.activity_account.*

class Account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        var intent = getIntent();
        val username = intent.getStringExtra("Username")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text =
            "Username : " + username
        btn_back.setOnClickListener() {
            intent = Intent(this@Account, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
