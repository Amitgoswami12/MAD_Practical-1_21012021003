fun main()
{
    println("21012021003_AMIT GOSWAMI\n")

    print("ENTER NUMBER : ")
    val n : Int = readLine()!!.toInt()
    println("Factorial of $n : ${fact(n)}")
    println("By Tailrec Keyword, Factorial of $n : ${factTail(n)}")
}
fun fact(n:Int):Int
{
    var f=1
    for (i in 1..n) {
        f *= i
    }
    return f
}
tailrec fun factTail(n:Int):Int
{
    return if (n==1) 1 else n * factTail(n-1)
}