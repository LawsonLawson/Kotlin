/**
 * Write a function that takes a person's age as input and prints 'Minor' if
 * their age is less than 18, 'Adult' if their age is greater than or equal
 * to 18 and less than 65, and 'Senior' if their age is 65 or above.
 *
 * Sample Input 1:
 * 17
 *
 * Sample Output 1:
 * Minor
 *
 *
 * Sample Input 2:
 * 35
 *
 * Sample Output 2:
 * Adult
*/

// Declare a function to determine age category based on the given age
fun isLegal(userAge: Int): String {
    var status: String = "Minor"

    if (userAge >= 18 && userAge < 65) {
        status = "Adult"
    } else if (userAge > 65) {
        status = "Senior"
    }
    return (status)
}

fun main() {
    // Read the person's age
    val age = readLine()!!.toInt()

    // Print the result
    println(isLegal(age))
}
