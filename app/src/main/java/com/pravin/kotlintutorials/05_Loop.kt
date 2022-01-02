package com.pravin.kotlintutorials

fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    println()

    for (i in 10 downTo 0) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    println()
    /**
     * iterate over array
     */
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language)
        println(item)

    println()

    for (item in language.indices) {
        print("Index: $item ")
        print("Item : ${language[item]} ")
        println()
    }

    println()

    var numbersArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val arr = IntArray(5)
    for (i in numbersArray.indices) {
        print(numbersArray[i])
    }

    println()

    // Print index with value in loop
    for ((i, value) in numbersArray.withIndex()) {
        println("the element at $i is $value")
    }

    println()

    //foreach loop
    numbersArray.forEach { number ->
        println("foreach Item : $number ")
    }
    println()
    numbersArray.forEachIndexed() { index, number ->
        println("foreach index : $index Item : $number")
    }
}