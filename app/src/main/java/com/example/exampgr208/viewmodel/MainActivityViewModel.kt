package com.example.exampgr208.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exampgr208.DataSource
import com.example.exampgr208.model.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
	private val dataSource = DataSource()
	private val pokemon: MutableLiveData<List<Pokemon>> by lazy {
		MutableLiveData<List<Pokemon>>().also {
			loadPokemon()
		}
	}

	private fun loadPokemon() {
		viewModelScope.launch(Dispatchers.IO) {
			dataSource.fetchPokemon().also {
				pokemon.postValue(it)
			}
		}
	}

	fun getPokemon(): LiveData<List<Pokemon>> = pokemon
}