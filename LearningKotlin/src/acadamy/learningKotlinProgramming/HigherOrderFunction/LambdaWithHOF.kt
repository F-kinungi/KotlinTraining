package acadamy.learningKotlinProgramming.HigherOrderFunction

import java.lang.StringBuilder


fun main(args: Array<String>) {


    val sum  = {x:Int, y:Int -> x + y}
    val action = { println()}

   val myLamdaFunction:(Int, Int) -> Int = {x, y -> x + y}
    addNumbers(10,10,myLamdaFunction)
   // addNumbers(10,10,{x, y -> x + y}) // this is another way of calling lambda
   // addNumbers(10,10){x, y -> x + y} // this is another way

    val addingTwoThree: (Int,Int) -> Int = { x, y -> x + y}
    twoAndThree(addingTwoThree)
    println("ab1435c".filter{ it in 'a'..'z'  })

    user("Francis") {x:String -> println(x)} // lambda expression

    reverseDisplay("Francis"){it.reversed()}

}
fun addNumbers(a:Int, b:Int, myFun: (Int, Int) -> Int){ //HOF which has three parameters, two variables and lambda function

    val result = myFun(a, b) // a, b is equivalent to x + y
    println(result)

}
// defining a simple higher order function
fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2 ,3)
    println(result)
}

fun String.fil(predicate: (Char) -> Boolean):String{ // higher order function with lambda expression and using extension function.
    val sb = StringBuilder()
    for (index in 0 until length){
        val element = get(index)

        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun user(named:String, myFun:(String) -> Unit) {
    myFun(named)
}

fun reverseDisplay(str:String, myFunction: (String) -> String) { // Higher level function with lambda
    println(myFunction(str))
}

// (), (String), (Int, Int) etc are called function type in kotlin