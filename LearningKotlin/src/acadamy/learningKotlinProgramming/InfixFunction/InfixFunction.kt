package acadamy.learningKotlinProgramming.InfixFunction

/**
 * Infix Function
 *
 * Infix function can be a member function or extension functions
 *
 * -They have a single parameter
 * -They have prefix of "infix"
 * */
// All Infix functions are extension function but all extension
// function are not infix

fun main(args: Array<String>) {
    val x = 5
    val y = 7
   // val result2 = x.greateValue(y)
    val result2 = x greateValue y // using infix we don't need to call the method using .syntax
    println(result2)
    infix fun Int.times(str:String):String = str.repeat(this)
    println(2 times "Bye")

    val pair = "back" to "white" // infix function 2 from standard library let you create pair
    println(pair)
    val map = 1 to "Francis"
    println(map)

   infix fun String.onto(other:String) = Pair(this, other)
    val myPair = "poor" onto "Rich"
    println(myPair)

    val sophia =Person("Sophia")
    val mary = Person("Mary")
    sophia likes mary
}
class Person(val name:String){
    val likePeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likePeople.add(other)}

}
infix fun Int.greateValue(other: Int):Int { //infix or extension function
    if (this > other)
       return this
    else
       return other
}


