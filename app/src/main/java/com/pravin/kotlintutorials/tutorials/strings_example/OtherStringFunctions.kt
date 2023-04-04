package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "Test"
    println(inputString.contains("es"))  // true
    println(inputString.contentEquals("Best")) // false
    println(inputString.drop(2)) // st
    println(inputString.dropLast(2)) // Te
    println(inputString.toCharArray().size)
    println(inputString[2])

    //  Check if String Ends with Specified Character
    println(inputString.endsWith("b")) // false
    println(inputString.endsWith("Test")) // true

    // Filter only Digits From String
    val inputString2 = "Test 12 Best 56 * $ #"
    println(inputString2.filter { it.isDigit() }) // 1256

    // Filter only Letters From String
    println(inputString2.filter { it.isLetter() })  // TestBest

    // Filter only capital Letters From String
    println(inputString2.filter { it.isUpperCase() })  // TB

    // Filter only capital Letters From String
    println(inputString2.filter { it.isLetterOrDigit() })  // Test12Best56

    println(inputString.drop(2)) // st
    println(inputString.removeRange(0..1)) // st

    // Remove Last N Characters in String
    println(inputString.dropLast(2))  // Te

    // Get Substring of a String
    val str1 = "abcdefghij"
    println(str1.subSequence(0, 2))  // ab

    // Capitalize First Letter for each Word
    val str = "kotlin tutorial examples"
    val cList = str.split(" ").toMutableList()
    var output = ""
    for (c in cList) {
        output += c.capitalize() +" "
    }
    println(output.trim())


    var str22 = "Kotlin Tutorial.Learn Kotlin Programming with Ease.Learn Kotlin Basics."
    var lines = str22.split(".")
    lines.forEach { println(it) }
}