package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog



class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btn_edt = findViewById<Button>(R.id.btn_edtProfile)
        btn_edt.setOnClickListener {
            val intent = Intent(this,EditProfile::class.java)
            startActivity(intent)
        }

    }
    override fun onResume() {
        super.onResume()
        val bundle = intent.extras
        bundle?.let {
            val name = it.getString("name")
            val email = it.getString("email")
            val sdt = it.getString("sdt")
            val edtname = findViewById<TextView>(R.id.edtname)
            val edtemail = findViewById<TextView>(R.id.edit_email)
            val edtsdt = findViewById<TextView>(R.id.edit_sdt)
            val user = findViewById<TextView>(R.id.user)
            edtname.setText("$name")
            edtemail.setText("$email")
            edtsdt.setText("$sdt")
            user.setText("$name")

        }
    }
}