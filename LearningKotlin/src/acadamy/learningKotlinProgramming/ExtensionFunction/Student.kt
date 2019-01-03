package acadamy.learningKotlinProgramming.ExtensionFunction


fun main(args: Array<String>) {

   val student = Student()
    val passingStatus =student.hasPassed(57)
    println("Student passing status is: $passingStatus")
    //calling extension function
    val excellentStatus = student.isScholar(95)
    println("Student excellent status is: $excellentStatus")
}
class Student {
    fun hasPassed(marks: Int):Boolean {
         return marks >= 40
    }
}
//extension function
fun Student.isScholar(marks: Int):Boolean{
    return marks > 90
}