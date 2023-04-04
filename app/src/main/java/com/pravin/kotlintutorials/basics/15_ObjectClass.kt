package com.pravin.kotlintutorials.basics

fun main() {
    CustomersData.count = 98
    println(CustomersData.count)

    CustomersData.typeOfCustomers()
    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("Hello")
}

open class MySuperClass {
    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData : MySuperClass() {      // Object Declaration
    init {
        println("Singleton class invoked.")
    }
    var count: Int = -1

    fun typeOfCustomers(): String {
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("In myMethod: $str")
    }
}