package com.pravin.kotlintutorials

import java.text.SimpleDateFormat
import java.util.*

fun main() {

    val diff = getNumberOfDaysBetweenDates(
        "07/22/2022","07/25/2022","MM/dd/yyyy",
        Locale.ENGLISH
    )
    println("Difference:  $diff")
    val userDob = SimpleDateFormat("MM/dd/yyyy",  Locale.ENGLISH).parse("02/22/2022 08:45:22")
    println("Difference:  $userDob")
}

fun getNumberOfDaysBetweenDates(
    date1: String,
    date2: String,
    dateFormat: String,
    locale: Locale
): Int {
    val dEff = SimpleDateFormat(dateFormat, locale).parse(date1)
    val dExp = SimpleDateFormat(dateFormat, locale).parse(date2)
    val diffInMilliseconds = dExp.time - dEff.time
    val diffInSeconds = diffInMilliseconds / 1000
    val diffInMinutes = diffInSeconds / 60
    val diffInHours = diffInMinutes / 60
    val diffInDays = diffInHours / 24
    return diffInDays.toInt()
}
