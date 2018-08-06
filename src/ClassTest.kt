fun main(vararg :Array<String>){
    println("=====")

    var myPerson:Person = Person("haha")
    println(myPerson.lastName)
    myPerson.lastName = "haha"
    println(myPerson.lastName)
    println(myPerson.name)


}


class Person constructor(firstName:String){
    lateinit var name:String
    init {
        name = "peng".toUpperCase()
    }

    var lastName:String = "yu"
        get() = field.toUpperCase()
        set

    var no:Int = 100
        get
        set(value) {
            if (value > 100)
                field = value
            else
                field = -1
        }

    var heigh:Float = 145.0f
        private set
}