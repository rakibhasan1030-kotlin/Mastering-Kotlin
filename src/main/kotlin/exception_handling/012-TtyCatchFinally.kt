package exception_handling

/*
* KOTLIN EXCEPTION HANDLING
* KOTLIN HANDLING EXCEPTION WITH : try, catch, finally, throw
* TYPE OF KOTLIN EXCEPTION : ArithmeticException, ArrayIndexOutOfBoundException, NullPointerException
* */

fun main(){

    val a: Int = 25
    val b: Int = 0

    try {
        val res = a / b
    }catch (e: Exception){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Exception Message : ${e.message}")
    } finally {
        println("Finally will execute everytime, if exception occurred or not!")
    }
    println("This line will run after adding try-catch  for this program!")

}