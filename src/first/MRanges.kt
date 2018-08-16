package first

/**
 * Created by hubery on 2018/8/16.
 */
fun main(args: Array<String>) {
    println("===Ranges===")

    val i=11

    if(i in 0..10 ){
        println(i)
    }

    if(i !in 0..10 ){
        println(i)
    }

    for (i in 1..4) print(i)
    println()
    for (i in 4 downTo  1) print(i)
    for (i in 4.downTo(1)) print(i)



    if ("isled" in "island".."isle") println("ok")

    for (i in (1..4).reversed()) println(i)

}

interface Progression<N : Number> : Iterable<N> {
    val start : N
    val end : N
    val increment : Number
}

//class IntProgression(override val start: Int, override val end: Int, override val increment: Int ): Progression<Int> {
//    override fun iterator(): Iterator<Int> = IntProgressionIteratorImpl(start, end, increment)
//}