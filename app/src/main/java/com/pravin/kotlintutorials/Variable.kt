package com.pravin.kotlintutorials

/**
 * Variables
 */

/**
 * Kotlin variables are created using either var or val keywords and then an equal sign = is used to assign a value to those created variables.
 * val : immutable
 * It can not be re-assigned.
 *
 * var : mutable
 * Can be re-assign
 *
 * In kotlin data types are Object like Int,String,Boolean,Long,Double,Byte,Char
 * Default value of data types : We don't have any default value of data types.
 * as all data types are object, they must be initialized
 */
fun main() {
    //const val WEBSITE_NAME: String = "Google"

    /**
     * Integer types
     */
    val age = 19
    val variableOne: Int = 19
    println("Age = $age")
    println("variableOne = $variableOne")

    /*-----------------------------------------------------------------------------*/

    /**
     * Floating-point types
     * Float 32 bits  : Floats are tagged by f or F
     * Double 64 bits
     */
    val pi = 3.14
    val eFloat = 2.7182818284f

    //You can use underscores to make number constants more readable
    val socialSecurityNumber = 999_99_9999L
    println("socialSecurityNumber $socialSecurityNumber")  //socialSecurityNumber 999999999

    val oneMillion = 1_000_000
    println("oneMillion $oneMillion")  //oneMillion 1000000

    /*-----------------------------------------------------------------------------*/

    /**
     * String types
     * Strings are immutable. Once you initialize a string, you can't change its value or assign a new value to it.
     * All operations that transform strings return their results in a new String object,
     * leaving the original string unchanged.
     */
    val name = "Kotlin Tutorials"
    val template: String = "Kotlin Tutorials"

    val str = "Hello World"
    println(str.uppercase()) // Create and print a new String object
    println(str) // the original string remains the same

    /**
     * What-is-the-difference-between-const-and-val
     * const are immutable and variables that are known at compile-time
     * Modifier 'const' is not applicable to 'vars'
     *
     *  - The value of the const variable is known at compile time.
     *  - The value of val is used to define constants at run time
     *
     *  Modifier 'const' is not applicable to 'local variable'
     */

    val fooVal = "Hello World"
    // const val constantValue = "Hello world"

    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Int Value is $a")
    println("Double  Value is $d")
    println("Float Value is $f")
    println("Long Value is $l")
    println("Short Value is $s")
    println("Byte Value is $b")
}
