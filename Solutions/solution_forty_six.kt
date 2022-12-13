fun main() {
    var max = readln().toInt()
    var index = 1
    var count = 1

    while (true) {
        val next = readLine()?.toInt() ?: break

        count++
        if (next > max) {
            max = next
            index = count
        }
    }

    println("$max $index")
}
