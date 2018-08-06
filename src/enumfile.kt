enum class Color{
    RED,BLACK,BLUE,GREEN,WHITE
}

fun main2(args: Array<String>) {
    var color:Color=Color.BLUE

    println(Color.values())
    println(Color.valueOf("RED"))
    println(color.name)
    println(color.ordinal)

}
/////////////////////////////////////////////////
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}



fun main(args: Array<String>) {
    printAllValues<RGB>() // 输出 RED, GREEN, BLUE
}
/////////////////////////////////////////////////////////////////
interface Factory<T> {
    fun create(): T
}


class MyClass1 {
    companion object : Factory<MyClass1> {
        override fun create(): MyClass1 = MyClass1()
    }
}