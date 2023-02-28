package com.example.calculomonetario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById<TextView>(R.id.txt_result)

        val buttonConverter = findViewById<Button>(R.id.btn_converter)

        buttonConverter.setOnClickListener {
            result.text = "novo Texto"
            result.visibility = View.VISIBLE
        }
    }
}