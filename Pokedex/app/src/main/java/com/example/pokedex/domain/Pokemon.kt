package com.example.pokedex.domain

data class Pokemon(
    val imageURL: String? = null,
    val number: Int? = null,
    val name: String,
    val url: String,
    val types: List<PokemonType>? = null
) {
    val formattedNumber = number.toString().padStart(3, '0')
}
