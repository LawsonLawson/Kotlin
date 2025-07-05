/**
 * It is known that the Galactic Empire has more ships than the Rebel Alliance and the number of the Empire's ships is a multiple of the number of the rebels' ships.

Write a program that calculates how many times larger the Empire fleet is.

Input: two integers as strings (each starting on a new line).

Output: Int value.

Sample Input 1:

2000
1000

Sample Output 1:

2
*/
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("What is the size of the Galactic Empire's fleet? :")
    val galacticEmpire = scanner.nextLine().toInt()

    println("What is the size of the Rebel Alliance's fleet? :")
    val rebelAlliance = scanner.nextLine().toInt()

    val fleetDifference = galacticEmpire / rebelAlliance

    println("The Galactic Empire's fleet is $fleetDifference times the Rebel Alliance's fleet")
}
