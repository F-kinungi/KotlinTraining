package acadamy.learningKotlinProgramming.ObjectDeclarationAndCompanionObject


/**
 *      Companion Object
 *  Companion objects are same as objects but they are declared within a class. Object doesn't have to be declared inside a class
 *
 * */


fun main(args: Array<String>) {

    Myclass.firstName = "Joseph"
    Myclass.employeeDetails("Joshua", 4)

    Myclass.onCreate()

    Myclass.Users.fName = "Ann Rose"
    Myclass.Users.getName()
}
// Every class can implements a companion object, which is an object that is common
// to all instance of that class. It would come to be similar to static field in java
open class Myclass{

    open fun onCreate(){
        println("The super class method ")
    }
   companion object Employee:Myclass() { // when using companion object, we can remove the name(Employee) and we can access the properties and methods using class name without creating instance of it
      lateinit  var firstName: String
        val age: Int = 29
        fun employeeDetails(name:String, age:Int){
            println("Name: $name and  age = $age")
        }
       override fun onCreate() {
           super.onCreate()
           println("This is the overriden methed inside companion object ")
          this.firstName = firstName
       }
    }
    // we can have both companion object and object declared inside the class. And their instances and methods can be called using that class
    object  Users{
      lateinit  var  fName:String
        fun getName(){}
    }
}
//object doesn't have a constructor as we don't have object to call them

// lateinit indicates that this property won't have value from the beginning, but
// will be assigned before it's used (otherwise it'll throw an exception)


