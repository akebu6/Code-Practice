class LewisCarrolBook {
    var name: String = ""
  
      get() {
          println("The name of the book is $field")
          return field
      }

      set(value) {
         println("Now, a book called $value")
         field = value
      }
    
    var author: String = "Lewis Carrol"
  
      get() {
          println("The author of the book is $field")
          return field
      }
      
    var price: Int = 0
        set(value) {
            println(""Putting a new price...)
            field = value
            println("The new price is $value")
        }
}
