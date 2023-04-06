package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "Fun"
    printAllSubstring(inputString, inputString.length)
    println("---------")
    printSubstringOfGivenSize(inputString, 2)
}

// Function to print all substring
fun printAllSubstring(inputString: String, n: Int) {
//    F
//    Fu
//    Fun
//    u
//    un
//    n
    for (i in 0 until n) {
        for (j in i + 1..n) {
            println(inputString.substring(i, j))
        }
    }
    println("---------")

    // other Way
    // [Fun, Fu, un, F, u, n]
    val substrings = with(inputString) {
        indices.asSequence().flatMap { i ->
            windowedSequence(length - i)
        }
    }
    println(substrings.toList())
}

// Fu un
fun printSubstringOfGivenSize(inputString: String, n: Int) {
    for (i in 0 until inputString.length - n + 1) {
        print(inputString.substring(i, i + n) + " ")
    }
}