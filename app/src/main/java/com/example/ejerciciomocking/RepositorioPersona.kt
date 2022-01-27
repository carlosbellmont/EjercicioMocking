package com.example.ejerciciomocking

open class RepositorioPersona {


    open fun obtenerMejorAmigo(persona:Persona) : String? {
        return Persona("Juan").nombre
    }

    open fun obtenerAmigos(persona:Persona) : List<Persona> {
        return listOf(Persona("Pedro"), Persona("Juan"))
    }
}
