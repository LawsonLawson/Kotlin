/**
 *
 * Just a reminder: leap years are the years that are either divisible by 4
 * and not divisible by 100, or divisible by 400 (for example, the year 2000
 * is a leap year, but the year 2100 is not).
 *
 * The program should work for the years 1900 ≤ n ≤ 3000.
 *
 * Output "Leap" (case-sensitive) if the year is a leap, otherwise print "Regular".
 *
 * Sample Input 1:
 * 2100
 *
 * Sample Output 1:
 * Regular
 *
 *
 *
 * Sample Input 2:
 * 2000
 *
 * Sample Output 2:
 * Leap
 */
import java.util.Scanner

fun isLeapYear(userInput: Int): String {
    var status = "Regular"
    if ((userInput % 4 == 0 && userInput % 100 != 0) || userInput % 400 == 0) {
        status = "Leap"
    }
    return (status)
}

fun main() {
    val reader = Scanner(System.`in`)
    val userInput = reader.nextLine().toInt()

    println(isLeapYear(userInput))
}
