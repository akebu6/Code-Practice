fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    // write your code here
    println(a xor b xor c)
}
