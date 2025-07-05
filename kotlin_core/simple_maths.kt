/**
 * Write a program that takes two large numbers as input, converts them to Long, and prints the result of their summation.

Input: two long numbers as strings (each starting on new line).

Output: Long value.

Sample Input 1:

1000000000000000
2222222222222222
*/

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Please enter the first number : ")
    val firstNumber: Long = scanner.nextLong()

    println("Please enter the second number : ")
    val secondNumber: Long = scanner.nextLong()

    println("The sum of $firstNumber and $secondNumber is ${firstNumber + secondNumber}")
}
