package com.example.pokedex.domain

data class Pokemon (
    val imageURL: String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
        )
