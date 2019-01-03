package acadamy.learningKotlinProgramming.LocalFunction


/**
 *      Function scope
 * In kotlin, function can be declared at top level in a file,
 * meaning that you do not need to create a class to hold a function.
 * In addition to top level functions, kotlin functions can also be
 * declared local, as member functions and extension function
 *
 *      Local functions
 * Kotlin support local function  i.e function inside another function
 *
 *
 * */
fun main(args: Array<String>) {
  val result =  login(username = "Francis", password = "")
    println(result)
}

fun login(username:String, password:String):Boolean {
    var something = 1
    fun validateInput(input: String){ // local function can access local variable of outer function (i.e the closure). var something is an example
        something ++
        if (input.isEmpty()){
            println("may not be empty")
        }
    }
    validateInput(username)
    validateInput(password)
    return true
}