

    class student(var name:String):Person(firstname = "" ,lastname ="")
    {
        var enrollmentno:String ="21012021003"

        constructor(name: String , enrollmentno: String):this(name){

            var enroll = enrollmentno
        }
        init {
            println("init called....")
        }

        override fun toString(): String {
            return super.toString()
        }


}

    open class Person(firstname:String,lastname:String){
    var first = firstname
    var last = lastname
        init {
            println("inti a base class")
        }
    }
    fun main(){
        val s = student("Amit")
        println(s.name)
        println(s.enrollmentno)
        println(Person("Amit","Goswami"))
    }