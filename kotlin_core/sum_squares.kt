/**
 * Write a pogram in Kotlin that displays the sum of squares of even numbers
 * from 1 up to a given limit. Take the limit as an integer input from the
 * user. If the limit is less than 0, print 'Invalid Input'.
 */
import java.util.Scanner

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)
    var sum: Int = 0
    var counter: Int = 1

    // Read an integer input
    val limit = reader.nextInt()

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        while (counter <= limit) {
            repeat(limit) {
                if (counter % 2 == 0) {
                    sum += counter * counter
                }
                counter++
            }
        }
        println(sum)
    }
}
