/**
 * Given a string input with numbers separated by whitespaces, Generate a code
 * in Kotlin that uses readln to read the data and converts each number to an
 * integer. Then, determine the sum of these integers and output it. For
 * example, if your string input is '2 4 6', convert those to integers and
 * print the sum; in this case 12.
 */
// Importing necessary libraries
import java.util.Scanner

fun main(args: Array<String>) {
    // Initialisation of a Scanner
    val scanner = Scanner(System.`in`)
    var value = 0

    // TODO: Get input string line
    val userInput = scanner.nextLine()
    // TODO: Use split to create an array

    // TODO: Iterate over array to convert from String to Int and accumulate the sum
    val numbers = userInput
        .split("\\s+".toRegex())
        .map { it.toInt() }
        .toIntArray()

    for (input in numbers) {
        value += input
    }
    // TODO: Print the sum.
    println(value)
}
