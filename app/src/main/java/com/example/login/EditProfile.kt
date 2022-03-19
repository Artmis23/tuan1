package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        val btnSave = this.findViewById<Button>(R.id.btn_save)
        btnSave.setOnClickListener {
            val edtname = findViewById<EditText>(R.id.edtname)
            val edtemail = findViewById<EditText>(R.id.edit_email)
            val edtsdt = findViewById<EditText>(R.id.edit_sdt)
            val name = edtname.getText().toString()
            val email = edtemail.getText().toString()
            val sdt = edtsdt.getText().toString()
            val intent = Intent(this, Profile::class.java)
            val bundle = Bundle()
            bundle.putString("name",name)
            bundle.putString("email",email)
            bundle.putString("sdt",sdt)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}