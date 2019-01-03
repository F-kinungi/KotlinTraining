package acadamy.learningKotlinProgramming

import variables.name

fun main(args: Array<String>) {
    var number:Int = 25
    println("number is $number")
    number  = 24
    println("second number is $number")

    val employee = Employee("Janet waigwa", 200)
  //  println(" Employee name: ${employee.name} \n Employee id: ${employee.id} ")
    println(employee)

    println("************** Janet after getting married her name changed")
    employee.name = "Janet Frank"
    println(" Employee name: ${employee.name} \n Employee id: ${employee.id}")

    val names = arrayListOf("Jane", "John", "Mary")
    println(names.size)
    names.add("francis")
    println(names[3])


    // kotlin for loop is totally different than what we used to have in java
    // in java we had declaration and initialization, condition  and increment
    //for(int i = 0; i< 10; i++)

    for (i in 1..5)
        println(i)

    //iterating through array
    val language = arrayListOf("Java", "Kotlin", "Scala","Spark","PHP")
    language.add("Python")
    println(language)
    for (items in language.indices){
      //  println(items)

        // iterating through array with index
        if (items%2 == 0)
            println(language[items])
    }
   val user = User("faith", 24)

    println("name is : ${user.name} \n Age is : ${user.age}")


}
class Employee(var name: String, val id:Int){

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}
data class User(val name:String, val age:Int ) {
}


