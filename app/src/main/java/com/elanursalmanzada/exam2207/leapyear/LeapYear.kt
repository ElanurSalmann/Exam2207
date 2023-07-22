package com.elanursalmanzada.exam2207.leapyear

class LeapYear {
    fun isLeapYear(year: Int): Boolean {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
    }

    fun main() {
        print("Enter a year: ")
        val year = readLine()?.toIntOrNull()

        if (year != null) {
            if (isLeapYear(year)) {
                println("$year is a leap year.")
            } else {
                println("$year is not a leap year.")
            }
        } else {
            println("Invalid input. Please enter a valid year.")
        }
    }

}