package ranges

/*
*  Interval from start to int
*  operator : two dot(..)
*  In range keyword : in and not in range keyword : !in
*  Integral type of ranges (IntRange, LongRange, CharRange)
* */

fun main(){

    val intRng : IntRange = 1..9

    val check : Boolean = 5 in intRng
    println(check) /* TRUE */

    if (2 in intRng) {
        println("TRUE")
    } else {
        println("FALSE")
    }

}