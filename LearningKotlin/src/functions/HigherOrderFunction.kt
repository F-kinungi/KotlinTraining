package functions

/**
 * Higher order function
 * Higher order function (Higher level function) is a function which
 * accept other function as a parameter or returns  a function or can do both
 * means, instead of passing int, string, other type as a parameter in
 * a function we can pass a function as a parameter in other function
 *
 * */

fun main(args: Array<String>) {

    val fn:(String,String)->String = {org, portal ->"$org develop $portal"}
    myFun("lodemann.dk","javatpoint.com", fn)

    // can also be called this way
   // myFun("lodemann.dk","javatpoint.com",{org, portal ->"$org develop $portal"})

}

//to call the below function, we can pass function literal or lambda
fun myFun(org:String, portal:String, fn:(String, String) ->String) {

    val result = fn(org, portal)
    println(result)
}