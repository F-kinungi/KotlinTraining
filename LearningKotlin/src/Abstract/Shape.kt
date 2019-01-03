package Abstract

abstract class Shape {

     var color:String =""

     abstract fun area():Double
     abstract override fun toString(): String

     constructor(color:String){
         println("Shape constructor called")
         this.color = color
     }
    // this is a concrete method
    fun getColor() {
    }
}
class Circle: Shape{
   var radius:Double = 0.0
    constructor(color: String, radius:Double):super(color){
        this.radius = radius
    }
    override fun area(): Double {
     return Math.PI*Math.pow(radius,2.2)

    }

    override fun toString(): String {
        return "Circle color is"+super.color+"and areas is"+area()
    }

}

fun main(args: Array<String>) {
    val circle = Circle("Red", 7.5)
    println("the areas of circle is ${circle.area()}")


}