package function


/*
* Higher Order Function : A function that takes function as argument or parameter
* Lambda : Has no name, curly braces {} takes variables as parameter or body of that function
*          also, the body of function is written, after variable followed by -> operator
* */
fun main() {
    var a: Int = 5
    var b:Int = 8

    println("Sum of $a and $b is = ${sumFunctionNormal(a, b)}")

    sumFunctionHOFLastParameter(a, b){
        println("Sum of $a and $b is = $it")
    }

    sumFunctionHOFBeforeLastParameter(a, summation = {
        println("Sum of $a and $b is = $it")
    }, b)

    sumFunctionHOFMultipleParameter(a, b) {sum, message ->
        println("Sum of $a and $b is = $sum\tMessage : $message")
    }

    sumFunctionHOFNonUnitReturnType(a, b){sum, message ->
        println("Sum of $a and $b is = $sum\tMessage : $message")
        sum + (sum * 2)
    }

}
/* Normal Function */
fun sumFunctionNormal(a: Int, b: Int): Int {
    return a + b;
}

/* Higher Order Function (Lambda as last parameter) */
fun sumFunctionHOFLastParameter(a: Int, b: Int, summation: (Int) -> Unit){
    summation(a+b)
}

/* Higher Order Function (Lambda as last parameter) */
fun sumFunctionHOFBeforeLastParameter(a: Int, summation: (Int) -> Unit, b: Int){
    summation(a+b)
}

/* Higher Order Function (Lambda as multiple parameter) */
fun sumFunctionHOFMultipleParameter(a: Int, b: Int, summation: (Int, String) -> Unit){
    summation(a+b, "Operation Successful!")
}

/* Higher Order Function (Lambda as non-unit return type) */
fun sumFunctionHOFNonUnitReturnType(a: Int, b: Int, summation: (Int, String) -> Int){
    var res = summation(a+b, "Operation Successful!")
    println("Total result after return = $res")
}