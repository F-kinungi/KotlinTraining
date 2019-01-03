package functions

import kotlin.test.fail

/**
 * Kotlin Lambda Function
 *
 * Lambda is a function which has no name. Lambda is defined with a curry braces{} which takes
 * variable parameter(if any) and body function.
 * The body of function is written after variable(if any)
 * followed by ->operator
 *
 *
 * to define lambda, we need to stick to the syntax
 *
 * val lambdaName : type = {argumentList -> codeBody}
 *
 * The only part of a lambda which isn't option is the codebody
 *
 * */

// before we talk about lambda, let take example of normal function

fun main(args: Array<String>) {
    addNumber(4,8)

    array.forEach { println(it * 4) }

    //calling lambda function
    val myLambda:(Int)-> Unit = {s: Int-> println(s)} // lambda function
    addingNumber(5,5,myLambda)

    //type inference example
    val sqnumber = square(3)
    println(sqnumber)

    val grades = 80
    val finalGrade = calculateStudentGrades(grades)
    println(" she got $grades = $finalGrade")


    val grade = 90
    val marks = calculateGrade(grade)
    println("Student scored $grade = $marks")
}
fun addNumber(a:Int, b:Int)  {
    val add :Int = a + b
    println(add)
}

// lambda function: adding two numbers
// higher level functions are the function that takes other functions in parameter and return them as value
fun addingNumber(a:Int, b:Int, mylambda:(Int)->Unit) { //higher level function lambda
    val adder = a + b
    mylambda(adder)
}

// Type inference

val square = {number: Int-> number * number}




val calculateStudentGrades ={grades: Int ->

    when(grades){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "Distinction"
        else -> false
    }
}

/**
 * The final way is to leverage the anonymous function definition
 * we must define the arguments and return type explicitly and may use the
 * return statement the same as any method
 * */
val calculateGrade =  fun(grade: Int): String{
    return if (grade < 0  || grade > 100) {
        "error"
    } else if (grade < 40) {
        "fail"
    } else if (grade < 70) {
        "pass"
    } else {
        " distinction"
    }
}

// using 'it' keyword in lambda example
// here array is lambda function

val array = arrayOf(1,2,3,4,5,6)

