package com.pravin.kotlintutorials.tutorials.strings_example

fun main() {
    val inputString = "Madam"
    val isPalindrome = checkIsWithFunctionPalindromeString(inputString)
    println(isPalindrome)
    val isPalindrome2 = checkIsWithoutFunctionPalindromeString(inputString)
    println(isPalindrome2)

    val inputIntegerValue = 12321
    val isPalindrome3 = checkIsWithoutFunctionPalindromeInt(inputIntegerValue)
    println(isPalindrome3)
}

fun checkIsWithoutFunctionPalindromeInt(inputIntegerValue: Int): Boolean {
    var isPalindrome = false
    var reverseNumber = 0
    var temp = inputIntegerValue

    while (temp != 0) {
        val remainder = temp % 10
        reverseNumber = (reverseNumber * 10) + remainder
        temp = temp / 10
    }
    if (inputIntegerValue == reverseNumber) {
        isPalindrome = true
    }
    return isPalindrome
}

fun checkIsWithoutFunctionPalindromeString(inputString: String): Boolean {
    var isPalindrome = false
    var reversedString = ""
    for (i in (inputString.length - 1) downTo 0) {
        reversedString += inputString[i]
    }

    if (reversedString.equals(inputString, true)) {
        isPalindrome = true
    }
    return isPalindrome
}


fun checkIsWithFunctionPalindromeString(inputString: String): Boolean {
    var isPalindrome = false
    when {
        inputString.isNullOrEmpty() -> {
            isPalindrome = false
        }
        inputString.equals(inputString.reversed(), true) -> {
            isPalindrome = true
        }
    }
    return isPalindrome
}
