package acadamy.learningKotlinProgramming.Generics


fun main(args: Array<String>) {
    val str: String = "Hello "
    val str2: String = "World"
    val str3 :String =   "Hey,"
    val result = str3 + str + str2
    println(result)

    // let use extension function
    val extensionResult = str3.add(str, str2)
    println("Result for using extension function: $extensionResult")

    // More example. let try the Integer
    val x:Int = 4
    val y:Int = 6

    val extensionIntResult = x.greaterValue(y)
    println("Enjoying using extension function $extensionIntResult")

    val character = "kotlin".lastChar()
    println(character
    )
}
//we are using extension method on predefined String class
fun String.add(s1:String, s2:String):String{
    return this + s1 + s2
}
// everything in kotlin is object.
// we are using str3 to all add extension function
// this keyword is a reference which referring str3 variable which hold hey value.

fun Int.greaterValue(other:Int):Int {
    return if (this > other)
        this
    else
        other
}

fun String.lastChar(): Char {
   //return this.get(this.length - 1)
    // receiver object(this)...can also be accessed without this keyword
    return get(length -1)
}
/**
 * what is extension function
 * book definition
 *
 * An extension function is a function that can be called as a member
 * of a class but it is defined outside the calling class.
 *
 * properties  of extension functions
 *
 * - They can become a member of user classes eg Student, Employee
 * -They can become member of predefined classes eg String, Int, Array
 * or any other predefined class
 *
 * Advantage of extension class
 *-reduce code
 * -makes code more cleaner and easier to read
 * */
