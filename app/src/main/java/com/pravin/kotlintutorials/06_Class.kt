package com.pravin.kotlintutorials

fun main() {

    //Difference between init and constructor
    var studentObject = Student("Pravin", 10)
    println("In main: ${studentObject.age}")
}

/**
 * The init block will execute immediately after the primary constructor.
 * The primary constructor cannot contain any code
 * During the initialization of an instance, the initializer blocks are executed in the same order as they appear in the class body
 * Even if the class has no primary constructor, the delegation still happens implicitly, and the initializer blocks are still executed
 */
class Student(var name: String) {

    var age: Int = -1

    init {
        println("In init: $name and $age")
    }

    /**
     *  In Kotlin you cannot declare properties in secondary constructor
     *  constructor(val name: String) not ALLOWED val/var
     *
     *  IMP: The body of secondary constructor is always called after init block
     */
    constructor(name: String, age: Int) : this(name = name) {
        println("In Secondary constructor: $name and $age")
        this.age = age
    }
}