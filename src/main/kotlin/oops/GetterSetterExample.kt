package oops

class User {
    var UserId: String = "defaultId"
        get() {
            println("Getting values")
            return field
        }
        set(value) {
            println("Setting values")
            field = value
        }
}

fun main() {
    val user1 = User()
    user1.UserId="newId"
    println(user1.UserId)
}
