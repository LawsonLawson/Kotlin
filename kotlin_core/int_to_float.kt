/**
 * Write a program that reads a floating-point number from the user, converts it to an integer, and prints the result. The program should handle both positive and negative numbers.

Sample Input 1:

3.14
Explain code
Sample Output 1:

3
Explain code
Sample Input 2:

-2.71
Explain code
Sample Output 2:

-2
Explain code
*/
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val userInput = scanner.nextDouble().toInt()

    println(userInput)
}
