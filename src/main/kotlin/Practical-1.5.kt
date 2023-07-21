fun main()
{
    println("21012021003_AMIT GOSWAMI\n")

    print("Enter month number : ")
    when (readLine()!!.toInt()) {
        1 -> print("MONTH = January")
        2 -> print("MONTH = February")
        3 -> print("MONTH = March")
        4 -> print("MONTH = April")
        5 -> print("MONTH = May")
        6 -> print("MONTH = June")
        7 -> print("MONTH = July")
        8 -> print("MONTH = August")
        9 -> print("MONTH = September")
        10 -> print("MONTH = October")
        11-> print("MONTH = November")
        12 -> print("MONTH = December")
        else -> {
            print("Enter proper month number")
        }
    }
}