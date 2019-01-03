package functions


fun main(args: Array<String>) {

    val number = 81
    // sqrt is a library function which return square root of a number(double value)
    val result = Math.sqrt(number.toDouble())
    //println is a library function which prints a message to standard output stream
    println("Square root of 81 is $result")

    sum()
    println("code after sum")


    val result3 = additional(10,10)
    println("Adding two number result is $result3")
}


// user defined function is function that is created by the user.
// user defined function takes parameter(s),perform function and return the
// result of the action as value.
// kotlin function are declared using fun keyword

// we have to call the function inside the body of the function

fun sum(){
    var num1 = 19
    var num2 = 11
    println("sum is "+ num1 + num2)
}

//parameterized function
fun additional(number: Int, number2:Int):Int {

    val adder = number + number2
    return adder
}