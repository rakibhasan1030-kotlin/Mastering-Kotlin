package exception_handling

/*
* KOTLIN EXCEPTION HANDLING
* KOTLIN HANDLING EXCEPTION WITH : try, catch, finally, throw
* TYPE OF KOTLIN EXCEPTION : ArithmeticException, ArrayIndexOutOfBoundException, NullPointerException
* */

fun main(){

    val a: Int = 1
    val b: Int = 4

    try {
        println("Sum of $a and $b is : ${summation(a, b)}") /* if this line don't wrapped with try-catch, then line bellow this line will not execute */
    }catch (e: Exception){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Exception Message : ${e.message}")
    }
    println("This line will run after adding try-catch  for this program!")

}

fun summation(a: Int, b: Int): Int{
    if (a<b){
        throw MyException("a cannot less than b!") /* throw a custom created exception */
        throw ArithmeticException("a cannot less than b!") /* throw a build in exception */
    }
    return a+b;
}

/* create a custom exception class */
class MyException(message: String): Exception(message){

}




