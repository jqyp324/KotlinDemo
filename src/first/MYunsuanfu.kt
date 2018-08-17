package first

fun main(args: Array<String>) {
    println("===运算符重载===")

    val a = 5
    println(a.plus(4))

    println(a.minus(4))

    println(a.inc())
    println(a.times(5)) //a*5
    println(a.div(3)) //a/3
    println(a.rem(3)) //a%3
//    标志	                转换
//    a[i]	                a.get(i)
//    a[i, j]               a.get(i, j)
//    a[i_1, ...,           i_n]	a.get(i_1, ... , i_n)
//    a[i] = b	            a.set(i, b)
//    a[i,j] =b	            a.set(i, j, b)
//    a[i_1, ... , i_n] = b	a.set(i_1,... ,o_n,b)

    /**
    表达式	转换
    a += b	a.plusAssign(b)
    a -= b	a.minusAssign(b)
    a *= b	a.timesAssign(b)
    a /= b	a.divAssign(b)
    a %= b	a.modAssign(b)
    **/

}