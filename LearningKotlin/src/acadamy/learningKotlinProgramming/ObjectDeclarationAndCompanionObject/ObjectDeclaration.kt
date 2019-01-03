package acadamy.learningKotlinProgramming.ObjectDeclarationAndCompanionObject

/**
 *     What is Singleton
 *
 *    + in a kotlin we create instance of a class to access properties and functions
 *     and we can create as many instance as we like
 *
 *     + in case of singleton, we have just ONLY ONE INSTANCE in the entire application.
       Meaning: if we have a class Student declared as SINGLETON, then we CANNOT
       create object of this class.
       *There exist only one object for this class by default.
 *     * this means that we cannot create instance such as student1, student2 etc
 *
 *     in kotlin create singleton class using object keyword.
 *     internally kotlin will create singleton object when the program run. and we
 *     cannot create any other object.
 *
 *     singleton object class can inherit properties and methods from the normal classes
 *
 *
 * */

fun main(args: Array<String>) {

    Customer.id = 29   // calling property without creating instance
    println(Customer.id )
    Customer.registerCustomer() // calling method without creating instance

    Customer.myMethod("kikikiki")
}

open class MySuperClass{

   open fun myMethod(str:String) {
        println("MySuperClass")
    }

}
object Customer:MySuperClass(){
     var id:Int = 1    // this property behave as static by default

    fun registerCustomer():String { //this method behaves like static by default
     println("Today i have learned how to use singleton ")

        return "Francis"
    }
    override fun myMethod(str: String) { //this inherited method is acting like static method.This is because we can calling it using singleton class

        super.myMethod(str)
        println(str)
    }
}



/**
 *   properties of object class
 *
 *  1. we use keyword object for declaring the name object.
 *  2. kotlin internally  create a class and an object/instance
 *
 *  In these objects
 *  1. we can have properties, methods and even initializers
 *  2.we cannot have constructor in the object, because we cannot create object/instance
 *   of the object
 *  3. an object can have a super class
 *    - this way it support inheritance
 *
 *
 *
 *
 * */




















