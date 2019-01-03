package acadamy.learningKotlinProgramming.DefaultFunction

// example of default function in kotlin

// below, the height variable is a default argument in case of kotlin. we can override default argument value
fun findVolume(length:Int, breadth:Int, height: Int = 10): Int {
    return length * breadth * height
}
fun main(args: Array<String>) {
    val result  = findVolume(5,5, 20)
    println("The area of cubic is: $result")
}