package com.pravin.kotlintutorials

//var arr = ["john":23,"james":24, "vincent":34, "louis":29]
//
//Get only names in an array with sorted order of the ages.
//   O/p: ["john","james","louis", "vincent"]
//

data class Employee(var name: String, var age:Int)

fun main() {

    var inputArrayList= mutableListOf<Employee>()
    inputArrayList.add(Employee("John",23))
    inputArrayList.add(Employee("james",24))
    inputArrayList.add(Employee("vincent",34))
    inputArrayList.add(Employee("akash",22))
    inputArrayList.add(Employee("louis",29))
    val sortedList = inputArrayList.sortedWith(compareBy({ it.age }, { it.name }))
    print(sortedList)
}

