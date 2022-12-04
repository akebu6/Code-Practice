open class Dog(val name: String) {
    constructor(name: String) {
        this.name = name
    }
}

class Labrador(val name: String, val colour: String, val weight: double) : Dog(name) {
    fun printInfo() {
        return "The dog's name is $name, his colour is $colour and his weight is $weight"
    }
}
