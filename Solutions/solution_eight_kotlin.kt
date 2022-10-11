const val TEN = 10
const val FIFTEEN = 15
const val TWENTY = 20
const val TWENTY_FIVE = 25

fun main() {
    val numberOfCups = readln().toInt()
    val isWeekend = readln().toBoolean()

    if (isWeekend == false && numberOfCups in TEN..TWENTY ||
        isWeekend == true && numberOfCups in FIFTEEN..TWENTY_FIVE
    ) {
        println(true)
    } else {
        println(false)
    }
}
