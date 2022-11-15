const val NOMER = 4
const val SUMMA = 19
fun parseCardNumber(cardNumber: String): Long {

    val result = cardNumber.split(" ")
    if (result.size != NOMER || cardNumber.length != SUMMA) {
        throw Exception("some text")
    } else {
        for (i in result) {
            if (i.length != NOMER) {
                throw Exception("some text")
            }
        }
    }
    return result.joinToString("").toLong()

}
