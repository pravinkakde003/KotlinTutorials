package com.pravin.kotlintutorials

fun main() {
    /**
     * is and !is operators
     * Use the is operator or its negated form !is to perform a runtime check that identifies whether an object conforms to a given type:
     */

    val obj = "Hello Word"

    if (obj is String) {
        println("Length: ${obj.length}")
    }
    val obj2 = 22
    if (obj2 !is Int) {
        println("Not a String")
    }

    when (val x: Any = 2) {
        is Int -> println(x + 1)   // Output 3
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
    }

    when (val x: Any = "Hello") {
        is Int -> println(x + 1)
        is String -> println(x.length + 1) // Output 6
        is IntArray -> println(x.sum())
    }

    when (val x: Any = intArrayOf(1, 2, 3, 4, 5)) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum()) // Output 15
    }

    /**
     * "Unsafe" cast operator
     *  Usually, the cast operator throws an exception if the cast isn't possible. And so, it's called unsafe.
     *  The unsafe cast in Kotlin is done by the infix operator as
     *
     */
    val y: Any = 2
    val x: String = y as String
    println("output = $x")  //Output : class java.lang.Integer cannot be cast to class java.lang.String

    // To avoid exceptions, use the safe cast operator as?, which returns null on failure.
    val a: Any = 2
    val b: String? = a as? String
    println("output = $b")  // output : output = null
}

