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

}

fun <T> MutableList<T>.swap(x:Int,y:Int){
    val tmp = this[x]
    this[x] = this[y]
    this[y] = tmp
}


