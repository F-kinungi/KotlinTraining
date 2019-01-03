package Inheritance

open class Person (name:String, age:Int){
    init {
        println(" My name is = $name \n I am = $age years old")
    }
}

class MathTeacher(name: String, age: Int) : Person(name, age) {
    fun teachMath(){
        println(" I teach  math in high school")
    }

}
class Footballer(name: String, age: Int) : Person(name, age) {

    fun playFootball(){

        println(" I play for Manchester"+"\n")
    }
}

fun main(args: Array<String>) {

    val obj1 = MathTeacher("Kimani", 40)
    obj1.teachMath()
    println("***************Separating classes"+"\n")
    val obj2 = Footballer("Mariga",29)
    obj2.playFootball()
}