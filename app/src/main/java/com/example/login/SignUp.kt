package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.login.R
import android.content.Intent
import android.os.Handler
import android.view.View
import com.example.login.Login
import com.example.login.SignUp
import android.widget.Toast

class SignUp : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }
}