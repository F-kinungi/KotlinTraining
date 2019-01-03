package acadamy.learningKotlinProgramming.Generics


fun main(args: Array<String>) {
    val stringList = arrayListOf<String>("Susan","Francis","Diasy")
    val names = stringList[0]
    println("Printing the string value of stringList: $names")

    printValue(stringList)

    val floatList = arrayListOf<Float>(10.3f,18.4f,53.2f)
    //val floatingNumbers = floatList[2]
    printValue(floatList)
}

// generic function
fun <T>printValue(list:ArrayList<T>){
   for (element in list){
       println(element)
   }
}