package ranges

/*
*  Utility Function : rangeTo, downTo, reverse, step
* */

fun main(){




    /* three-way to write range */
    val intRngFirstWay : IntRange = 1..9
    val intRngSecondWay : IntRange = 1.rangeTo(9)
    val intRngThirdWay : IntRange = IntRange(1,9)

    intRngFirstWay.forEach {
        println(it)
    }

    println("___________________________________________________")

    /* downTo range */
    val intDownToRng: IntProgression  = 9.downTo(1)

    intDownToRng.forEach {
        println(it)
    }

    println("___________________________________________________")

    val reversedRng = intRngFirstWay.reversed()
    reversedRng.forEach {
        println(it)
    }

    println("___________________________________________________")

    val reversedRngWithStep = intRngFirstWay.reversed().step(3)
    reversedRngWithStep.forEach {
        println(it)
    }

    println("___________________________________________________")

    val first = intRngSecondWay.first
    val last = intRngSecondWay.last

    println("First value of the range is $first")
    println("Last value of the range is $last")

}