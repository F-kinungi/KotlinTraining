package acadamy.learningKotlinProgramming

fun main(args: Array<String>) {


    val mixedTypeList = listOf<Any>("I", "am", 5,  "feet", 10.5, "inches", "tall")


    for (value in mixedTypeList) {
        // is keyword is used in type casting
        // we are iterating the list of mixed type and check the type using 'is' keyword for typecast
        if (value is String){
            println("String: $value ")
        } else if (value is Int){
            println("Integer : $value feet")
        } else if (value is Double) {
            println("Double: $value inches")
        } else {
            println("unKnown type")
        }
    }

    println("******* Print the improved program using When keyword")

    // we can simplify the program further by replacing if-else with when keyword

    for (values in mixedTypeList){
        when(values){
            is String -> println("String: $values ")
            is Int ->    println("Integer : $values feet")
            is Double ->   println("Double: $values inches")
            else ->   println("unKnown type")



        }

    }


}