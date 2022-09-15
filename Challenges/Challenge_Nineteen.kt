/**********************************************************************************************************************************
* QUESTION
* Write a data class Student and a function equals(). Two students are equal if they have the same name and the money value < 1500.
***********************************************************************************************************************************/

// SOLUTION
data class Student(var name: String, var money: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
      
        other as Student
        if (name == other.name && money < 1500) return true
        
        return false
    }

}
