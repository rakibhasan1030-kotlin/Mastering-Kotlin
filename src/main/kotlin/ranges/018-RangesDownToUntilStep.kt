package ranges

/*
*  Interval from start to int
*  operator : two dot(..)
*  In range keyword : in and not in range keyword : !in
*  Integral type of ranges (IntRange, LongRange, CharRange)
* */

fun main(){

    val intRng : IntRange = 1..9
    val longRng : LongRange = 10L..20L
    val charRng : CharRange = 'a'..'z'

    for (i in 9 downTo 1){
        println(i)
    }

    for (i in 1 until  9){
        println(i)
    }

    for (i in 10..20 step 2){
        println(i)
    }

}