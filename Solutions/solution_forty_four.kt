fun main() {
    var maxLongString = ""
    readln().split(" ").forEach { if (it.length > maxLongString) maxLongString = it }
    println(maxLongString)
}
