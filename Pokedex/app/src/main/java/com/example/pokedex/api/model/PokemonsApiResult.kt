package com.example.pokedex.api.model

import com.example.pokedex.domain.Pokemon
import com.example.pokedex.domain.PokemonType

data class PokemonsApiResult (
        val count: Int,
        val next: String?,
        val previus: String?,
        val results:List<Pokemon>
        )
data class PokemonResult (
    val name: String,
    val url: String
    )
data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot
)

data class PokemonTypeSlot (
    val slot: Int,
    val type: PokemonType
        )
