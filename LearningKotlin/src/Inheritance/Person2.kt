package Inheritance

open class Person2() {

    // override member function of the base class

    open fun displayAge(age: Int){
        println("My age is $age years old")
    }
}

class Girl:Person2(){
    override fun displayAge(age: Int) {

        //calling base class function

        super.displayAge(age)
        println("my fake age is ${age -2}")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(30)
}

/**
 * calling members of Base class from derived class
 *
 * You can call functions(and access properties)of the base class from
 * derived class using using super keyword
 *
 * */