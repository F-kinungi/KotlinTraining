package acadamy.learningKotlinProgramming

interface Shape {

    fun calculateArea() : Float
}
class Circle : Shape {
    override fun calculateArea(): Float {
         val radius :Float = 7.0f
        return ( 22 * radius * radius)
    }
}
class Square : Shape{
    override fun calculateArea(): Float {
       val sideLength = 10.0f
        return (sideLength * sideLength)
    }

}

class Rectangle: Shape{
    override fun calculateArea(): Float {
        val length  = 10.0f
        val breadth = 5.0f
        return (length*breadth)
    }

}

fun main(args: Array<String>) {


    val circle = Circle()
    println("The area of a circle is: ${circle.calculateArea()} ")

    println("******* calculating the area of square ")

    val square = Square()
    println("Area of Square is: ${square.calculateArea()}")

    println("********* calculating the area of rectangle")

    val rectangle = Rectangle()
    println("Area of Rectangle is: ${rectangle.calculateArea()}")
}