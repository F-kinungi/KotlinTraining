package Enummulation


fun main(args: Array<String>) {

    // we can access the color value of a specific cardtype

    val color = CreditCardType.SILVER.color
    println("My credit card color is: $color")

    // we can invoke the overridden methods of the anonymous constant classes with

    val cashbackPercent = CreditCadrdType.SILVER.calculateCashbackPercent()
    println("silver cashbackPercent is: $cashbackPercent ")

}

// create and initialize Enum constants
enum class CreditCardType (val color:String){
    SILVER("gray"),
    GOLD("blue"),
    PLATINUM("black")


}
// we can defined specific enum constant behaviour by creating them as
// anonymous classes.
enum class CreditCadrdType{
    SILVER {
        override fun calculateCashbackPercent() = 0.25f
    },
    GOLD{
        override fun calculateCashbackPercent() = 0.5f
    },
    PLATINUM {
        override fun calculateCashbackPercent() = 0.75f
    };

    abstract  fun calculateCashbackPercent(): Float
}