package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.login.R
import android.content.Intent
import android.view.View
import com.example.login.Login
import com.example.login.SignUp
import android.widget.Toast

class SignUp : AppCompatActivity(), View.OnClickListener {
    private var edtFullName: EditText? = null
    private var edtEmail: EditText? = null
    private var edtPassWord: EditText? = null
    private var login: TextView? = null
    private var txtLogin: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        edtFullName = findViewById<View>(R.id.edtFullName) as EditText
        edtEmail = findViewById<View>(R.id.edtEmail) as EditText
        edtPassWord = findViewById<View>(R.id.edtPassWord) as EditText
        login = findViewById<View>(R.id.login) as TextView
        login!!.setOnClickListener(this)
        txtLogin = findViewById<View>(R.id.txtLogin) as TextView
        txtLogin!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.txtLogin -> {
                val intent2 = Intent(this@SignUp, Login::class.java)
                intent2.flags = (Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent2)
                finish()
            }
            R.id.login -> registerUser()
        }
    }

    private fun registerUser() {
        val name = edtFullName!!.text.toString().trim { it <= ' ' }
        val email = edtEmail!!.text.toString().trim { it <= ' ' }
        val pass = edtPassWord!!.text.toString().trim { it <= ' ' }
        if (name.isEmpty()) {
            edtFullName!!.error = "Name is reqired!"
            edtFullName!!.requestFocus()
            return
        }
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
            Toast.makeText(this@SignUp, "Email is invalid", Toast.LENGTH_LONG).show()
            return
        }
        if (pass != PASS) {
            Toast.makeText(this@SignUp, "pass is invalid", Toast.LENGTH_LONG).show()
            return
        } else {
            val intent = Intent(this@SignUp, Login::class.java)
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