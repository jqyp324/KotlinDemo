package first

/**
 * Created by hubery on 2018/8/12.
 */
fun main(args: Array<String>) {
    println("===嵌套表达式===")
    println(MyOuter.Nested().foo())

    println(MyOuter1().InnerClass().foo())
    println(MyOuter1().InnerClass().getSuper().bar)
}

class MyOuter{
    private val bar:Int = 1
    class Nested{
        fun foo() = 2
    }
}

class MyOuter1{

    internal val bar:Int = 2

    inner class InnerClass{
        fun foo() = 3

        fun getSuper() = this@MyOuter1
    }
}