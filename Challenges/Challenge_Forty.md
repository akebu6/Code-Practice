Write a class LewisCarrollBook with custom getters and setters, which has three fields: name with the default value "", author with the default value Lewis Carroll, and price with the default value 0.
The `main()` function looks as follows:
```
fun main() {
    val lewisCarrollBook = LewisCarrollBook()
    var bookName = lewisCarrollBook.name
    lewisCarrollBook.name = "Alice's Adventures in Wonderland"
    bookName = lewisCarrollBook.name
    var authorName = lewisCarrollBook.author
    var bookPrice = lewisCarrollBook.price
    lewisCarrollBook.price = 1500
}
```
