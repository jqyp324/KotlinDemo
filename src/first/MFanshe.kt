package first

import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

@fancy var x = 5

fun main(args: Array<String>) {
    println("===反射===")

    val c = MyClass::class
    println(c)
    println(c.memberProperties)
    println(c.declaredMemberExtensionProperties)

//    ::为函数传递/获取变量的属性
    println(myInFun())
    println(myaniT(::myInFun))

    println(::x)
    println(::x.annotations)

    val C = MyClass::name
    println(C.get(MyClass()))
    println(C::name.javaGetter)

}

class MyClass{
    val name = "yupeng"
    val age = 18
}

fun myaniT(myInF:()->Int):Int{
    return myInF()
}

fun myInFun():Int{
    return 8
}