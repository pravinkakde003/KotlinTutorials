package com.pravin.kotlintutorials

fun main() {
    val pObject = Person()
    pObject.name = "Pravin"
    pObject.age = 30

    with(pObject) {
        name = "Sachin"
        age = 35
    }.apply {
       println(pObject.name)
    }

}

class Person(var name: String?, var age: Int?) {
    constructor() : this(null, null) {
    }
}