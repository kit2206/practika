package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var counter = 0
    private var buttonClicked = false // Флаг для отслеживания первого нажатия
    private lateinit var counterTextView: TextView
    private lateinit var counterButton: Button

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        counterTextView = findViewById(R.id.text_like)
        counterButton = findViewById(R.id.button_like)

        counterButton.setOnClickListener {
            if (!buttonClicked) {
                counterButton.setBackgroundColor(getColor(R.color.liked))
                buttonClicked = true
            }
            counter++
            counterTextView.text = counter.toString()
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Sample data
        val examList: MutableList<ExamItem> = ArrayList()
        examList.add(
            ExamItem(
                "Math Exam",
                "May 23, 2015",
                "Best of Luck",
                R.drawable._99,
                R.drawable.wmlgoeixx4wqo316ykpiawszwcnal2mr6sfvvmz0gbmgyidrxfoavhd3l1ycahdwucv09b3ykpycbsfarpqf1b_f9e2hveny_htrns5nqw8uuksb2tb1_eiwzuuusebudgegh2ekuz0ujeh8ixhf7e52qkzc7j7tudrugdgunzjd7egr_zcgvqayhm10xwlvn3593upcq8hwlrnmg6
            )
        )
        examList.add(
            ExamItem(
                "Science Exam",
                "June 10, 2015",
                "Do Well",
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher111_foreground
            )
        )
        examList.add(
            ExamItem(
                "History Exam",
                "July 15, 2015",
                "All the Best",
                R.drawable.ic_launcher11_foreground,
                R.drawable.ic_launcher1111_foreground
            )
        )
        examList.add(
            ExamItem(
                "English Exam",
                "August 1, 2015",
                "Stay Confident",
                R.drawable._1,
                R.drawable._99
            )
        )

        // Set LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set Adapter
        val adapter = MyAdapter(examList)
        recyclerView.adapter = adapter


        val button = findViewById<Button>(R.id.buttonA)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }



    }
}














