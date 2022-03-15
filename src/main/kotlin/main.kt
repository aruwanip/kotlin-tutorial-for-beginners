fun main() {
//    println("Hello World")
//    variables()
//    numberTypes()
//    strings()
    booleanType()
}

fun variables() {
    // Use "var" keyword to create mutable variables
    var fullName = "Jane Doe"
    println(fullName)

    fullName = "Jane Doe"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty())

    var age = 30
    age = 32
    println(age)

    // Use "val" keyword to create immutable / readonly variables
    val name = "Jane Doe"
    println(name)

    // Providing type on variable
    val firstName: String = "Jane"
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

fun strings() {
    var fullName: String = "Jane Doe"
    println(fullName.length)
    println(fullName.lowercase())

    // Single quote: Char
    // Double quote: String
    val c: Char = 'x' // 16-bit Unicode character

    var foo: String = "y"

    // Multi-line string
    var message: String = "Hello,\nMy name is Jane Doe.\nHow are you?"
    println(message)
    message = """
        Hello,
        My name is Jane Doe.
        How are you?
    """.trimIndent()
    println(message)
    message = """
        Hello,
        My name is Jane Doe.
        How are you?
    """
    println(message)
    message = """
        Hello,
        My name is Jane Doe.
        How are you?
    """.replaceIndent("abc-|-")
    println(message)
    message = """
        >>>Hello,
        >>>My name is Jane Doe.
        >>>How are you?
    """.trimMargin(">>>")
    println(message)

    var name = "Jane"
    var age = 32

    println("Hello $name, your age is $age and your name is ${name.length} characters long.")
}

fun booleanType() {
    var isBlank: Boolean = false
    println(isBlank)
    println(isBlank.not())

    isBlank = "Jane".isBlank()
    println(isBlank)
}
