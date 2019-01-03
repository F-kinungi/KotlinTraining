package ControlFlow

fun main(args: Array<String>) {
    val a:Int =3
    val b: Int =2;
    val max:Int

    if(a > b)
        max = a
    else
        max = b

    println(max)


    // use of when in kotlin is like switch in other proggramming languages like java
    val x: Int = 10
    when(x){

        1 -> print("x == 1")
        2 -> print("x == 2")
        //alternative
        3,4 -> print("value of x either 3,4")
        else ->{
            println("x is neither 1 nor 2")
        }
    }

    // for loop
    for (i in 1..5)
        println("value of i: $i")
    for (a in 5 downTo 1)
        println("the value of a: $a")
    for (b in 1..4 step 2)
        println("the value of b: $b")


    //iterating through items

    val items = listOf<Int>(1,4,5,6,7,8,10)
    for (a in items)
        println("value of an array is: $a")


    val languages = arrayOf("java","scala","kotlin","php")
    for (i in languages)

    println("My favourite languages are as follow: $i")
    //printing array item having the index only
    for (a in languages.indices){
        if (a%2 == 0)
            println(languages[a])
    }

}

