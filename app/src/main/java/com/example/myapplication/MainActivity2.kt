package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



            val editText = findViewById<EditText>(R.id.editTextText)
            val button = findViewById<Button>(R.id.buttonB)

            button.setOnClickListener()
            {
                editText.visibility = View.GONE
                //editText.text.clear() // Это очистит EditText
                // Group.VISIBLE = View.GONE
                // Group.VISIBLE = View.INVISIBLE
                //editText.setText("")
            }

        }
    }
