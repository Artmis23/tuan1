package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class OnboardingThree : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)
        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, Splash::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }

}
