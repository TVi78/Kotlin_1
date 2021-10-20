package com.zadania.kotlin_1

object Fruits {

    val newFruit = Fruit1().copy()
    fun getFruit(): String {
        return newFruit.name
    }
}

data class Fruit1(val name: String = "Груша", val number: Int = 15)