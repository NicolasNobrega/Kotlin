package com.example.pokedex.api

import android.util.Log
import com.example.pokedex.api.model.PokemonApiResult
import com.example.pokedex.api.model.PokemonsApiResult
import com.example.pokedex.core.Constants
import com.example.pokedex.core.Constants.LIMIT_POKEMON
import com.example.pokedex.core.Constants.URL_BASE
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository {
    private val service: PokemonService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonService::class.java)
    }

    fun listPokemons(limit: Int = LIMIT_POKEMON):PokemonsApiResult? {
        val call = service.listPokemons(limit)

        return call.execute().body()

    }
    fun getPokemon(number: Int): PokemonApiResult? {
        val call = service.getPokemon(number)

        return call.execute().body()

    }
}