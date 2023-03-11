package com.example.pokedex.api

import retrofit2.http.GET


interface PokemonService {
    @GET("pokemon")
    fun listRepos(@Query("user") user: String?): Call<List<Repo?>?>?
}