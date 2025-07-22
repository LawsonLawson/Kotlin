/**
 * Given a positive integer number, print a list of Fibonacci sequence up to
 * the nth term. The Fibonacci sequence is a series of numbers in which each
 * number is the sum of the two preceding ones, often starting with 0 and 1.
 * For example, the Fibonacci sequence up to 7th term is: 0,1,1,2,3,5,8. The
 * input is the term n and the output should be the sequential integers of
 * Fibonacci as a string, separated by a comma and space.
 *
 * Sample Input 1:
 * 5
 * Sample Output 1:
 * 0, 1, 1, 2, 3
 *
 * Sample Input 2:
 * 7
 *
 * Sample Output 2:
 * 0, 1, 1, 2, 3, 5, 8
 */


import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextLong()

    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1: Long = 0L
    var t2: Long = 1L
    var counter: Long = 0L

    // Write your "while" loop code here to complete the series
    while(counter < (n - 2)) {
        var valueToPrint: Long = t1 + t2
        if (counter == 0L) {
            print("$t1, $t2, ")
        }
        print("$valueToPrint")
        if (((n - 2) - counter != 1L)) {
            print(", ")
        } else {
            print("\n")
        }
        t1 = t2
        t2 = valueToPrint
        counter++
    }
}
