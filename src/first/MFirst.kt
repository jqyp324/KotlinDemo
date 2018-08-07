package first

/**
 * Created by hubery on 2018/8/6.
 * http://www.kotlindoc.cn/GettingStarted/Basic-Syntax.html
 */


fun main(args: Array<String>) {
    println("==========")
    println(sum(5, 6))
    myPrint()

    var f = 10
    println(f)
    val name = "nihao"
    val ff: String
    ff = "yupeng"
    println(name)
    println(ff)
    f += 4
    println(f + 4)
    println(ifHanshu(5,6))
    println("the value is ${ifNull("1")}")
    println("the value is ${ifNull("a")}")
    println("the 1 is type of ${isString(1)}")


    val mylist = listOf("1","2","3")
    println(mylist.javaClass)

    for (item in mylist){
        println(item)
    }

    for (index in mylist.indices){
        println("$index is ${mylist[index]}")
    }

}

fun sum(a: Int, b: Int) = a + b

fun ifHanshu(a:Int,b:Int) = if (a > b) a else b

fun ifNull(str:String):Int?{
    return str.toIntOrNull()
}

fun isString(str: Any) = str is String


fun myPrint() {
    println("4 + 5 = ${sum(4, 5)}")
}
