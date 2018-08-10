package first

/**
 包下申明
默认使用 public ,这意味着你的声明在任何地方都可见；
如果你声明为 private ，则只在包含声明的文件中可见；
如果用 internal 声明，则在同一模块中的任何地方可见；
protected 在 "top-level" 中不可以使用
 **/

private fun foo() {} // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere

private set // setter is visible only in example.kt

internal val baz = 6 // visible inside the same module


open class Outer {
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4 // public by default
    protected class Nested {
        public val e: Int = 5
    }
}
class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible // Nested and e are visible
}
class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}