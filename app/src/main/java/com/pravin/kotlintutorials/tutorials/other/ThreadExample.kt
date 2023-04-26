package com.pravin.kotlintutorials.tutorials.other

class ThreadExample : Thread() {

    override fun run() {
        print("Thread Started")
    }
}

fun main() {
    val obj1= ThreadExample()
    obj1.start()

    val t1 =Thread {
        print("Thread 2 Started")
    }
    t1.start()

    val t2= Thread{ Runnable {

    }.run()}
}