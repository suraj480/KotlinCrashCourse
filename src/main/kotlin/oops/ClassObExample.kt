package oops

fun main() {
    println("Program started")
    var student1 = Student()
    student1.name = "Suraj maurya"
    student1.id = 9823
    student1.about = "software engineer"
    println(student1.name)
    println(student1.id)
    println(student1.about)
    println(student1.sayHello())

    var student2 = Student()
    student2.name = "Ankit"
    student2.id = 1234
    student2.about = "backend engineer"
    println(student2.printDetails())
}

//class object

//how to create class

class Student {
    var name: String = ""
    var id: Int = 0
    var about: String = ""

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
