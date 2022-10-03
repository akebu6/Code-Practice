/***************************************************************************************************************
* QUESTION
* Write a class named ArithmeticOperations containing two properties: an Int property x and an Int property y.
*
* Add the following member functions to the class:
*
* addition – adds x to y;
* subtraction – subtracts y from x;
* multiplication – multiplies x by y;
* division – divides x by y.
**************************************************************************************************************/

// SOLUTION
class ArithmeticOperations(var x: Int, var y: Int) {
    fun addition(): Int {
        return this.x + this.y
    }
    fun subtraction(): Int {
        return this.x - this.y
    }
    fun multiplication(): Int {
        return this.x * this.y
    }
    fun division(): Int {
        return this.x / this.y
    }
}
