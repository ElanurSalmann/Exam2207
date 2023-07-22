package com.elanursalmanzada.exam2207.srpsolution

class GradeCalculator {
    fun calculateGrades(marks: Int): String {
        return when (marks) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
    }
}