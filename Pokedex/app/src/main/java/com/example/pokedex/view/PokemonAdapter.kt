package com.example.pokedex.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.Pools.Pool
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokedex.R
import com.example.pokedex.databinding.ActivityMainBinding
import com.example.pokedex.databinding.PokemonItemBinding
import com.example.pokedex.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon?>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: PokemonItemBinding
    ): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PokemonItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        bind(item,holder)
    }
    private fun bind (item:Pokemon?, holder:ViewHolder){
        holder.binding.run {
            Glide.with(root.context).load(item?.imageURL).into(ivPokemon)
                val typeSize = item?.types?.size ?:0
                tvNumber.text = "N° ${item?.formattedNumber}"
                tvName.text = item?.name
                tvType1.text = item?.types?.get(0)?.name


                if (typeSize > 1) {
                    tvType2.visibility = View.VISIBLE
                    tvType2.text = item?.types?.get(0)?.name
                } else {
                    tvType2.visibility = View.GONE
                }
        }
    }
}