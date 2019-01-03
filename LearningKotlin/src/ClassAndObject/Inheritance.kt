package ClassAndObject



fun main(args: Array<String>) {
   val obj = Derived()
    obj.foo()

    // inheriting methods

    val duck = Duck()
    duck.swim()
    duck.fly()

    // class inheritance

    val emp1 = Programmer("Francis", 30, 5000f)
    emp1.writeProgram()
    val emp2 = Salesman("Helen", 29, 45000f)
    emp2.fieldWork()

    // third example
    val ob = Child2("Susan", 27, "research")
    ob.researchWork()
}
open class Base{
    val x:Int = 10
}
class Derived:Base(){
    fun foo() {
        println("The value of x = $x ")
    }
}

//Inheriting methods from a class

open class Bird{
    fun fly() {
        println("The bird is great flyer")
    }
}
class Duck:Bird(){
    fun swim(){
        println("" +
                "The duck is a great swimmer")
    }
}


//////////////////77

// the third example
// The primary constructor cannot contain any code.Initialization code can
// can be placed in initializer blocks, which are prefixed with the init keyword
 open class Employee(name:String, age: Int, salary:Float) {
    init {
        println(" Name = $name \n age = $age \n salary = $salary")
    }
}
class Programmer(name:String,age:Int, salary:Float):Employee(name, age, salary){
    fun writeProgram(){
        println("I like programming")
    }
}
class Salesman(name:String,age:Int, salary:Float):Employee(name, age, salary){
    fun fieldWork(){
        println("travelling is awesome")
    }
}


// kotlin inheritance and secondary constructor
// if derived class does not contain any primary constructor then it is required
// to call the base class secondary constructor from derived class using super keyword


open class Parent2 {

    constructor(name: String, id:Int){
        println("Execute super constrctor $name: $id")
    }
}
class Child2 : Parent2{

    constructor(name: String, id: Int,dept:String):super(name,id){

        println("Execute child constructor with property \n name = $name \n id = $id \n department = $dept")
    }
    fun researchWork(){
        println("I am somehow idiot")
    }
}