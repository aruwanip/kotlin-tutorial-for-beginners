fun main() {
    println("Hello World")
    variables()
}

fun variables() {
    // Use "var" keyword to create mutable variables
    var fullName = "Donn Felker"
    println(fullName)

    fullName = "John Felker"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty())

    var age = 30
    age = 32
    println(age)

    // Use "val" keyword to create immutable / readonly variables
    val name = "Donn Felker"
    println(name)

    // Providing type on variable
    val firstName: String = "Donn"
    println(name::class)

    var currentAge: Int = 32
}
