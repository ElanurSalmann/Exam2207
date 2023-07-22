package com.elanursalmanzada.exam2207.primenumbers

class PrimeNumbers {
    fun isPrime(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2..num / 2) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    fun findPrimePairs(target: Int) {
        println("$target can be expressed as the sum of two prime numbers as follows:")
        for (i in 2..target / 2) {
            val num1 = i
            val num2 = target - i

            if (isPrime(num1) && isPrime(num2)) {
                if (num1 <= num2) {
                    println("$target = $num1 + $num2")
                }
            }
        }
    }

    fun main() {
        print("Enter a number: ")
        val target = readLine()?.toIntOrNull()

        if (target == null || target <= 1) {
            println("Invalid input. Please enter a valid number greater than 1.")
            return
        }

        findPrimePairs(target)
    }

}