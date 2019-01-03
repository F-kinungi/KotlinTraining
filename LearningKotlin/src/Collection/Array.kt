package Collection

import functions.array

// array in kotlin is mutable collection that contain a fixed list of elements
// Array in kotlin can be a mix of different type eg int and strings

// once you declared and initialized array, you can't delete it
fun main(args: Array<String>) {

    var array1 = arrayOf("red","blue","green")
    for (element in array1){
        println(element)
    }
    val mixed = arrayOf("francis","janet",1,2)
    for (element in mixed){

        println(element)
    }
    val nulls = arrayOfNulls<String>(3)

    nulls[0] ="Muranga"
    nulls[1] = "kiambu"
    nulls [2] = "kirinyaga"

    nulls.sort()
    for (element in nulls) {
        println(element)
    }


}

