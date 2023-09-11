package com.irving.preferences

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnSave)
        val etName = findViewById<EditText>(R.id.editTextNombre)
        val etPhone = findViewById<EditText>(R.id.editTextPhone)
        val tvName = findViewById<TextView>(R.id.textName)
        val tvPhone = findViewById<TextView>(R.id.textPhone)

        var userInformation = getSharedPreferences("userPrefs", MODE_PRIVATE)

        btn.setOnClickListener {
            val prefeditor:SharedPreferences.Editor = userInformation.edit()
            prefeditor.putString("name",etName.text.toString())
            prefeditor.putString("phone",etPhone.text.toString())
            prefeditor.commit()

            var un: String? = userInformation.getString("name","XXX")
            var phone: String? = userInformation.getString("phone","XXX")

            tvName.setText(un)
            tvPhone.setText(phone)
        }
    }
}