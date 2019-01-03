package acadamy.learningKotlinProgramming.LazyFunction

//we can use lazy to avoid waste of memory
val pi:Float by lazy {
    3.14f
}
fun main(args: Array<String>) {
    println(args.size)
    println("Hello world")

    val area = pi * 7 *7 // variable pi is initialized with 3.14
    println(area)

    val area2 = pi *10 * 5   // this time the variable pi will not be initialized again because it is catch memory
    println(area2)
}

// property of lazy initialization
// 1. It was designed to prevent unnecessary initialization of objects
// 2. your variable will not be initialized unless you use it in your code
// 3. it is initialized only once. Next time when you use it, you get the value from cache memory

// lazy initialization is thread safe
// it is initialized in the thread where it is used for the first time
  // other threads use the same value stored in cache.

// The variable can be val or var
// The variable can be nullable or non-nullable














