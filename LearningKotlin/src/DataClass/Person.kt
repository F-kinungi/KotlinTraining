package DataClass

data class Person(val name:String, val age:Int, val email:String, val phone:Long)

fun main(args: Array<String>) {
    val p = Person("Francis",30,"frak@itu.dk",91809078)
    println(" My name is: ${p.name} \n I am: ${p.age} years old \n My email is: ${p.email} \n My contacts: ${p.phone}")

  val personCopy = p.copy()
    println(personCopy)
    val personCopyWith = p.copy(age = 29)
    println(personCopyWith)

}