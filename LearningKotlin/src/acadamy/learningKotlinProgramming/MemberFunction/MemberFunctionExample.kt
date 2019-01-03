package acadamy.learningKotlinProgramming.MemberFunction

/**
 *     Member function
 *
 * A member function is a function that is defined inside a class or object
 *
 *
 * */

fun main(args: Array<String>) {
    val sample = Sample()
    sample.foo()
    val result =Add.add(5,6)
    println(result)
}
class Sample{
    fun foo(){
        println("foo")
    }

}

object Add{
    fun add(a:Int, b:Int):Int {
        val sum = a + b
        return sum
    }
}