fun main() {
    val numbers: MutableList <Int> = mutableListOf()
    var num = readln().toInt()
    print("$num ")
    while (num != 1) {
        if (num % 2 == 0) {
            num = num / 2
            numbers.add(num)
        } else {
            num = num * 3 + 1
            numbers.add(num)
        }
    }
    println(numbers.joinToString(" "))
}
