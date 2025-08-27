/**
 * Imagine that you are choosing a car for a race. The maximum speed of your
 * car must be at least 120 km/h, and the acceleration time to full speed must
 * not exceed four seconds. The acceleration time can't be lower than one
 * second. If one of these conditions is violated, then an exception must be
 * thrown with the message The race can't be won with this car; otherwise,
 * return I will definitely win!. Write a function to help you choose a car.
 *
 * Sample Input 1:
 * 120
 * 3
 *
 * Sample Output 1:
 * I will definitely win!
 */
fun main() {
    println(findCar())
}

fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()
    val message: String = "I will definitely win!"

    if (maxSpeed < 120 || accTime < 1 || accTime > 4 ) {
        throw Exception("The race won't be won with this car")
    }
    return message
}
