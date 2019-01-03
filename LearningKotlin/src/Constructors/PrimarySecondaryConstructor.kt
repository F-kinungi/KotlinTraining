package Constructors

class PrimarySecondaryConstructor(pass: String)  {

    constructor(name:String, id:Int, pass: String):this(pass){
        println(" Name: = $name \n Id: = $id \n Password: = $pass")
    }
}

fun main(args: Array<String>) {
    PrimarySecondaryConstructor("Moses",2,"kiangigde")
}