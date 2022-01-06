package com.pravin.kotlintutorials

/**
 * Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
 *
 * Methods in interface are abstract by default
 *
 * Normal methods are public and open by default but NOT FINAL
 *
 * Interface is not a class
 */
fun main() {
    var myButton = MyButton()
    myButton.onTouch()
    myButton.onClick()
}

interface MyInterfaceListener {
    fun onTouch()                   // Methods in interface are abstract by default
    fun onClick() {                 // Normal methods are public and open by default but NOT FINAL
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface {
    fun onTouch() {                 // Normal Method
        println("MySecondInterface: onTouch")
    }

    fun onClick() {                 // Normal methods are public and open by default but NOT FINAL
        println("MySecondInterface: onClick")
    }
}

class MyButton : MyInterfaceListener, MySecondInterface {

    override fun onTouch() {
        super.onTouch()
    }

    override fun onClick() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }
}
