package com.irving.databetweenactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        var textView = findViewById<TextView>(R.id.textView)
        val bundle: Bundle? = intent.extras
        val id = bundle?.get("userdata")

        textView.text = id.toString()

        val btnId2 = findViewById<Button>(R.id.btnId2)
        btnId2.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}