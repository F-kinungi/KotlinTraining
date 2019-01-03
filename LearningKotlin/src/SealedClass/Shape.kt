@file:Suppress("IMPLICIT_CAST_TO_ANY")

package SealedClass

sealed class Shape {

    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var lenght: Int, var breadth: Int): Shape()

   // object NotShape:Shape()

}
fun eval(e:Shape) =
        when(e){
            is Shape.Circle -> ("Circle area is ${3.14 * e.radius * e.radius}")
            is Shape.Square ->println("Square area is ${e.length * e.length}")
            is Shape.Rectangle ->println("Rectangle area is ${e.breadth * e.lenght} ")
        }

fun main(args: Array<String>) {

    val circle = Shape.Circle(5.0f)
    val square = Shape.Square(5)
    val rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)

}



