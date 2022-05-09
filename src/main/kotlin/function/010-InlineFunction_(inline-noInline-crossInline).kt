package function

/*
* Inline : this keyword is used for improve performance.
*          Can only use in higher order function.
*
* CrossInline : if you don't want return then use this!
* NoInline : if you don't want any specific lambda, not to inline, then use it!
* */

fun main(){
    var a: Int = 10
    var b:Int = 5

    calculation(a, b, summation = { result ->
        /* this is a inline lambda, no object will create for this function */
        if(result < 10) return
        println("Summation of $a and $b is = $result")
    }, division = { result ->
        /* this is a cross inline lambda, return is not allowed here */
        println("Division of $a and $b is = $result")
    }, multiplication = { result ->
        /* this is a no inline lambda, an object will be created for this function */
        println("Multiplication of $a and $b is = $result")
    })
}

inline fun calculation(a: Int, b: Int,
                       summation: (Int) -> Unit,
                       crossinline division: (Int) -> Unit,
                       noinline multiplication: (Int) -> Unit){
    summation(a+b)
    division(a/b)
    multiplication(a*b)
}