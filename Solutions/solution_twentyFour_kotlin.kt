fun solution() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    var result = 0

    try {
        result = firstNumber / secondNumber
        println(result)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}
