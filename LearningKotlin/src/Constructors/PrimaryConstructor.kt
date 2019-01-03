package Constructors


//primary constructor
class PrimaryConstructor(val name:String, var id: Int)

fun main(args: Array<String>) {
    val myClass = PrimaryConstructor("Francis", 2)
    println(" My name is: "+myClass.name+"\n"+" Id is: "+myClass.id)
}