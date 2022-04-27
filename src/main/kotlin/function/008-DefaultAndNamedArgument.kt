package function

fun main(){
    /* Default Argument - we can pass no argument, or we can pass one or two arguments
    *  if we pass no arguments, then it'll execute the default value which is set in
    *  the function, or if we pass one or two argument, then it'll override the passed
    *  argument with default */
    defaultArgumentFun()
    defaultArgumentFun("RAKIB")
    defaultArgumentFun("RAKIB", 1234)


    /* Named Argument - we can pass value in a function by its name, which is declared
    *  in that function. And we also, if we use named argument then we don't have to
    *  maintain the serialization of parameter */
    namedArgumentFun(id=12345)
}

/* Default Argument */
fun defaultArgumentFun(name : String = "Rakib Hasan", id : Long = 123456789){
    println("Name : $name\nID : $id")
}

/* Default Argument */
fun namedArgumentFun(name : String = "Rakib Hasan", id : Long = 123456789){
    println("Name : $name\nID : $id")
}