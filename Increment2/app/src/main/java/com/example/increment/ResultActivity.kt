package com.example.increment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.increment.databinding.ActivityResultBinding

class ResultActivity :AppCompatActivity() {

    private lateinit var viewBinding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityResultBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
    }
}