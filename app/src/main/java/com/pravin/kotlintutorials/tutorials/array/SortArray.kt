package com.pravin.kotlintutorials.tutorials.array


fun main() {
    val inputArray = arrayOf(30, 28, 35, 86)
    sortAscending(inputArray)
    println("---------")
    sortDescending(inputArray)
}

fun sortDescending(inputArray: Array<Int>) {
    inputArray.sortDescending()
    for (x in inputArray) print("$x  ")
}

fun sortAscending(inputArray: Array<Int>) {
    inputArray.sort()
    for (x in inputArray) print("$x  ")
}