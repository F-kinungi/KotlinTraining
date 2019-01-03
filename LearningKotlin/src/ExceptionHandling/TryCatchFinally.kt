package ExceptionHandling

/**
 * Exception is a runtime problem which occur in the program and leads to
 * program termination. this maybe occur due to running out memory space,
 * array out of bound condition like divided by zero. To handle this type
 * of problem during program execution the technique of execution handling is used
 *
 * There are four different keywords used in exception
 *
 * 1. try: it contains set of statements which might generate an exception
 * 2. catch: catch block is used to catch the execution thrown from try block
 * 3. finally: finally block always execute whether exception is handled or not.
 *   it is used to execute important code statement
 * 4. throw: throw keyword is used t throw an exception explicitly
 *
 *
 * following are some example of unchecked exception
 *
 * 1. ArithmeticException: thrown when divide a number by zero
 * 2. ArrayIndexOtOfBoundException: thrown when an array has been tried access
 *   with incorrect index value
 * 3. SecurityException:Thrown by the security manager to indicate a security violation
 * 4. NullPointerException: thrown when invoking a method or property on a null object
 *
 * */

//try catch
fun main(args: Array<String>) {

    val str = getNumber("10")
    println(str)

}
fun getNumber(str: String): Int {

    return try {
        Integer.parseInt(str)
    }catch (e: ArithmeticException){
        0
    }
}