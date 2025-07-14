/**
 * Write a program that calculates the division of two input numbers. It may
 * throw an ArithmeticException. Fix it to avoid the exception.
 * In the case when the exception can happen, the corrected program should
 * output: Division by zero, please fix the second argument!.
 *
 * Sample Input 1:
 * 8
 * 2
 *
 * Sample Output 1:
 * 4
 *
 *
 * Sample Input 2:
 * 8
 * 0
 *
 * Sample Output 2:
 * Division by zero, please fix the second argument!
 */
import java.util.Scanner

fun computeDivision(dividend: Int, divisor: Int) {
    try {
        println(dividend / divisor)
    } catch(error: ArithmeticException) {
        println("Division by zero, please fix the second argument!")
    }
}


/* Program Entry .. the compiler calls it "Main.jar" file */
fun main() {
    val reader = Scanner(System.`in`)

    val userDividend: Int = reader.nextLine().toInt()
    val userDivisor: Int = reader.nextLine().toInt()

    computeDivision(userDividend, userDivisor)
}
