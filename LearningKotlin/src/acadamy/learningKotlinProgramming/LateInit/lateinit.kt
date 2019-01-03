package acadamy.learningKotlinProgramming.LateInit



// we can use lateinit keyword if we don't want to use null- safety
// but using lateinit we promise compiler that we will initialize lateinit variable before running the program
// otherwise it will throw exception

fun main(args: Array<String>) {
    val country = Country()
//    country.countryName = "Kenya"
//    println(country.countryName)
    country.setup()
}

class Country {

    lateinit var countryName: String
    fun setup() {
        countryName = "USA"
        println("The county name is $countryName")
    }
}

// lateinit properties
// 1. lateinit used only with mutable data type [var]
// 2. lateinit is used with non-nullable data type
// 3. lateinit values must be initialized before you use it