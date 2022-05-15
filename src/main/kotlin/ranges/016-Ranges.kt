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

    intRng.forEach {
        println(it)
    }

    for (i in longRng){
        println(i)
    }

    charRng.forEachIndexed { index, c ->
        println(" $index : $c")
    }

}