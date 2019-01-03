package Constructors

class SecondaryCallSecondaryConstructor {

    constructor(name: String, id:Int):this(name,id,"password"){
        println("Executes next")
        println("Name = $name \n id = $id")
    }
    constructor(name: String, id: Int, pass:String){
        println("Execute first" )
        println("Name = $name \n id = $id \n pass = $pass")

    }
}

fun main(args: Array<String>) {

    SecondaryCallSecondaryConstructor("Mary", 2)

}
