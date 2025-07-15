/**
 * Write a function named reverse that reverses a given Int value. If the given
 * Int is null, then return -1.
 *
 * Sample Input 1:
 * 654
 *
 * Sample Output 1:
 * 456
 */
fun reverse(input: Int?): Int {
    var number = input // copy input received into a new variable
    var result = 0
    if (input == null) {
        return (-1)
    } else {
        while (number > 0) {
            val digit = number % 10 // get the last digit --> if 345 --> 5
            result = result * 10 + digit // shift to the left and add digit in this case 5 --> 0 * 10 + 5 = 5
            number /= 10 // remove the last digit --> if 345 / 10 then now digit is 34
        }
        return result // return the result (reversed number)
    }
}


// mind you the solution above can be put into this single line
// fun reverse(input: Int?) = input?.toString()?.reversed()?.toInt() ?: -1



fun main() {
    val number: Int? = null
    println(reverse(number))
}
