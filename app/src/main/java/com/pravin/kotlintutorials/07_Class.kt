package com.pravin.kotlintutorials

/**
 * All the class in kotlin are "Public" and "Final"
 * All classes in Kotlin have a common superclass "Any"
 * Base class have 3 functions : equals(), hashCode(), and toString()
 * By default, Kotlin classes are final – they can’t be inherited.
 */
fun main() {
    val testObject = Test()
    testObject.sampleFunction()
}

class Test {
    fun sampleFunction() {
        println("Sample Function")
    }
}