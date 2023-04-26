package com.pravin.kotlintutorials.tutorials.other

fun main() {
    displayFactorial(10)
}

fun displayFactorial(inputRange: Int) {
    var factorial = 1
    for (i in 1..inputRange) {
        factorial = factorial * i
    }
    print("Factorial is : $factorial")
}
