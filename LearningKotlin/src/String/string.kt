package String

import String.Constants.Companion.RED

// string in kotlin is like string in java
fun main(args: Array<String>) {

    val name = "francis"
    println("hello, $name")

    // chararray

    var charArray = name.toCharArray()

    println(charArray.size)
    println(charArray.toList())

    val len = name.length
    for(i in 0 until len) {
        val c = name.get(i)
        println(c)
    }


    // string builder in kotlin...work like java
    val builder = StringBuilder("To be or not to be\n")

            .append("that is the question\n")
            .append("whether its nobler in the mind\n")
            .append("to suffer the sling and arrows")

    val result = builder.toString()
    println(result)


    // calling the companion object in the constant class

    println("the color is $RED")
}