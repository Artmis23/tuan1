package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.login.R
import android.content.Intent
import android.view.View
import com.example.login.SignUp
import com.example.login.Login
import android.widget.Toast

class Login : AppCompatActivity(), View.OnClickListener {
    private var edtEmail: EditText? = null
    private var edtPassWord: EditText? = null
    private var btnLogin: TextView? = null
    private var txtSignUp: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtEmail = findViewById<View>(R.id.edtEmail) as EditText
        edtPassWord = findViewById<View>(R.id.edtPassWord) as EditText
        btnLogin = findViewById<View>(R.id.btnLogin) as TextView
        btnLogin!!.setOnClickListener(this)
        txtSignUp = findViewById<View>(R.id.txtSignUp) as TextView
        txtSignUp!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.txtSignUp -> {
                val intent2 = Intent(this@Login, SignUp::class.java)
                intent2.flags = (Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent2)
                finish()
            }
            R.id.btnLogin -> LoginUser()
        }
    }

    private fun LoginUser() {
        val email = edtEmail!!.text.toString().trim { it <= ' ' }
        val pass = edtPassWord!!.text.toString().trim { it <= ' ' }
        if (email.isEmpty()) {
            edtEmail!!.error = "Email is reqired!"
            edtEmail!!.requestFocus()
            return
        }
        if (pass.isEmpty()) {
            edtPassWord!!.error = "Pass is reqired!"
            edtPassWord!!.requestFocus()
            return
        }
        if (email != EMAIL) {
            Toast.makeText(this@Login, "Email is invalid", Toast.LENGTH_LONG).show()
            return
        }
        if (pass != PASS) {
            Toast.makeText(this@Login, "pass is invalid", Toast.LENGTH_LONG).show()
            return
        } else {
            val intent = Intent(this@Login, Profile::class.java)
            intent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }

    companion object {
        private const val EMAIL = "ronaldo@gmail.com"
        private const val PASS = "123456"
    }
}