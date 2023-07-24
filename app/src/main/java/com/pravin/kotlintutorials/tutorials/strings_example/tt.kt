package com.pravin.kotlintutorials.tutorials.strings_example

class tt {
}


fun extractSingleWord(inputString: String) {
    val mList = mutableListOf<String>()
    val splitString = inputString.split(" ").toMutableList()
    for (splitWord in splitString) {
        mList.add(getReverseString(splitWord))
    }

    for (item in mList) {
        print("$item ")
    }
}


fun getReverseString(inputString: String): String {
    var result = ""
    for (item in (inputString.length - 1) downTo 0) {
        result += inputString[item]
    }
    return result
}