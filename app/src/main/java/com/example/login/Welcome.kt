package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.login.R

class Welcome : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }
}