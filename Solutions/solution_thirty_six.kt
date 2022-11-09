fun printIfPrime(number: Int) {
    println(
        if ((2 until number).none { number % it == 0 }) {
            "$number is a prime number."
        } else {
            "$number is not a prime number." 
        }
    )
}

fun main() {
    printIfPrime(readln().toInt())
}
