fun main(){
    println("Enter the number")
    var a = readLine()
    var b:Int  = a!!.toInt()
    var oddeven = if(b%2==0)
                      "The number is even"
                  else
                      "The number is odd"
    println(oddeven)
}