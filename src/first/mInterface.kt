package first

fun main(args: Array<String>) {
    println("===Interface===")

    val myChild = Child()
    myChild.bar()
    myChild.foo()
    myChild.foo1()
    println(myChild.myProperty)
    println(myChild.myProperty1)
}

interface MyInterface{
    val myProperty: String
    val myProperty1: Int
        get() = 1

    fun bar()
    fun foo()
    fun foo1(){
        println("MyInterface foo1")
    }
}

class Child:MyInterface{
    override val myProperty: String = "yupeng"
    override val myProperty1: Int
//        get() = super.myProperty1 + 1
        get() = 3

    override fun foo() {
        println("child all foo")
    }

    override fun bar() {//实现
        println("child call bar")
    }

    override fun foo1() {//重写
        super.foo1()
        println("child call foo1")
    }

}

//interface A {
//    fun foo() { print("A") }
//    fun bar()
//}
//
//interface B {
//    fun foo() { print("B") }
//    fun bar() { print("bar") }
//}
//
//class C : A {
//    override fun bar() { print("bar") }
//}
//
//class D : A, B {
//    override fun foo() {
//        super<A>.foo()
//        super<B>.foo()
//    }
//}
/** A B 接口都有声明了 foo() bar() 函数。它们都实现了 foo() 方法，但只有 B 实现了 bar() ,bar() 在 A
中并没有声明它是抽象的，这是因为在接口中如果函数没有函数体，那么默认是抽像的。现在，如果我们从 A 中
派生一个 C 实体类，显然我们需要重写 bar() ，并实现它。而我们从 A 和 B 派生一个 D ，我们不用重写
bar() 方法，因为我们的一个继承中有一个已经实现了它。但我们继承了两个 foo() 的实现，因此编译器不知道
应该选哪个，并强制我们重写 foo() 并且明确指出我们想怎么实现。**/