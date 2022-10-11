class Labrador(val name: String, val color: String, val weight: Int) : Dog(name) {
    fun printInfo() {
        if (name != "Kiki") {
            println("The dog's name is $name, his color is $color and his weight is $weight")
        }
    }
}
