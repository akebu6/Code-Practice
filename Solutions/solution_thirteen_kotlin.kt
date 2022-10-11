fun main(){
val(a, b, c, n) = readln().split(" ").map { it.toInt() }
val upperSet = (1..a).map { ('A'..'Z').joinToString("").random() }
val lowerSet = (1..b).map { ('a'..'z').joinToString("").random() }
val digits = (1..c).map { ('0'..'9').joinToString("").random() }
val pas = upperSet + lowerSet + digits
val addPass = (0 until n - pas.size).map { ('0'..'z').joinToString("").random() }
var password = pas + addPass
var i = 0

while (i < password.size - 1) {
    while (password[i] == password[i + 1]) {
        password = password.shuffled()
        i = 0
    }
    i++
}
println(password.joinToString(""))
}
