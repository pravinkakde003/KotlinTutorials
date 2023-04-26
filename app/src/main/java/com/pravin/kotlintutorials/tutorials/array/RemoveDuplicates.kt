package com.pravin.kotlintutorials.tutorials.array


/**
 *  Using the toSet() function
Using the toHashSet() function
Using the toMutableSet() function
Using the distinct() function
 */
fun main() {
    val inputArray = arrayListOf(30, 28, 35, 86, 30, 0, 28)
    println("Preserve Order")
    byUsingContains(inputArray)
    println()
    byUsingMutableSet(inputArray)
    println()
    println()
    println("Not Preserve Order")
    byUsingHashSet(inputArray)
    println()
    byUsingDistinct(inputArray)
}

// Preserve Order
fun byUsingSet(inputArray: ArrayList<Int>) {
    print(inputArray.toSet())
}

// Preserve Order
fun byUsingMutableSet(inputArray: ArrayList<Int>) {
    print(inputArray.toMutableSet())
}

// Not Preserve Order
fun byUsingDistinct(inputArray: ArrayList<Int>) {
    print(inputArray.distinct())
}

// Not Preserve Order
fun byUsingHashSet(inputArray: ArrayList<Int>) {
    print(inputArray.toHashSet())
}

fun byUsingContains(inputArray: ArrayList<Int>) {
    val newList: ArrayList<Int> = ArrayList()
    for (element in inputArray) {
        if (!newList.contains(element)) {
            newList.add(element)
        }
    }
    print(newList)
}
