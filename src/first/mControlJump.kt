package first

fun main(args: Array<String>) {
    println("===controljump===")

    loop@ for (i in 1..10){
        if (i == 4)
            break@loop
        println("loop $i")
    }

    val ints = IntArray(4) {it}
    for (item in ints)
        println("===$item")

    ints.forEach llit@ {
        if (it == 2)
            return@llit
        println("for each 2 $it")
    }

    ints.forEach {
        if (it == 3)
            return@forEach
        println("for each 2 $it")
    }

    ints.forEach {
        if (it == 2)
            return
        println("for each 1 $it")
    }



}