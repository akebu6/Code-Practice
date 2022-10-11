fun main() {
    val (s, sn) = readln().split(" ")
    val n = sn.toInt()

    println(s.drop(n) + s.take(n))
}
