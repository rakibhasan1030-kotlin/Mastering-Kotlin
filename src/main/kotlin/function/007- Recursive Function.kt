package function

fun main(){
    var a : Long = 10
    println(recSum(a, 0))
}

tailrec fun recSum(n : Long, sum : Long) : Long{
    return if(n < 1){
        sum;
    }else{
        recSum(n-1, n + sum)
    }
}