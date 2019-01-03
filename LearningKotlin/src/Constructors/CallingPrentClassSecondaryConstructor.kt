package Constructors

import ClassAndObject.Child

open class CallingPrentClassSecondaryConstructor {

    constructor(name:String, id:Int){
        println("Execute first")
        println("Name = $name \n id = $id ")

    }
    constructor(name: String, id: Int,pass:String){
      println("Execute third")
        println("Name = $name \n id = $id \n pass = $pass")
    }
}
class Child3:CallingPrentClassSecondaryConstructor{

    constructor(name: String,id: Int):super(name, id){
        println("Execute second")
        println("Name = $name \n id = $id ")
    }
    constructor(name: String,id: Int,pass: String):super(name, id, "password"){
        println("Execute forth")
        println("Name = $name \n id = $id \n pass = $pass")
    }
}

fun main(args: Array<String>) {
    val obj1 = Child3("Julian", 2)
    val obj2 = Child3("Kennedy", 2, "passworddd")

}


