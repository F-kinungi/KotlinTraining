package Abstract

// abstract class are open by default, so no need to write open keyword
abstract class Person(name:String) {

    init {
        println("My name is $name")
    }

    fun displaySnn(ssn: Int){
        println("My Snn is $ssn")
    }
    abstract  fun displayJob(description: String)
}
class Teacher(name:String):Person(name){
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {

    val tech = Teacher("Milicent Muriuki")
    tech.displayJob("I teach chemistry")
    tech.displaySnn(1234)

}
// a method defined as abstract in the parent class must always be
//redefined in the subclass, thus making override compulsory
// Or either make subclass itself abstract
//