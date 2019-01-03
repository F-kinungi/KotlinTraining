package acadamy.learningKotlinProgramming.NullSafe

/**
 *     Null Safety Operators in kotlin
 *  In kotlin we have the following null pointer operator
 *
 *  1. ?. Safe call Operator
 *  2. ?: Elvis
 *  3. !! Not null assertion
 *  4. ?.let {safe call with let}

 * */

fun main(args: Array<String>) {
    //WAP to find out length of name

    val name:String? = "franciskinungi" //null  // making the string nullable . similar to string we can create nullable all data type including custom classes

    // 1. safe call (?.)
    // Return the length if 'name' is not null else return null.
    // use it if you don't mind getting NULL value
    println("The length of name is: ${name?.length}") //when you declare variable as nullable, we have use nullable when calling the functions


    // 2. safe call with let (?.let)
    //it executes the block ONLY if name is not Null
    name?.let {
        println("The length of name is: ${name.length}") // the block is not executed , only executed when name is not null
    }

    // 3. Elvis-Operator (?:)
    // When we have nullable reference 'name', we can say 'if name is not null, use it
    //otherwise use some non-null value
    val len = if(name != null)
                   name.length
                   else
                   -1
    val leng = name?.length ?: -1
    //this line of code are doing the same thing using elvis operator
    println("The length of name is: $leng")
    println("The length of name is: $len")



    //4. Non-null assertion operator(!!)
      // Use it when you are sure the value is NOT NULL
     // Throws NullPointerException if the value is not found to be NULL
    println("The length of name is: ${name!!.capitalize().reversed()}")


}