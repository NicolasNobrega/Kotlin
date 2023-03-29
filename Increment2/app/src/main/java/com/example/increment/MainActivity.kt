package com.example.increment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleTextView = findViewById<TextView>(R.id.title)
        val textButton = findViewById<Button>(R.id.button)
        textButton.setOnClickListener{
            number++
            titleTextView.text = "Number: $number"
        }
    }
}