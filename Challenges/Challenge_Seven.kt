/*
* QUESTION
* Write a program that declares an enum DaysOfTheWeek and prints the name of each enum's instance on a new line, starting from SUNDAY.
*/

// SOLTUION
enum class DaysOfTheWeek(val day: String) {
    SUNDAY("SUNDAY"),
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY");
}

fun main() {
    val sunday = DaysOfTheWeek.SUNDAY
    val monday = DaysOfTheWeek.MONDAY
    val tuesday = DaysOfTheWeek.TUESDAY
    val wednesday = DaysOfTheWeek.WEDNESDAY
    val thursday = DaysOfTheWeek.THURSDAY
    val friday = DaysOfTheWeek.FRIDAY
    val saturday = DaysOfTheWeek.SATURDAY
  
    println(sunday.name)
    println(monday.name)
    println(tuesday.name)
    println(wednesday.name)
    println(thursday.name)
    println(friday.name)
    println(saturday.name)  
}
