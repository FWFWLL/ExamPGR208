package com.example.exampgr208.model

data class Pokemon(
	val id: Int, // Unique identifier
	val name: String, // Name
	val baseExperience: Int, // Experience gained by defeating
	val height: Int, // Height in decimeters
	val isDefault: Boolean, // Set for exactly one Pokemon used as the default for each species
	val order: Int, // Sorting order
	val weight: Int, // Weight in hectograms
	val abilities: List<PokemonAbility>, // List of potential abilities
	val forms: List<PokemonForm>, // List of forms Pokemon can take on
	val gameIndices: List<VersionGameIndex>, // Game indices relevant to Pokemon item by generation
	val heldItems: List<PokemonHeldItem>, // List of items this Pokemon may be holding
	val locationAreaEncounters: String, // Link to list of location areas
	val moves: List<PokemonMove>, // List of moves
	val pastTypes: List<PokemonTypePast>, // List of details showing previous types
	val sprites: PokemonSprites, // Set of sprites used to depict this Pokemon
	val species: PokemonSpecies, // Species this Pokemon belongs to
	val stats: List<PokemonStats>, // List of base stat values
	val types: List<PokemonType>, // List of types this Pokemon has
)