package first

fun main(args: Array<String>) {
    println("===高阶函数===")
    var ints = listOf(1, 2, 3, 4)
    val doubled = ints.map(::argAdd)
//    val doubled = ints.map { i, j -> i * j * 2 }
    println(doubled)

    val ss = { x: Int, y: Int -> x * y }//函数文本语法
    println(ss(4, 5))

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println(sum(4,5))

    println(ints.filter { it -> it>2 })

    var count:Int = 0
    ints.filter { it > 2 }.forEach{
        count++

    }
    println(count)

    val sum2 = fun Int.(other:Int) :Int = other * this
    println(2.sum2(2))
//    println(2 sum2 5)

}

fun argAdd(arg1: Int, arg2: Int): Int {
    return arg1 * arg2
}


fun <T, R> List<T>.map(transform: (T, T) -> R): List<R> {
    val list = arrayListOf<R>()
    for (item in this)
        list.add(transform(item, item))
    return list
}