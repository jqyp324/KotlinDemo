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
}

fun sum(a: Int, b: Int) = a + b

fun myPrint() {
    println("4 + 5 = ${sum(4, 5)}")
}
