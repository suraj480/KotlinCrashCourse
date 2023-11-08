fun main(){
    println("Enter your name")
    val name = readln()
    println("Hello ${name}")
    //  take a number from user
    println("Enter number : ")
    val number: Int = readln().toInt()
    if (number > 0)
    {
        println("$number number is positive")
    } else if (number < 0)
    {
        println("$number number is negative")
    } else
    {
        println("number is zero")
    }

}

//    println("Enter first number:")
//    val number1 = readln().toInt()
//    println("Enter second number:")
//    val number2 = readln().toInt()

//    if (number1 > number2)
//    {
//        println("Number $number1 is max")
//    } else {
//        println("Number $number2 is max")
//    }

//    val max = if (number1 > number2)
//        number1
//    else
//        number2
//
//    println("Number $max is maximum")
//}