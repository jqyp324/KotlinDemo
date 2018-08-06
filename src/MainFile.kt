fun main(vararg: Array<String>) {
    println("=======")
//    println(sumAdd(4,5))
//    var a = "this is a"
//    val b = "this is b = $a"
//    println(b)
//    printArgs("1","2","asdf")
//    println(maxof(12,45))
//    testwhen(9)
    var intsrrs = IntArray(5, { i: Int -> i })
    printArrs(intsrrs)

}

fun sumAdd(x: Int, y: Int): Int {
    return x + y
}

fun printArgs(vararg v: String) {
    for (vt in v) {
        println(vt)
    }
}

fun maxof(a: Int, b: Int): Int = if (a > b) a else b

fun testwhen(a: Int) {

//    when (a){
//        1 -> println(a.toString())
//        2 -> println("bbbb")
//        else -> println("null")
//    }
    when (a) {
        in 1..10 -> println("this is number:$a")
        else -> println("this not number:$a")
    }

}

fun printArrs(arrs: IntArray) {

//    for (item in arrs) println(item)

    val stringBuffer = StringBuffer()
//    for (index in arrs.indices) {
//        stringBuffer.append("${arrs[index]},")
//    }

    for ((key,value) in arrs.withIndex()){
        stringBuffer.append("$value,")
    }

    var result: String
    if (stringBuffer.endsWith(',')) result = stringBuffer.substring(0, stringBuffer.length - 1) else result = stringBuffer.toString()
    println(result)

}