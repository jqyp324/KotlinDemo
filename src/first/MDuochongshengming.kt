package first

fun main(args: Array<String>) {
    println("===多重申明===")

    println(chong().toString())

}

fun chong(): Pair<String, Int> {
    val name:String = "yupeng"
    val age = 18
    return Pair(name,age)
}