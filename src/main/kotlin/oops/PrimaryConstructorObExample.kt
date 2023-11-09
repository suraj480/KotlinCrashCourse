package oops

fun main() {
    println("Program started")
    var student1 = Students("suraj maurya", 9823, "software engineer")

    println(student1.printDetails())
    var student2 = Students("Ankit", 123, "Back-end engineer")
    println(student2.printDetails())
}

class Students constructor(
    var name: String = "",
    var id: Int = 0,
    var about: String = ""
) {
    // add more properties
    fun sayHello() {
        println("hello i am $name")
    }
    fun printDetails() {
        println(name)
        println(id)
        println(about)
    }
}
