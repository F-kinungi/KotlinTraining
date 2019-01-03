package Constructors

class SecondaryConstructor {

    constructor(rollNo:Int, name:String, age:Int, salary:Float ){
        println(" RollNo: = $rollNo \n Name: = $name \n Age: = $age \n Salary: = $salary")
    }
}

fun main(args: Array<String>) {
 SecondaryConstructor(3, "Susan", 39, 20000f)

}