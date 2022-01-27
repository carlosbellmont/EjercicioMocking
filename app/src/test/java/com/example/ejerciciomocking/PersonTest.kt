package com.example.ejerciciomocking

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class PersonTest {

    private lateinit var SUT : Persona

    @Mock
    private lateinit var repositorioPersona: RepositorioPersona

    @Before
    fun setUp(){
        SUT = Persona("Carlos")
    }

    @Test
    fun obtenerAmigos_NoMock() {
        Assert.assertEquals(SUT.obtenerMejorAmigo(RepositorioPersona()), "Juan")
    }

    @Test
    fun obtenerAmigos_MockRodolfo() {
        Mockito.`when`(repositorioPersona.obtenerMejorAmigo(SUT)).thenReturn("Rodolfo")
        Assert.assertEquals(SUT.obtenerMejorAmigo(repositorioPersona), "Rodolfo")
    }

    @Test
    fun obtenerAmigos_MockNull() {
        Mockito.`when`(repositorioPersona.obtenerMejorAmigo(SUT)).thenReturn(null)
        Assert.assertEquals(SUT.obtenerMejorAmigo(repositorioPersona), null)
    }
}