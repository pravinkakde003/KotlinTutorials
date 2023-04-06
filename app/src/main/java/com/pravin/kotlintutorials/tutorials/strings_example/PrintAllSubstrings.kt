package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "Fun"
    printAllSubstring(inputString, inputString.length)
    println("---------")
    printSubstringOfGivenSize(inputString, 2)
}

// Function to print all substring
fun printAllSubstring(str: String, n: Int) {
    for (i in 0 until n) {
        for (j in i + 1..n) {
            println(str.substring(i, j))
        }
    }
}

fun printSubstringOfGivenSize(str: String, n: Int) {
    for (i in 0 until str.length - n + 1) {
        print(str.substring(i, i + n) + " ")
    }
}