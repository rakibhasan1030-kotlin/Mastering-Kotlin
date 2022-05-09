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
        println("10th element of this array is : ${arr[9]}")
        val res = a / b
    } catch (e: IndexOutOfBoundsException){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Exception Message : ${e.message}")
    } catch (e: ArithmeticException){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Exception Message : ${e.message}")
    } catch (e: Exception){
        e.printStackTrace() /* it'll print the exception in terminal */
        println("Exception Message : ${e.message}")
    } finally {
        println("Finally will execute everytime, if exception occurred or not!")
    }
    println("This line will run after adding try-catch  for this program!")

}