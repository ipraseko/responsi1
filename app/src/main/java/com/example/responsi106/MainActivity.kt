package com.example.responsi106

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.responsi106.Hom
import com.example.responsi106.Register
import com.example.responsi202.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener() {
            val Email = txt_username.text.toString()
            val password = txt_password.text.toString()

            val email_anda = intent.getStringExtra("email_anda")
            val password_anda = intent.getStringExtra("password_anda")

            if (Email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon Massukan Username dan Password Anda", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener


            }
            if (Email != "kds.imam99@gmail.com") {
                Toast.makeText(this, "Email Anda Salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else
                if (password != "imam") {
                    Toast.makeText(this, "Password Anda Salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener

                }
            intent = Intent(this, Hom::class.java)
            intent.putExtra("email_anda", email_anda)
            intent.putExtra("password_anda", password_anda)

            intent.putExtra("email", Email)
            intent.putExtra("pass", password)
            startActivity(intent)
        }
        txt_register.setOnClickListener() {
            intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }
    }
}