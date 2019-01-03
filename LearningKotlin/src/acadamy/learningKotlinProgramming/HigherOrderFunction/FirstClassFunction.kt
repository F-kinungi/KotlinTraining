package acadamy.learningKotlinProgramming.HigherOrderFunction

/**
 *    Higher order function
 * A higher order function that can take other function as parameter, return function as value or can do both.
 *
 *     Lambda expression.
 * A lambda can be defined as a function with no name.
 *
 *
 * */
fun main(args: Array<String>) {
    val program = Program()
    program.add(3,4)

    program.add(3,4,object:MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })
// lambda expression is anonymous function  that has no name

   val myLambda: (Int) -> Unit =   {s -> println(s)} // here, myLamdba is a function

    program.add(3,4,myLambda)
}

class Program {

    fun add(a:Int, b:Int, lambdaAction:(Int) -> Unit ){   // high level function with lambda expression
       val sum  = a + b
        lambdaAction(sum) //once the lambdaAction is executed it will be replaced with println(s) function
    }

    fun add(a:Int, b:Int, action: MyInterface){ // higher order function with using interface / object oriented ways
        val sum  = a + b
        action.execute(sum)
    }
    fun add(a:Int, b:Int){ // normal function
        val sum  = a + b
        println(sum)
    }
}
interface  MyInterface{   //interface cannot be instantiated.properties and methods are abstract by default.
    fun execute(sum:Int)
}


//val myL: (Int, Int) -> Int = {x, y -> x % y}

// lambda expression example
// (), (Int,Int) ->   these are called function types

