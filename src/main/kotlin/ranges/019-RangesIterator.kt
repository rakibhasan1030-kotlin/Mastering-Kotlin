package ranges

/*
* Using Iterator function we can use while loop
* */

fun main(){

    val charRng : CharRange = 'a'..'z'
    val c: CharIterator = charRng.iterator() /* access iterator function to charRng range */

    while (c.hasNext()){ /* hasNext() return a boolean value true, if there is any next value in the object. Otherwise, return false and break the loop */
        val i = c.next()
        println(i)
    }

}