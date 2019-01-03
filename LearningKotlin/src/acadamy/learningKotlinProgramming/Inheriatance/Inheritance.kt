package acadamy.learningKotlinProgramming.Inheriatance

fun main(args: Array<String>) {

    val dog = Dog( "German shepherd")
    dog.color
    dog.breed
    dog.eat()
    dog.bark()
    println("The Dog name is: ${dog.breed}\nThe dog color is: ${dog.color}")

    val cat = Cat()
    cat.color
    cat.age = 4
    cat.eat()
    cat.meow()
}
open class Animal(){
    open var color:String = "yellow"
    open fun eat(){
        println("All animals are mammals")
    }
}
class Dog(val breed:String):Animal(){
    override var color:String = "Brown"
    fun  bark(){
        println("The neighbors dog bark all the time ")
    }
    override fun eat(){
        super.eat()
        println("The naughty dog is eating the baby poo")
    }
}
class Cat:Animal(){
    var age:Int = 2
    override var color:String = "Gray"
    fun meow(){
     println("The cat is hungry and she is crying meow meow meow")
    }
    override fun eat(){
    println("The black cat is eating itself")
    }
}

// to inherit function from parent class, we use override keyword.
// to call parent function inside the override method, we use super keyword. This we do not meet to create
// object of the parent class.
// summary:- we can call super class function inside override method

// all kotlin class are public and final by default. Inorder to perform inheritance, we must use open class type.
// inorder for derived class to override parent class properties and functions, they have to be declared wit
// open keyword. This is because as class, the are also public and final b default.
