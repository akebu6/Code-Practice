const val ten = 10;

fun main() {
    val number = readln().toInt()
    if (number in ONE..ten) {
        println(false)
    } else {
        println(true)
    }

}
