fun main() {
//    println("Hello World")
//    variables()
    numberTypes()
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

fun numberTypes() {
    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 // 64-bit signed integer

    // Decimals
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 64.00 // 64-bit floating point number

    // All number types in Kotlin are objects and therefore have methods
    println(myByte.toDouble())
    println(myByte.toLong()::class)

    val bigLong: Long = 1_000_000
    println(bigLong)

    println(myInt.plus(12))
    println(myInt.minus(12))
}
