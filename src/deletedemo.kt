import kotlin.properties.Delegates

class Foo {
    var notNullBar: String by Delegates.notNull<String>()
}

//fun example(computeFoo: () -> Foo) {
//    val memoizedFoo by lazy(computeFoo)
//
//    if (someCondition && memoizedFoo.isValid()) {
//        memoizedFoo.doSomething()
//    }
//}


fun main(args:Array<String>){
    var foo = Foo()
    foo.notNullBar = "bar"
    println(foo.notNullBar)
}

