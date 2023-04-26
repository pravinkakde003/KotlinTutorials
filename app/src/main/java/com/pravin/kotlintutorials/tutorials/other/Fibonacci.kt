package com.pravin.kotlintutorials.tutorials.other

fun main() {
    displayFibonacci(10)
    println()
    getFibonacciRecursion(10)
}

fun displayFibonacci(
    inputRange: Int,
    first: Int = 0,
    second: Int = 1
) {
    var t1 = first
    var t2 = second
    for (i in 1..inputRange) {
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

fun getFibonacciRecursion(
    inputRange: Int,
    first: Int = 0,
    second: Int = 1
) {
    val result = mutableListOf<Int>()
    if (inputRange > 0) {
        result.add(first)
        print("$result + ")
        getFibonacciRecursion(inputRange - 1, second, first + second)
    } else {
        result
    }
}
