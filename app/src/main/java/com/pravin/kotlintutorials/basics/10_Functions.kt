package com.pravin.kotlintutorials.basics

fun main() {
    val objectTest = FunctionExample()
    println("Addition is : ${objectTest.add(10, 20)}")
}

class FunctionExample {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
