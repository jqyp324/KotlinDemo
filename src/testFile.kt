fun main(args:Array<String>){

//    var arrs = arrOfMinusOnes(0)
    var arrs = arrOfMinusOnes(0)

//    for (a in arrs) println(a)
//    arrs = null
    val l = arrs.size
    println(l)
}

fun arrOfMinusOnes(size: Int): IntArray{
    return IntArray(size).apply{ fill(-1) }
}