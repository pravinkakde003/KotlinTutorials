package com.pravin.kotlintutorials

/**
 * Range -  Range of values/Characters
 */
fun main() {
    for (i in 1..5) {
        print(i)   // Output : 12345
    }

    //.. operator never works on the reverse ranges
    for (i in 10..1) {
        print(i)     // Output : noting
    }
    /*-----------------------------------------------------------------------------*/

    var range = 5.downTo(1) // equivalent  var range = 5 downTo 1
    for (i in range) {
        print(i)   // Output : 5,4,3,2,1
    }

    for (i in 5 downTo 1 step 2) {
        print(i)   // Output : 5,3,1
    }

    val r4 = 'a'..'z'
    for (i in r4) {
        print(i)   // Output : "a", "b", "c" . . . "z
    }

    /*-----------------------------------------------------------------------------*/

    //Check if a number is within a range using in operator.
    if ('z' in r4) {
        println("In range")
    }

    val list = listOf("a", "b", "c")

    if (3 !in 0..list.lastIndex) {
        println("3 is out of range")
    }
}