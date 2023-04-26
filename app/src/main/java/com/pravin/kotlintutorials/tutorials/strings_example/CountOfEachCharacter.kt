package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "aaabbccdd"
    printCharacterCount(inputString)
    val inputList = listOf(1, 2, 1, 2, 3)
    printIntegerCount(inputList)
}
//{a=3, b=2, c=2, d=2}
fun printCharacterCount(inputString: String) {
    val mHashmap: HashMap<Char, Int> = HashMap()
    var mChar: Char
    for (c in inputString.indices) {
        mChar = inputString[c]
        if (mHashmap.containsKey(mChar)) {
            val count = mHashmap[mChar]
            count?.let {
                mHashmap[mChar] = count + 1
            }
        } else {
            mHashmap[mChar] = 1
        }
    }
    println(mHashmap)
}

//{1=2, 2=2, 3=1}
fun printIntegerCount(inputList: List<Int>) {
    println(inputList.groupingBy { it }.eachCount().filter { it.value >= 1 })
}