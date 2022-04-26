fun main(){
    /**
     * two types of variable - 1.var(which can be modify), 2.val(which can't be modified, like final)
     * var Or val contain any type of data-types, and it auto-detects the variable type
     * */
    var a = "Hey!"
    val b = "Kotlin"

    a = "Hello" /* re-assigned 'a' variable, but cannot re-assigned 'b', because it is val type */

    println("$a $b")

}