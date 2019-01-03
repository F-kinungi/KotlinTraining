package ClassAndObject


fun main(args: Array<String>) {

    val francis = Person()
    francis.actualAge = 33
    francis.age = 35

    println("Francis: actual age = ${francis.actualAge}")
    println("Francis: pretenting age = ${francis.age}")

}



class Person {

    var age:Int = 0

    get() = field
    set(value) {
        field = if (value < 18)
            18
        else if (value >= 18 && value <= 30)
            value
        else
            value-3
    }
    var actualAge: Int = 0

}