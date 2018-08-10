package first

import java.io.File


fun main(args: Array<String>) {
    println("==========")
    println("defaultfun = ${defaultFun(-1,5)}")

    val myList = listOf(1,2,3,4,5)
    println(myList)
    println(myList.filter { x -> x > 3 })
    println(myList.filter { it > 4 })
    println(myList)

    val myMap = linkedMapOf(1 to "a",2 to "b")
    println(myMap)
    println(myMap.javaClass)
    println(myMap.size)
    for ((k,v) in myMap)
        println("key is $k values is $v")

    for (i in 1..5)
        println("for index : $i")

    for (i in 1 until 5)
        println("for until : $i")

    for (i in 10 downTo 5 step 2)
        println("downtTo : $i")

    val layVal:String by lazy { //懒加载
        "name"
    }
    println(layVal)

    val a = "yupeng"
    println(a.spaceAdd1())

    val files = File("d1://").listFiles()
//    files?.let { "file is empyt" }
//    println(files?.size ?: "temp")
//    for (item in files?:return)
//        println("d: --> $item?")



    val data = mapOf("email" to 1)
    val email = data["email"] ?: throw IllegalStateException("Email is missing!")

    println(arrOfMinusOnes(3).javaClass)

    val paintPic = PaintPic()
//    paintPic.drawPic("my pic")
    with(paintPic){
        setSize()
        for (i in 1..3)
            drawPic("is $i")
    }

    val asc = Array(5, {i -> (i * i).toString() })
    println(asc.javaClass)
    for (item in asc)
        println("asc==$item")


    val text = """for (c in "for")
                    print(c)
               """
    println(text)
}

data class Customer(val name:String,val agent: Int,var birthday:String)

fun defaultFun(a:Int = 5,b:Int) = a + b

fun String.spaceAdd1(){
    this.slice(0..2)
}
fun arrOfMinusOnes(size: Int): IntArray{
	return IntArray(size).apply{ fill(-1) }
}

class PaintPic{
    fun setSize(){
        println("set size")
    }
    fun drawPic(pic:String){
        println("drawPic:$pic")
    }
}