package acadamy.learningKotlinProgramming.classandobjects

import acadamy.learningKotlinProgramming.DataClass.Person
import java.lang.IllegalArgumentException


fun main(args: Array<String>) {
   // Referencing nested class and calling its method
    val outer = Outer.nested().foo()
    println(outer)
   println("**** difference between the nested class and nested inner class")
    // referencing the inner class and calling the inner class method
    val outers = Outers().Nested2().fooo()
    println(outers)

    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Jobless" to "Programmer"
    println(pair)

    infix  fun String.onto(other:String) = Pair(this, other)
    val myPair = "Poor" onto "Rich"
    println(myPair)

fun start():String = "okay"
    println(start())


}
class Outer {
    class nested{   // nested class is static by default
        fun foo() = "I am learning kotlin right now"
    }
}

// Inner class example

class Outers {
    private val welcomeMessage = "welcome to learning how to use inner and outer class"
    inner class Nested2 {
        fun fooo() = welcomeMessage
    }
}






