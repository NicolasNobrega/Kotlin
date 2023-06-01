package com.example.increment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.increment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.button.setOnClickListener{
            viewBinding.title.text = viewBinding.NameText.text

            startActivity(resultIntent())
        }
    }
//sempre que criar uma nova activity verifique e a mesma aparece nos manifests
    private fun resultIntent() : Intent {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra(ResultActivity.ARG_NAME, viewBinding.NameText.text.toString())
        return intent

    }
}