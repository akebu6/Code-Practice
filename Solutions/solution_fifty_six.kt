fun main() {
    val num = readln().toInt()
    println(if (num in -14..12 || num in 15..16 || num >= 19) "True" else "False")
}
