package acadamy.learningKotlinProgramming

fun main(args: Array<String>) {

    val r1 = 1..5
    for (range in r1){
        println(range)
    }
    println("*****example of downTo function used in Range class")
    val r2  = 5 downTo 1
    for (downToRange in  r2){
        println(downToRange)
    }
    println("*****example of downTo  and step function used in Range class")
    val r3 = 5 downTo 1 step 2
    for (downRangeStep in r3) {
        println(downRangeStep)
    }
    println("*****example of downTo function used in Range class")
    val countDown = 10 downTo 5
    for (result in countDown.reversed()) {
        println(result)
    }


    println("*** if condition expression")

    val a = 2
    val b = 3

    val maxInt : Int = if (a > b)
        a
    else
        b
    println(maxInt)

    println("*** when expression")

    val studentGrades = 86 // declaration and initialization
    when(studentGrades) {     // condition
        in 40..49  -> println("Your grade is: D")
        in 49..59 -> println("Your grade is: C")
        in 60.. 69 -> println("Your grade is: B")
        in 70..79 -> println("Your grade is: B+")
        in 80..89 -> println("Your grade is: A")
        in 90..99 -> println("Your grade is: A+")
        else -> println("Invalid Grades")
    }

    println("***** iterator using for loop")
    for ( i in  1..4) {
        println("Hello")
    }

    println("***** iterator using while loop")
    var i = 1 // declare and initialization
    while ( i<= 10) {   // condition
        if (i % 2 == 0){   // code execution
            println(i)
        }
        i++              // increment
    }

    println("***** iterator using  do while loop")

    var x = 1
    do {
        if (x %2 == 0){
            println(x)
        }
        x++
    }
    while (x <= 5)    //condition check

    println("***** iterator using  break statement for loop")
// user user defined function if you want to break the entire break statement, otherwise break will only cove the inner for loop

   myLoop@ for (y in 1..3){
             for (w in 1..3){
            println("$y $w")
            if ( y == 2 && w == 2)
                break@myLoop
        }
    }
    println("***** iterator using  continue for loop")
    for (z in 1..5){

        if (z %2 ==0){
            continue
        }
    }
}