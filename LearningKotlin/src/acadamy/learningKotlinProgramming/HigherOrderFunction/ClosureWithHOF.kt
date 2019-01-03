package acadamy.learningKotlinProgramming.HigherOrderFunction

fun main(args: Array<String>) {

     var result = 0
    //val myLamdaFunction:(Int, Int) -> Int = {x, y -> x + y}
    //addNum(10,10,myLamdaFunction)
    // addNumbers(10,10,{x, y -> x + y}) // this is another way of calling lambda
     addNum(10,10){x, y -> result = x + y} // variable result is accessed inside the addNum and its created outside scope. This concept is called closure
    println(result)

    //'it': implicit name of single parameter

    //val myVariable: (String) -> String = {s -> s.reversed()}
    reverseAndDisplay("Hello"){it.reversed()} // it is an implicit name of single parameter

}
fun addNum(a:Int, b:Int, myFun: (Int, Int) -> Unit){ //Higher level function with lambda
    myFun(a, b) // a, b is equivalent to x + y
}


// 'it': implicit name of single parameter

fun reverseAndDisplay(str:String, myFunction: (String) -> String) { // Higher level function with lambda
   println(myFunction(str))
}