package first

/**
 * Created by hubery on 2018/8/14.
 */
fun main(args: Array<String>) {
    println("===函数和lambda表达式===")

    println(1.shl(1))

    println(1 shl 2) //用中缀注解调用扩展函数

    println(addNum(3))

    val ll = intArrayOf(1,2,3,4)

    println("可变参数的个数为:" + kebian(1,2,3,4,*ll))

    println(findFixPoint(0.3))
}

infix fun Int.sh1(x:Int):Int{
    return this + x
}

fun addNum(x:Int,y:Int = 3):Int{
    return x + y
}

fun kebian(vararg a:Int):Int{
    return a.size
}

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))