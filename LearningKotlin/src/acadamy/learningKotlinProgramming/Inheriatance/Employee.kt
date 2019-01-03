package acadamy.learningKotlinProgramming.Inheriatance


fun main(args: Array<String>) {
    ComputerStudent(1,"Susan", 35)
    CommunicationStudent(2,"Francis", 29)

}
open class Student( val registration:Int,val name:String,val age : Int)

class ComputerStudent(registration: Int, name:String, age: Int, department:String = "Computer Science"):Student(registration, name, age){
    init {
       println(" My Reg_No is: $registration \n My name is: $name \n I am $age years old \n I am in $department")

        println("***************Print communication students")
    }
}
class CommunicationStudent( registration: Int,name:String, age: Int, department: String = "Communication"):Student(registration, name, age){

    init {
        println(" My Reg_No is: $registration \n My name is: $name \n I am $age years old \n I am in $department")
    }

}
