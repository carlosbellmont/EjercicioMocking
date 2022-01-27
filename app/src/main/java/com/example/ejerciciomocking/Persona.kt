package com.example.ejerciciomocking

open class Persona (
    open val nombre: String,
) {

    open fun obtenerMejorAmigo(repo : RepositorioPersona) : String? {
        return repo.obtenerMejorAmigo(this)
    }

    open fun obtenerAmigos(repo : RepositorioPersona) : List<Persona> {
        return repo.obtenerAmigos(this)
    }

}
