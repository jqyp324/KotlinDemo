package first

/**
 * Created by hubery on 2018/8/11.
 */


fun main(args: Array<String>) {
    println("===数据对象===")

    var person = Person("yupeng",18)
//    var person = null
    println(person)
    println(person.toString(1))

    val yupengPerson = person.copy(age = 17)
    println(yupengPerson)

    val (name,age) = yupengPerson
    println("the name = $name age = $age")

}

fun Any?.toString(i:Int):String{
    if (this == null) return "empty"
    return toString()
}

data class Person(val name:String,val age:Int)