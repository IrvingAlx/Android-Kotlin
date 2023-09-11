package com.irving.savinginternalstorage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val et = findViewById<EditText>(R.id.editTextText)

        btn.setOnClickListener(){
            val FILENAME:String = "test_file"
            val dataToSave:String = et.text.toString()


            val fos:FileOutputStream = openFileOutput(FILENAME,Context.MODE_PRIVATE)
            fos.write(dataToSave.toByteArray())
            fos.close()
        }
    }
}