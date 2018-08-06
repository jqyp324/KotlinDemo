fun main(args:Array<String>){

    println("========")
    var per = User("123")
    var per1 = per.copy("456")
    println(per)
    println(per1)

}

data class User constructor(var name:String){

}