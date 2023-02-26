package com.example.exampgr208.viewmodel

import android.util.Log
import com.example.exampgr208.model.Pokemon

class PokemonViewModel {
	private val baseURL = "https://pokeapi.co/api/v2/"

	fun fetchPokemon(): List<Pokemon> {
		val pokemon: ArrayList<Pokemon> = ArrayList()

		try {
			val response = "" // Call API
		} catch (_: Exception) {
			Log.d("PokemonViewModel.kt", "Critical network failure!")
		}

		return pokemon
	}
}