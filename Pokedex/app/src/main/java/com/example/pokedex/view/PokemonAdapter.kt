package com.example.pokedex.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokedex.R
import com.example.pokedex.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon?>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bindView(item: Pokemon?) = with(itemView) {
//            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
//            val tvNumber = findViewById<TextView>(R.id.tvNumber)
//            val tvName = findViewById<TextView>(R.id.tvName)
//            val tvType1 = findViewById<TextView>(R.id.tvType1)
//            val tvType2 = findViewById<TextView>(R.id.tvType2)
//
//            //TODO: Load image with Glide
//
//            item?.let{
//
//                Glide.with(itemView.context).load(it.imageURL).into(ivPokemon)
//
//                tvNumber.text = "N° ${item.formattedNumber}"
//                tvName.text = item.name
//                tvType1.text = item.types[0].name
//
//                if (item.types.size > 1) {
//                    tvType2.visibility = View.VISIBLE
//                    tvType2.text = item.types[1].name
//                } else {
//                    tvType2.visibility = View.GONE
//                }
//            }
//        }
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }
}