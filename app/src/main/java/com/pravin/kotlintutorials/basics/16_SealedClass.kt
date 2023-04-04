package com.pravin.kotlintutorials.basics

/**
 * Sealed classes restricted class hierarchies
 * All direct subclasses of a sealed class are known at compile time.
 *
 * Difference :
 * In enum we restrict user with values i.e. RED,GREEN,BLUE (in file no 17)
 * whereas in sealed class we restrict user with types
 */
fun main() {
    val tile1 = Tiles.Red("Light Red", 20)
    val tile2 = Tiles.Red("Dark Red", 30)

    println("Type: ${tile1.type} & Points: ${tile1.points}")

    val tile3: Tiles = Tiles.Red("Faint Red", 20)
    val points = when (tile3) {
        is Tiles.BLUE -> tile3.points * 2
        is Tiles.GREEN -> tile3.points * 3
        is Tiles.Red -> tile3.points * 4
    }
    println(points)

    fun display(fruit: Fruit) {
        when (fruit) {
            is Fruit.Apple -> println("${fruit.x} is good for iron")
            is Fruit.Mango -> println("${fruit.x} is delicious")
        }
    }

    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    display(obj)
    display(obj1)
}

/**
 * Type should be declared in same class
 */
sealed class Tiles {
    class Red(val type: String, val points: Int) : Tiles()
    class GREEN(val type: String, val points: Int) : Tiles()
    class BLUE(val type: String, val points: Int) : Tiles()
}

sealed class Fruit(val x: String) {
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}