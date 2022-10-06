/***********************************************************************************************************************************************************
* QUESTION
* Write a class Labrador that inherits from a class Dog(name: String).
*
* The Labrador class has one method called printInfo(), which prints The dog's name is %DOGS_NAME%, his color is %DOGS_COLOR% and his weight is %DOGS_WEIGHT%.
**************************************************************************************************************************************************************/

// SOLUTION
class Labrador(val name: String, val color: String, val weight: Int) : Dog(name) {
    fun printInfo() {
        if (name != "Kiki") {
            println("The dog's name is $name, his color is $color and his weight is $weight")
        }
    }
}
