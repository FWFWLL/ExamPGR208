package com.example.exampgr208.model

data class Pokemon(
	val id: Number, // Unique identifier
	val name: String, // Name
	val baseExperience: Number, // Experience gained by defeating
	val height: Number, // Height in decimeters
	val isDefault: Boolean, // ???
	val order: Number, // Sorting order
	val weight: Number, // Weight in hectograms
	val abilities: List<PokemonAbility>, // List of potential abilities
	val forms: List<PokemonForm>, // List of forms pokemon can take on
	val gameIndices: List<VersionGameIndex>, // Game indices relevant to pokemon item by generation
	val heldItems: List<PokemonHeldItem>,
)