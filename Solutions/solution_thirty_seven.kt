fun main() {
    val balance = readLine()!!.toInt()
    val orders = readLine()!!
    val result = orders
        .split(" ")
        .asSequence()
        .map(String::toInt)
        .runningFold(balance to 0) { acc, order -> acc.first - order to order }
        .run {
            val (current, order) = firstOrNull { it.first < 0 } ?: lastOrNull()!!
            if (current < 0) {
                "Error, insufficient funds for the purchase. Your balance is ${current + order}, but you need $order."
            } else {
                "Thank you for choosing us to manage your account! Your balance is $current."
            }
        }
    println(result)
}
