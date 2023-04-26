package com.pravin.kotlintutorials.tutorials.array

/**
 * Calculate the sum of the first N natural numbers as sumtotal= N*(N+1)/2.
Traverse the array from start to end.
Find the sum of all the array elements.
Print the missing number as SumTotal – sum of array
 */
fun main() {
//    val inputArray = arrayOf(1, 2, 3, 4, 5, 7, 8, 9, 10)
    val inputArray = arrayOf(11, 12, 13, 15)
    println(getMissingNumber(inputArray, inputArray.size))
    println(getMissingNumber2(inputArray, inputArray.size))
}

fun getMissingNumber2(inputArray: Array<Int>, arraySize: Int): Int {
    var missing_no: Int = arraySize
    for (i in 0 until arraySize) {
        missing_no = missing_no xor (i xor inputArray[i])
    }
    return missing_no
}

fun getMissingNumber(inputArray: Array<Int>, arraySize: Int): Int {
    // the actual size is `n+1` since a number is missing from the array
    val actualArraySize = arraySize + 1

    // get a sum of integers between 1 and `n+1`
    val total = actualArraySize * (actualArraySize + 1) / 2

    // get an actual sum in the array
    val sum = inputArray.sum()

    // the missing number is the difference between the expected sum
    // and the actual sum
    return total - sum
}