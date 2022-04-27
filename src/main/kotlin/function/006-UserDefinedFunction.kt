package function

import kotlin.math.max
import kotlin.math.sqrt

fun main(){
    /* User Defined Function */
    val a : Int = 500;
    val b : Int = 100;
    add(a, b)
    println("Subtraction of ($a - $b) = ${subtract(a, b)}")
}

fun add(a : Int, b : Int){ /* by default its return type is Unit (which is similar to void) */
    println("Sum of ($a + $b) = ${a+b}")
}

fun subtract (a : Int, b: Int) : Int {
    return a - b
}