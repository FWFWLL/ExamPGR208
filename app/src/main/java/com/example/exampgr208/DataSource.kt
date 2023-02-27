package com.example.exampgr208

import android.util.Log
import com.example.exampgr208.model.Pokemon
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.coroutines.awaitString

class DataSource {
	private val baseURL = "https://pokeapi.co/api/v2/"

	suspend fun fetchPokemon(): List<Pokemon> {
		val pokemon: ArrayList<Pokemon> = ArrayList()

		try {
			val response = Fuel.get(baseURL + "1/").awaitString()
			Log.d("DataSource.kt", response)
		} catch (_: Exception) {
			Log.d("PokemonViewModel.kt", "Critical network failure!")
		}

		return pokemon
	}
}