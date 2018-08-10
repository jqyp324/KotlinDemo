package first

/**Kotlin 支持函数扩展和属性扩展**/
private var mylist = listOf("a",1,"c")
private val myMusicList = mutableListOf("a",2,"c",6)

fun main(args: Array<String>) {
    println(mylist)
    println(mylist.javaClass)
    println(myMusicList)
    myMusicList.add(7)
    println(myMusicList)
    println(mylist.hashCode())
    mylist = myMusicList
    println(mylist.hashCode())
    println(mylist)

    println("=====$myMusicList=======")
    myMusicList.swap(0,2)
    println("=====$myMusicList=======")
    println(myMusicList.javaClass)
    println(mylist.javaClass)

    for (item in myMusicList)
        println("--${item.javaClass}--")

    val mystr = null
    println(mystr.toString())

}

fun <T> MutableList<T>.swap(x:Int,y:Int){
    val tmp = this[x]
    this[x] = this[y]
    this[y] = tmp
}

/**
 * 注意扩展可以使用空接收者类型进行定义。这样的扩展使得，
 * 即使是一个空对象仍然可以调用该扩展，然后在扩展的内部进行
 * this == null 的判断。这样你就可以在 Kotlin 中任意调用
 * toString() 方法而不进行空指针检查：空指针检查延后到扩展函数中完成。
 */
fun Any?.toString():String{
    if (this == null) return "empty"
    return toString()
}

