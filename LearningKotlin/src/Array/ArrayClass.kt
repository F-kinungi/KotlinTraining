package Array

/**
 * Array is collection of similar data types either of Int, String etc.
 * Array in kotlin is mutable by nature with fixed size which means we can perform
 * both read and write operations elements of array
 *
 * Constructor of array:
 *
 * Array constructor is declared with specified size and init function.
 * The init function is used to returns the elements of array with their index
 *
 * Array(size:Int, init:(Int)-> T)
 *
 * kotlin array can be created using intArrayOf, charArrayOf, booleanArrayOf(),
 * longArrayOf, shortArrayOf(), byteArrayOf() functions
 *
 * modifying and access elements of array
 *
 * kotlin has set() and get() functions which can directly modify and access
 * the particular element of array respectively
 *
 * The set() function is used to set element at particular index location. This
 * is also done when assigning element at array index. Array get()
 * function is used to get element from specified index
 *
 * */
fun main(args: Array<String>) {

     var myArray: IntArray = intArrayOf(5,6,4,6,7,7)

    myArray.set(0,1)
    myArray.set(1,2)

   println(myArray.get(4))


   for (element in myArray){
       println(element)
   }
}
//using intArrayOf() function
