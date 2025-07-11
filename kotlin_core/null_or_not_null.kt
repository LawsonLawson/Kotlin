/**
 * Write a function named nullOrNotNull, which takes an argument number of type
 * Int? and returns -1 if number is null; otherwise, it returns number.
 */
fun nullOrNotNull(argument: Int? ): Int? {
    if (argument != null) {
        return argument
    } else {
        return -1
    }
}

/**
 * same code above can be written as this :
 *
 * fun nullOrNotNull(number: Int?) = number ?: -1
 */


fun main() {
    val arg1: Int? = 5
    val arg2: Int? = null
    println(nullOrNotNull(arg1)) // arg1 thus 5 in this case
    println(nullOrNotNull(arg2)) // ** -1 **
}
