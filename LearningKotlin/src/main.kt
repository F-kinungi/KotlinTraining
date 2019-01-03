fun main(args: Array<String>) {
    println("Welcome to kotlin, ${args[0]}") //kotlin concatenation
    //println("May name is " +args[0]) // java way of doing concatenation


    //val is function identifier for the variables and both can be set with lower case
    val p = Person("Kinungi")
    println(p)
}
data class Person(val name: String)
// just like in java class name in kotlin start with camel case.
// the interface in kotlin start with camel case as well