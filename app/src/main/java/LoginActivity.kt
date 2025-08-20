package com.example.utsapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtUsername: EditText = findViewById(R.id.edtUsername)
        val edtPassword: EditText = findViewById(R.id.edtPassword)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val txtRegister: TextView = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {

            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

        txtRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
