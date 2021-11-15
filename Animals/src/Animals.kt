// creating an interface to implement common behaviour
interface Roamable {
    fun roam()
}

// making Animal class a superclass and abstract
abstract class Animal: Roamable {
    abstract val image: String // allowing image property to be overridden in the Animal class
    abstract val food: String // allowing food property to be overridden in the Animal class
    abstract val habitat: String // allowing habitat property to be overridden in the Animal class
    val hunger = ""

    // allowing the makeNoise function to be overridden in the Animal class
    abstract fun makeNoise()

    // allowing the eat function to be overridden in the Animal class
    abstract fun eat()

    // allowing the roam function to be overridden in the Animal class
    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
} // end of class Animals

class Hippo: Animal() {
    override val image = "resources/images/hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

} // end of the class Hippo

abstract class Canine: Animal() {
    override fun roam() {
        println(("The Canine is roaming"))
    }
} // end of subclass Canine of type Animal

class Wolf: Canine() {
    override val image = "resources/images/wolf.png"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooowl!")
    }
    override fun eat() {
        println("The wolf is eating meat!")
    }
} // end of the subclass Wolf which is a subclass of the Canine subclass

// creating a vehicle class that isn't related to the Animals class but inherits from the Roamable interface
class Vehicle: Roamable {
    override fun roam() {
        println("The vehicle is roaming")
    }
} // end of vehicle class

class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
} // end of the Vet class

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for(item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
} // end of main