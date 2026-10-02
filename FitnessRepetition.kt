/*********************************************************
 *                     PROGRAM HEADER                     *
 *********************************************************
 * Program Name : FitnessRepetition.kt
 * Author       : Quoc Bao Nguyen
 * Modified On  : OCT 1 2026
 * Course       : ITSE 1329-5 (Richland Dallas College)
 * Description  : A fitness center uses a digital display
 * to help members track their exercise repetitions.
 * You will create programs that use repetition to display
 * exercise counts.
 *********************************************************/

fun countReps() {
    var rep : Int = 1
    while(rep <= 5) {
        println("Repetittion: $rep")
        rep+=1
    }
}

//main function//
fun main() {
    countReps()
    countByFIve()
}