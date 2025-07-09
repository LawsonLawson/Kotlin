/**
 * Ann watched a TV program about health and learned that she should sleep at
 * least A hours per day, but oversleeping is also not healthy and you should
 * not sleep more than B hours. Now Ann sleeps H hours per day. If Ann's
 * sleep schedule complies with the requirements of that TV program – print
 * "Normal". If Ann sleeps less than A hours, output “Deficiency”, if she
 * sleeps more than B hours, output “Excess”. Input to this program are the
 * three strings with variables in the following order: A, B ,H. A is always
 * less than or equal to B.
 * Please note letters case: the output should exactly correspond to what is
 * required in the problem, i.e. if the program has to output "Excess", such
 * output as "excess", "EXCESS", "ExCeSs" and others will not be considered
 * correct. You should think carefully about all the conditions, which you
 * need to use. A special attention should be paid to the strictness of the
 * conditional operators used: distinguish between < and ≤ ; > and ≥.
 * In order to understand which ones to use, read carefully the problem statement.
 *
 * Sample Input 1:
 * 6
 * 10
 * 8
 *
 * Sample Output 1:
 * Normal
 *
 *
 * Sample Input 2:
 * 7
 * 9
 * 10
 *
 * Sample Output 2:
 * Excess
 *
 *
 * Sample Input 3:
 * 7
 * 9
 * 2
 *
 * Sample Output 3:
 * Deficiency
 */
import java.util.Scanner
fun sleepTracker(userInput1: String, userInput2: String, userInput3: String): String {
    var status : String = ""
    val A: Int = userInput1.toInt()
    val B: Int = userInput2.toInt()
    val H: Int = userInput3.toInt()
    if (H >= A && H <= B) {
        status = "Normal"
    } else if (H < A) {
        status = "Deficiency"
    } else {
        status = "Excess"
    }
    return (status)
}
fun main() {
    val reader = Scanner(System.`in`)

    val userInput1 = reader.nextLine()
    val userInput2 = reader.nextLine()
    val userInput3 = reader.nextLine()

    println(sleepTracker(userInput1, userInput2, userInput3))
}
