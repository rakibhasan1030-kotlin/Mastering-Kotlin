fun main(){

    var desc : String = "German Shepherd Info : \n" /* two types of String, 1. Raw (general string) 2. escaped string (\n, \t, \n, \r etc) */
    var name : String = "Ranger"
    var age : Int = 1
    var id : Long = 123456789258654 /* above 10 digit */
    var price : Float = 795.5f /* 32 bit */
    var discountedPrice : Double = 600.5 /* 64 bit */
    var codeName : Char = 'R'
    var isVaccinated : Boolean = true

    println("$desc Name : $name\n Age : $age\n ID : $id\n Price : $price\n Discounted Price : $discountedPrice\n Code Name : $codeName\n Is Vaccinated : $isVaccinated")

    var names : Array<String> = arrayOf("Ranger", "Roxy", "Raven")
    var ages : Array<Int> = arrayOf(1, 2, 1)

    println("First name in List - ${names[0]}")

    /* For primitive data-type */
    var intArray : IntArray = intArrayOf(1,2,3)
    var boolArray : BooleanArray = booleanArrayOf(true, false, true)
    var doubleArray : DoubleArray = doubleArrayOf(1.25,2.69,3.45)
    var charArray : CharArray = charArrayOf('R','V','H')
}