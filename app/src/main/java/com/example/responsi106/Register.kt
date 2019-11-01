package com.example.responsi106

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.responsi202.MainActivity
import com.example.responsi202.R
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val text_name = findViewById<EditText>(R.id.text_name)
        val text_password = findViewById<EditText>(R.id.text_password)
        val proses = findViewById<Button>(R.id.btn_register)
        val pindah = findViewById<Button>(R.id.btn_log)

        btn_register.setOnClickListener() {
            val text_name = text_name.text.toString()
            val text_password = text_password.text.toString()

            intent = Intent(this@Register, Account::class.java)
            intent.putExtra("Username", text_name)
            intent.putExtra("Password", text_password)
            startActivity(intent)
        }
        btn_log.setOnClickListener() {
            intent = Intent(this@Register, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
