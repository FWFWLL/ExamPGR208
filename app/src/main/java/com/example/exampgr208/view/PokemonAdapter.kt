package com.example.exampgr208.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exampgr208.R
import com.example.exampgr208.model.Pokemon

class PokemonAdapter(private val pokemonList: MutableList<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.PokemonHolder?>() {
	class PokemonHolder(view: View) : RecyclerView.ViewHolder(view) {
		// TODO: ("Not yet implemented") 
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
		val view = LayoutInflater
			.from(parent.context)
			.inflate(R.layout.element, parent, false)

		return PokemonHolder(view)
	}

	override fun onBindViewHolder(holder: PokemonHolder, position: Int) {
		// Do the display
	}

	override fun getItemCount(): Int = pokemonList.size
}