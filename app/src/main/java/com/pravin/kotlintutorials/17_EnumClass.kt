package com.pravin.kotlintutorials

/**
 * In enum we restrict with values
 */
fun main() {
    val color = Days.BLUE
    println(color)

    color.getCurrentColor()
}

enum class Days {
    RED, GREEN, BLUE;

    fun getCurrentColor() {
        println("Color is $this")
    }
}