package com.example.increment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewbinding.ViewBinding
import com.example.increment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var number = 0

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.textButton.setOnClickListener{
            number++
            viewBinding.title.text = "Number: $number"
        }
    }
}