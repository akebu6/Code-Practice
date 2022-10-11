const val ONE = 1
const val ONE_HUNDRED = 100

fun sumInts(): Int {
    var sum = 0
    for (i in ONE until ONE_HUNDRED) {
        sum = + i
    }
    return sum
}
