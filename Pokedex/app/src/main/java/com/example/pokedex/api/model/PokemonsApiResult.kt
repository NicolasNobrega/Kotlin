package com.example.pokedex.api.model

data class PokemonsApiResult (
        val count: Int,
        val next: String?,
        val previus: String?,
        val result:List<PokemonResult>
        )
data class PokemonResult (
    val name: String,
    val url: String
        )