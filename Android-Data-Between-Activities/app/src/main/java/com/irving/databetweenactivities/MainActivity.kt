package com.irving.databetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnId = findViewById<Button>(R.id.btnId)
        val editText = findViewById<EditText>(R.id.editTextText)
        btnId.setOnClickListener {
            var data = editText.text.toString()
            intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("userdata",data)
            startActivity(intent)
        }
    }
}