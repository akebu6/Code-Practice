fun main() {
    val string = readln()
    println(string.substringBeforeLast('u') + 'u' + string.substringAfterLast('u').uppercase())
}
