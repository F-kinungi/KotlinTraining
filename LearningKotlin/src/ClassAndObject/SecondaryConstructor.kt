package ClassAndObject


// we can use both primary and secondary constructor in a same class.
// secondary constructor needs the authorization to primary class . the authorization
// to another constructor in same class is denoted using this()keyword

class MyConstructor {

    constructor(name:String, id: Int) {
        println("name = $name  \n id = $id")
    }
}
fun main(args: Array<String>) {
    MyConstructor("Faith", 22)

    MyConstructor2("Earnest", 29, "mypass")

    MyConstructor3("Ruth", 32)

    Child("Helen", 29)
    Child("Janet", 28, "waigwe")
}

// secondary constructor calling primary constructor using this keyword
class MyConstructor2(password: String){

    constructor(name:String, age: Int, password: String):this(password){

        println(" Name = $name \n age = $age \n password = $password")
    }
}

// constructor calling another constructor

class MyConstructor3 {

    constructor(name: String, id: Int):this(name, id, "mypassword") {
        println(" Name = $name \n id = $id")
    }
    constructor(name:String, id: Int, pass:String){

        println(" Name = $name \n id = $id \n password = $pass")
    }
}



// calling super class secondary constructor
// one derived class secondary constructor can call the base class secondary constructor
// This is done using super keyword, this concept is called inheritance


 open class Parent{
    constructor(name:String, id: Int){
        println("this executes first \n name = $name \n id = $id")
    }

    constructor(name: String, id: Int, pass: String){
        println("this executes third \n name = $name \n id = $id \n pass =$pass")
    }
}
class Child: Parent {
    constructor(name:String, id: Int):super(name, id){

        println("this executes second \n name = $name \n id = $id")
    }
    constructor(name: String, id: Int, pass: String):super(name,id,"password") {
        println("this executes forth \n name = $name \n id = $id \n pass =$pass")

    }

}

