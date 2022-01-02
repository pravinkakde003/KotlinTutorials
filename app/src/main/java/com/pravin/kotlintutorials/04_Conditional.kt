package com.pravin.kotlintutorials

fun main() {
    val a = 2
    val b = 5

    var maxValue: Int = if (a > b) {
        print("a is greater")
        a
    } else {
        print("b is greater")
        b
    }
    println(maxValue)

    /**
     * One Line If else
     */
    var maxValue2: Int = if (a > b) a else b
    println(maxValue2)

    /**
     * Elvis Operator in conjunction with Safe Call Operator you can ask for the desired output other than ‘ null ‘
     * When you have a nullable reference we can use Elvis Operator
     */
    var testString: String? = null

    // Without Elvis operator
    val output: Int = if (testString != null) testString.length else -1
    println(output)   // output -1

    // With Elvis operator
    val output2 = testString?.length ?: -1
    println(output)  // output -1

    /**
     * When expression
     * when defines a conditional expression with multiple branches. It is similar to the switch statement
     */
    val returnedValue = when (1) {
        0, 1 -> println("input number either 0 or 1")
        in 1..5 -> println("In range 1 to 5")
        10 -> println("number matched")
        else -> {
            print("No condition matched")
        }
    }
}