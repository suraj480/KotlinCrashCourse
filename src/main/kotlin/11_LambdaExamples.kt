fun main() {
    val square = { x: Int -> x * x }
    val addition = { a: Int, b: Int -> a + b }
    val lambdaFunction = {
        println("hi i am lambda function")
    }
    lambdaFunction()
    println(square(4))
    println(addition(5, 7))
}
