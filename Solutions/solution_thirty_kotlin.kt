fun main() {
    println("Enter a number: ")
    val input = readLine()!!.toInt() // Not-null assertion operator (!!) so that a value has to be input

    print("No. of digits: ")
    when (input) {
        in 1..9 -> println("1")
        in 10..99 -> println("2")
        in 100..999 -> println("3")
        in 1000..9999 -> println("4")
    }
}