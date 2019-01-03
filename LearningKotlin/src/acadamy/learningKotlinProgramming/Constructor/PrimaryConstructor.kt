package acadamy.learningKotlinProgramming.Constructor


fun main(args: Array<String>) {
    val student = Student("Francis",29, 27941799)
    //student.name
    println(" My name is ${student.name} \n I am ${student.age} years old \n My id number is ${student.id}")
}
class Student(val name: String, val age:Int ){
    //init is immediately executed after creating the object of the class
    //var name: String = "Dummy"

    var id:Int = 2
    // we cannot use var or val in the secondary constructor parameter
    constructor(name: String, age: Int,id:Int):this(name, age){
        // the body of secondary constructor is called after the init block
       this.id = id
    }

}

// constructor is used to initialize variables in time of object creation