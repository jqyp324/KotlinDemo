package first


import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    println("===代理===")

    val base = ProxyBaseImpl()
    Derived(base).print()

    val myExample = Example()
    myExample.myvar = "yupeng"
    println(myExample.myvar)

//    Delegates.observable("")
//    var name: String by Delegates.observable("<no name>") {
//        d.old,new -> println("$old -> $new")
//    }



}


//class User(val map: Map<String, Any?>) {
//    val name: String by Delegates.mapVal(map)
//    val age: Int     by Delegates.mapVal(map)
//}

//class User {
//    var name: String by Delegates.observable("<no name>") {
//        d.old,new -> println("$old -> $new")
//    }
//}

interface ProxyBase{
    fun print()
}

class ProxyBaseImpl:ProxyBase{
    override fun print() {
        println("ProxyBaseImpl")
    }
}

class Derived(d:ProxyBase):ProxyBase by d

class Example{
    var myvar :String by MyDelegate()
}

class MyDelegate{
    operator fun getValue(example: Example, property: KProperty<*>): String {
        return "$example ===delegate===${property.name}"
    }

    operator fun setValue(example: Example, property: KProperty<*>, s: String) {
        println("set")

    }
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, thank you for delegating '${property.name}' to me!"
//    }
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        println("$value has been assigned to '${property.name} in $thisRef.'")
//    }


}