import java.awt.Color

fun printARGB() {
    // Write your code here
    val (alpha, red, green, blue) = readln().split(" ").map { it.toInt() }
    try {
        val color = Color(red, green, blue, alpha)
        if (
            color.alpha !in 0..255 &&
            color.red !in 0..255 &&
            color.green !in 0..255 &&
            color.blue !in 0..255
        ) {
            println("Invalid input")
        } else {
            println(color.rgb.toUInt())
        }
    } catch (e: Exception) {
        println("Invalid input")
    }
}
