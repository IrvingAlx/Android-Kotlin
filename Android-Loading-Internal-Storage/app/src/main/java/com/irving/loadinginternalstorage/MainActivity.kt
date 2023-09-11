package com.irving.loadinginternalstorage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val et = findViewById<EditText>(R.id.editTextText)
        val tx = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener() {
            val FILENAME: String = "test_file"
            val dataToSave: String = et.text.toString()
            val fos: FileOutputStream = openFileOutput(FILENAME, Context.MODE_PRIVATE)
            fos.write(dataToSave.toByteArray())
            fos.close()

        }
        btn2.setOnClickListener(){
            val eol:String = System.lineSeparator()
            var input:BufferedReader? = null

            input = BufferedReader(InputStreamReader(openFileInput("test_file")))
            var line:String
            val builder = StringBuilder()
            line = input.readLine()
            builder.append(line+eol)
            tx.text = builder.toString()
        }
    }
}