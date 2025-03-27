package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    private var counter = 0
    private lateinit var textViewCounter: TextView
    private lateinit var buttonIncrement: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        textViewCounter = findViewById(R.id.Tlike)
        buttonIncrement = findViewById(R.id.Blike)


        buttonIncrement.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }

        val button = findViewById<Button>(R.id.button22)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }
    }
}
