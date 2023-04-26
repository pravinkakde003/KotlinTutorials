package com.pravin.kotlintutorials.tutorials.other

fun main() {
    displaySumOfNaturalNumbers(10)
}

fun displaySumOfNaturalNumbers(inputRange: Int) {
    var sum = 0
    for (i in 1..inputRange) {
        sum = sum + i
    }
    print("Sum is : $sum")
}