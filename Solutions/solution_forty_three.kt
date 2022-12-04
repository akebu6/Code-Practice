fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()
    val num5 = readln().toInt()
    
    if (num5 in num1..num2 || num5 in num3..num4) {
        println(true)
    } else {
        println(false)
    }
}
