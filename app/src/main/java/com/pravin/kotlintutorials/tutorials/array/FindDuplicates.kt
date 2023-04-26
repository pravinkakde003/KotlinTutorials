package com.pravin.kotlintutorials.tutorials.array

fun findAllDuplicates(array: IntArray): Set<Int> {
    val seen: MutableSet<Int> = mutableSetOf()
    val duplicates: MutableSet<Int> = mutableSetOf()
    for (i in array) {
        if (!seen.add(i)) {
            duplicates.add(i)
        }
    }
    return duplicates
}

fun findAllDuplicatesUsingFilter(array: IntArray): Set<Int> {
    val nums = array.toList()
    return nums.filter { item -> nums.count { it == item } > 1 }.toSet()
}

fun findDuplicate() {
    val list = listOf("orange", "apple", "apple", "banana", "water", "bread", "banana")
    println(list.groupingBy { it }.eachCount().filter { it.value > 1 || it.value == 1 })
}

fun main() {
    val values = intArrayOf(4, 3, 2, 3, 1, 4, 5)
    val duplicates = findAllDuplicates(values)
    println(duplicates)        // [3, 4]

    val duplicates2 = findAllDuplicatesUsingFilter(values)
    println(duplicates2)

    findDuplicate()
}