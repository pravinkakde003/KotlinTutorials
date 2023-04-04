package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "FUN"
    getDesiredOutput(inputString)
    println("---------")
    getDesiredOutput2(inputString)
}

/**
FUN
UN
N
 */
fun getDesiredOutput(inputString: String) {
    for (i in inputString.indices) {
        println(inputString.substring(i))
    }
}

/**
F
FU
FUN
 */
fun getDesiredOutput2(inputString: String) {
    for (i in inputString.indices) {
        println(inputString.slice(0..i))
    }
}