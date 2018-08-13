package first

/**
 * 有时候我们想要创建一个对当前类有一点小修改的对象，但不想重新声明一个子类。
 * java 用匿名内部类的概念解决这个问题。Kotlin 用对象表达式和对象声明巧妙的实现了这一概念
 */

fun main(args: Array<String>) {
    println("===对象表达式===")

    val myObjext =object {
        var x:Int = 0
        var y:Int = 1
    }
    println(myObjext.x + myObjext.y)

    val myAA = object :AA(5){
        override val y: Int = 10
    }

    println(myAA.y)

    println(MyInstance.getMyname())
    println(MyInstance.hashCode())
    println(MyInstance.getMyname())
    println(MyInstance.hashCode())

    println(MyBansui.create().myBansuiVal)
    println(MyBansui.create().hashCode())
    println(MyBansui.create().hashCode())

}

open class AA(x:Int){
    open val y:Int = x
}

object MyInstance{

    fun getMyname():String{
        return "yupeng"
    }
}

interface Factory<T>{
    fun create():T
}

class MyBansui{
    companion object :Factory<MyBansui>{
        override fun create(): MyBansui {
            if(null == myBansui){
                myBansui = MyBansui()
            }
            return myBansui as MyBansui
        }

        var myBansui:MyBansui? = null
    }

    val myBansuiVal:String = "bansui"
}

