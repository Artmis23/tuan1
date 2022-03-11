package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class SignUp : AppCompatActivity() {
    var txtLogin: TextView? = null
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, Verification_Code::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

//    private fun initView() {
//        txtLogin = findViewById(R.id.txtLogin)
//        txtLogin?.setOnClickListener {
//            val intent = Intent(applicationContext, Login::class.java)
//            startActivity(intent)
//            finish()
//        }
//    }
}