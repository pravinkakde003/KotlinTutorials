package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "FUN"
    getDesiredOutput3(inputString)
    println("---------")
    getDesiredOutput2(inputString)
}

/**
FUN
UN
N
 */
fun getDesiredOutput(inputString: String) {
    for (i in inputString.indices) {
        println(inputString.substring(i))
    }
}

/**
F
FU
FUN
 */
fun getDesiredOutput2(inputString: String) {
    for (i in inputString.indices) {
        println(inputString.slice(0..i))
    }
}

fun getDesiredOutput3(inputString: String) {
    var outPut = ""
    for (element in inputString) {
        outPut = outPut + "" + element.toString()
        println(outPut)
    }
}