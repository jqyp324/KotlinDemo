package first

/**
 * Created by hubery on 2018/8/12.
 */
fun main(args: Array<String>) {
    println("===枚举===")
    println(EnumClass.RED.rgb)
    println(EnumClass.YELLOE.rgb)

    println(EnumClass.valueOf("RED").rgb)

    for ( item in EnumClass.values())
        println("===$item===")
}

enum class EnumClass(val rgb:Int){
    RED(123),
    YELLOE(666)
}