package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val button1 = findViewById<Button>(R.id.buttonEdit2)
        button1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }


        val button = findViewById<Button>(R.id.buttonAA)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
        val jsonReader = JsonReader(this) // this - контекст активности
        val myData = jsonReader.readJsonData("data.json")

        if (myData != null) {
            Log.d("JSON Data", "Name: ${myData.name}, Age: ${myData.age}, City: ${myData.city}")
            // Используйте данные myData
        } else {
            Log.e("JSON Data", "Error reading JSON data")
        }

    }



    }
