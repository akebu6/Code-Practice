// creating a class called Dog that will be used to create the dog objects later in the main function
class Dog(val name: String, weight_param: Int, breed_param: String)
{
    // creating an initialisation block
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    private val breed = breed_param.uppercase()

    //creating an initialisation block
    init {
        println("The breed is $breed")
    }

    var weight = weight_param
     // creating a setter for validation
    set(value) {
        if (value > 0) field = value
    }

    val weightInKgs: Double
    get() = weight / 2.2 // creating a getter to return the weight in kgs //using a getter to get the weight in kgs

    // a member function called bark
    fun bark()
    {
        println(if(weight < 20) "Yip" else "Woof")
    }
} // end of dog class

// the main function
fun main()
{
    val myDog = Dog("Scooby", 70, "Mixed") // creating an object of type Dog
    myDog.bark() // calling function back from Dog class
    myDog.weight = 76 // assigning a value for weight to be used by the getter created in the class

    println("Weight in kgs is ${myDog.weightInKgs}") // printing the dog weight in kgs

    myDog.weight = -2 // assigning a negative value which won't be accepted by the setter

    println("Weight is ${myDog.weight}") // now printing out the new info

    myDog.activities = arrayOf("Walks", "Fetching balls","Frisbee") // creating an array of Dog type

    for (item in myDog.activities) // looping through the items in the array
    {
        println("My dog enjoys $item")
    }

    // creating another array of objects of type Dog and assigning oit with values
    val dogs = arrayOf(Dog("Kelp", 20, "West"),
        Dog("Ripper", 40, "Poodle"))

    dogs[1].bark() // accessing the first element in the array and calling the bark function on it
    dogs[1].weight = 15 // accessing the first element in the array and giving it a value

    println("Weight for ${dogs[1].name} is ${dogs[1].weight}") //printing out the contents of the array item

} // end of main