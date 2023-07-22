package com.elanursalmanzada.exam2207.quadraticequation
import kotlin.math.sqrt
class QuadraticEquation {


    fun findRoots(a: Double, b: Double, c: Double) {
        val determinant = b * b - 4 * a * c

        if (determinant > 0) {
            val root1 = (-b + sqrt(determinant)) / (2 * a)
            val root2 = (-b - sqrt(determinant)) / (2 * a)
            println("Roots are real and different.")
            println("Root 1: $root1")
            println("Root 2: $root2")
        } else if (determinant == 0.0) {
            val root = -b / (2 * a)
            println("Roots are real and equal.")
            println("Root: $root")
        } else {
            val realPart = -b / (2 * a)
            val imaginaryPart = sqrt(-determinant) / (2 * a)
            println("Roots are complex and different.")
            println("Root 1: $realPart + ${imaginaryPart}i")
            println("Root 2: $realPart - ${imaginaryPart}i")
        }
    }

    fun main() {
        print("Enter coefficient a: ")
        val a = readLine()?.toDoubleOrNull()

        print("Enter coefficient b: ")
        val b = readLine()?.toDoubleOrNull()

        print("Enter coefficient c: ")
        val c = readLine()?.toDoubleOrNull()

        if (a == null || b == null || c == null) {
            println("Invalid input. Please enter valid coefficients.")
            return
        }

        if (a == 0.0) {
            println("Coefficient 'a' cannot be zero as it is a quadratic equation.")
            return
        }

        findRoots(a, b, c)
    }

}