package functions

/**
 *    Inline function
 *
 * An inline function is declared with a keyword, The use of inline function enhances the performance of
 * higher order function. The inline function tells the compiler to copy
 * parameter and functions to the call site
 *
 * The virtual function or local function cannot be declared as inline.
 * following are some expressions and declaration which are not support anywhere
 * inside the inline function
 *
 * 1 declaration of local class
 * 2. Declaration of inner nested classes
 * 3. Function expressions
 * 4.Declarations of local function
 * 5. default value for optional parameters
 *
 *
 * */
fun main(args: Array<String>) {

    inlineFunction({ println("callin inline function")})
}

inline fun inlineFunction(myFun: () -> Unit) {
    println("Code inside inline function")

}