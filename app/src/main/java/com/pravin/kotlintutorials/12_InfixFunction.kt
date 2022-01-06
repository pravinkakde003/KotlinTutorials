package com.pravin.kotlintutorials

/**
 * Kotlin allows some functions to be called without using the period and brackets.
 * These are called infix methods, and their use can result in code that looks much more like a natural language
 */
fun main() {
    val num1 = 10
    println(num1.getGreaterNumber(25))
    println(num1 getGreaterNumber 25)
}

/**
 * All infix function are extension function but all extension function are not infix function
 * infix function have only one i/p parameter
 */
infix fun Int.getGreaterNumber(int1: Int): Int {
    return if (this > int1) this else int1
}