package acadamy.learningKotlinProgramming.ArrayClass


fun main(args: Array<String>) {

    // array in lotlin is mutable in nature with fixed size
    var name = arrayOf("John", "James", "Jane", "Joel")
    name.set(3,"mary")
    println(name.size)
    for (jnames in name) {
        println(jnames)
    }

    // using array with lambda expression
    val evenNumbers = Array(16) {i -> i * 2  } // mutable and fixed size
    for (numbers in evenNumbers) {
      //  println(numbers)
    }

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)
    for (num in someArray){
        println(num)
    }

    println("*******let try to reassign the array")
    someArray = Array(6) {i -> (i + 1) * 10 } // mutable and fixed size
    for (newNum in someArray) {
        println(newNum)
    }


val myArray = Array<Int>(6) {i -> i + 1}

    myArray[1] = 30
    myArray[5] = 6

    for (element in myArray)
        println(element)

    for (index in 0 until myArray.size - 1) // same as using range 0..4
        println(index)

}