fun sumTwoNumbers(
    number1: Int,
    number2: Int,
    callBack: () -> Unit
) {
    println("Sum of two numbers is ${number1 + number2}")
    callBack()
}

fun cube(number: Int, callBack: (message: String) -> Unit) {
    println("Cube is ${number * number * number}")
    callBack("cube calculated")
}

fun sumNNumbers(vararg nums: Int) {
    var sum = 0
    for (value in nums) {
        println(value)
        sum += value
    }
    println("sum is $sum")
}

fun nNames(vararg names: String) {
    println(names::class.java.name)

}

fun main() {
    val callBackfunction = { println("sum completed") }

    sumTwoNumbers(6, 8, callBackfunction)

    cube(3) {
        println(it)
    }
    sumNNumbers(12, 23, 12, 12)
    nNames("surajM")
}
