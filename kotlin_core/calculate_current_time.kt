/**
 * You are given a number representing the number of seconds passed since 1.1.1970.
Write a program that calculates the current time using the / and % operators, and print it out with the given format: "hours:minutes:seconds"

Example: "14:9:7"
*/

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    var remainingSeconds: Long
    val minutesInSeconds = 60 // 60 seconds make a minute
    val hoursInSeconds = minutesInSeconds * minutesInSeconds // 3600 seconds makes an hour
    val secondsInDay = 24 * hoursInSeconds // 86400 seconds makes 24 hours (A day)

    // if we wear down the Elapsed time since 1970 (epoch) by 24 hours each time being the reset mark, we are left with remaining time till another reset
    val timeLeftSinceReset = totalSeconds % secondsInDay
    
    
    val hours = timeLeftSinceReset / hoursInSeconds
    remainingSeconds = timeLeftSinceReset % hoursInSeconds
    
    val minutes = remainingSeconds / minutesInSeconds
    remainingSeconds = remainingSeconds % minutesInSeconds
    
    val seconds = remainingSeconds
    
    
    println("${hours}:${minutes}:${seconds}")
}
