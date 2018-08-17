package first

fun main(args: Array<String>) {
    println("注解")



}

/**
 * 举例
 */
annotation class fancy

@fancy class MyAnicalClass{
    @fancy fun baz(@fancy str:String){

    }
}