package com.pravin.kotlintutorials

/**
 * To inherit class need to use keyword "open"
 * Koltin support -Single,Multilevel and hierarchial
 */
fun main() {
    val circle = Circle()
    circle.color = "RED"
    circle.draw()
    circle.drawCircle()
    println()
    val square = Square()
    square.draw()
    square.drawSquare()
}

/**
 * Base Class - In order to extend this class need to append "open" keyword
 * this make function accessible in derived class.
 * in order to make variables accessible in derived class need to append keyword "open"
 */


open class Shape {
    // we can override variable by making variable open in base class
    open var color: String = ""

    fun draw() {
        println("In base class-Shape")
    }
}

/**
 * During the construction of a new instance of a derived class,
 * the base class initialization is done as the first step (preceded only by evaluation of the arguments for the base class constructor),
 * which means that it happens before the initialization logic of the derived class is run.
 */
class Circle : Shape() {
    fun drawCircle() {
        println("In child class-Circle $color")
    }
}

class Square : Shape() {
    // we can override variable by making variable open in base class
    override var color = "YELLOW"
    fun drawSquare() {
        println("In child class-Square $color")
    }
}