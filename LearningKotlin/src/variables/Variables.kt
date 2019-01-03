package variables




    const val name ="Francis"

fun main(args: Array<String>) {

    var num:Int = 45 // kotlin infer the type and therefore no need to put them
    println("The initial number is: $num")

    num ++
    println("The number after increment is: $num")

    num --
    println("The number after decrementing is: $num")


    val language = "mwanangu"
    println("this is the string literal: $language")


     println("The name is $name")

    // kotlin doest not support type promotion like in java. to solve this
    // we can use built-in methods to do it for us

    val myInt = 23
    val myLong:Long = myInt.toLong()
    println(myLong)
    println(myInt)

    val yourLong = 45.76
    val yourInt = yourLong.toInt()
    println(yourLong)
    println(yourInt)
}