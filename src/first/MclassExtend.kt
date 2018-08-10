package first

fun main(args: Array<String>) {
    println("=====class and extends======")

    val myInvoice = Invoice("123")
    println(myInvoice.name)
    myInvoice.name = "haha"
    println(myInvoice.name)
    println(myInvoice.nameStr)

    val myInvoice2 = InvoiceTwo("fff")
    val myInvoChild = InvoiceChild(2)
    println("${myInvoChild.age}  ${myInvoChild.name}")
    println(myInvoChild.myName())

    val c = C()
    c.f()

    val myChild = ImplBase()
    println(myChild.runBase())

}

open class Invoice(var name:String) {
    val nameStr = name
    init {
        name = "init name"
    }
    open fun myName(): String {
        return name
    }
}

class InvoiceTwo internal constructor(var name:String) {
    val nameStr = name
    init {
        name = "init name"
    }
}

class InvoiceChild(var age:Int) : Invoice(age.toString()) {
    init {
        name = "child name"
    }

    //标记为override的成员是open的，它可以在子类中被复写。如果你不想被重写就要加 final:
    final override fun myName():String{
        return "childe $name"
    }
}

open class A(){

    open fun f() = println("A f")

    fun a(){
        println("A a")
    }
}

interface B{
    fun f(){
        println("B f")
    }

    fun b(){
        println("B b")
    }
}

class C :B,A(){
    override fun f() {
        println("C f")
        super<A>.f()
        super<B>.f()
    }
}

abstract class Base {
    abstract fun myBase(): String

    fun runBase(): String {
        return "run base ${myBase()}"
    }
}

class ImplBase:Base(){
    override fun myBase(): String {
        return "child Base"
    }
}