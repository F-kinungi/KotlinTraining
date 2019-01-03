package KotlinActionBookExamples.DataClass


data class Person(val name:String, val age:Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"), Person("Gideon", 29))
    val oldest =persons.maxBy { it.age?: 0 } //maxBy function takes one parameter and we use it defa
    // ult parameter
    println(oldest)

    val rectangle = Rectangle(45,49)

    println(rectangle.isSquare)
    }

class Rectangle(val height:Int, val width:Int) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}

