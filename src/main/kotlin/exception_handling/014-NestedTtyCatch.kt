package exception_handling

/*
* KOTLIN EXCEPTION HANDLING
* KOTLIN HANDLING EXCEPTION WITH : try, catch, finally, throw
* TYPE OF KOTLIN EXCEPTION : ArithmeticException, ArrayIndexOutOfBoundException, NullPointerException
* */

fun main(){

    val a: Int = 25
    val b: Int = 0

    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5)

    try {

        try {
            println("10th element of this array is : ${arr[9]}")
        } catch (e: java.lang.IndexOutOfBoundsException){
            e.printStackTrace() /* it'll print the exception in terminal */
            println("Exception Message : ${e.message}")
        }
        val res = a / b
    } catch (e: ArithmeticException){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Something is wrong!")
    } catch (e: Exception){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Something is wrong!")
    } finally {
        println("Finally will execute everytime, if exception occurred or not!")
    }
    println("This line will run after adding try-catch  for this program!")
}