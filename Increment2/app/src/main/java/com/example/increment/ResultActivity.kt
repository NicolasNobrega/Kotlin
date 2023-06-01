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

        //o ? limita a nulo isto é "Só vai ser executado quando não for nulo"
        // como o Extra logo a baixo, isso previne o erro NullPointerExeption
        //Pois estariamos usando algo nullo
        val name = intent.extras?.getString(ARG_NAME, "Nenhum Valor Informado")

        viewBinding.title.text = name
    }

    companion object {
        const val ARG_NAME = "ARG_NAME"
    }
}