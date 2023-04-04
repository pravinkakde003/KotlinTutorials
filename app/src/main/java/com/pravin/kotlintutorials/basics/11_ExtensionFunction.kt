package com.pravin.kotlintutorials.basics

/**
 * Kotlin provides the ability to extend a class with new functionality without having to inherit from the class
 * or use design patterns such as Decorator. This is done via special declarations called extensions.
 *
 * Add functionality to existing class
 * It behave like static function
 * We can apply extension function to user defined as well as predefined(Int,String) class
 */
fun main() {
    val string1 = "Hello"
    val string2 = "Word"
    val string3 = "Pravin"

    println(string1.concatenateStrings(string2, string3))

    val num1 = 10
    println(num1.addThreeNumber(20, 30))

}

fun String.concatenateStrings(string1: String, string2: String): String {
    return "$this $string1 $string2"
}

fun Int.addThreeNumber(int1: Int, int2: Int): Int {
    return this + int1 + int2
}


