package first

fun main(args: Array<String>) {
    println("===空安全===")

    var a:Int? = 5
    a = null
    println(a.toString())

    var aStr:String? = "abc"
//    println(aStr.length)
    aStr = null
    println(aStr?.length)

    println(aStr?.length ?: -1)

    val l = aStr !!.length
    println(l)
}