/**
 * This function returns the length of a string, -1 should the string be a null
 */

fun getLength(input: String?): Int = input?.length ?: -1

fun main() {
    val userInput: String? = readln()

    println(userInput())
}

