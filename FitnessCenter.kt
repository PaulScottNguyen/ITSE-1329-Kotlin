/*********************************************************
 *                     PROGRAM HEADER                     *
 *********************************************************
 * Program Name : FitnessCenter.kt
 * Author       : Quoc Bao Nguyen
 * Modified On  : OCT 1 2026
 * Course       : ITSE 1329-5 (Richland Dallas College)
 * Description  : A recreation center allows students to
 * use the fitness room only during operating hours.The
 * fitness room opens at 8:00 AM and closes at 9:00 PM
 *********************************************************/
//constant values
val openingHours = 8
val closingHours = 21

//statusFitnessCenter function//
fun statusFitnessCenter(hour : Int) {
    //operating hours constant values
    val openingHours = 8
    val closingHours = 21

    //display operating hours
    println("Opening hours: $openingHours:00-$closingHours:00")

    //status variable
    var statusOperatingHours : Int = hour
    if (hour >= openingHours && hour < closingHours) println("Open: true") else println("Open: false")
}

//main function//
fun main() {
    while (true) {
        var hour = readln().toInt()
        if (hour >= openingHours && hour < closingHours) {
            statusFitnessCenter(hour)
            break
        }
        println("Open: false")
        break
    }
}
