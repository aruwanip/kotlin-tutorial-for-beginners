import kotlin.test.assertContains

fun main() {
//    println("Hello World")
//    variables()
//    numberTypes()
//    kotlinString()
//    booleanType()
//    conditionals()
//    truthTables()
//    structuralEquality()
//    referentialEquality()
//    nullableTypes()
//    nullSafeCalls()
//    elvisOperator()
//    helloWorld()
//    kotlinFunctions()
//    nestedFunctions()
//    singleLineFunction()
//    functionArguments(32, "Jane", true)
//    namedParameters()
//    defaultFunctionArguments()
//    variableArgs()
//    overloadingFunctions()
//    creatingClasses()
//    constructorInitBlocks()
//    classProperties()
//    multiplePropertiesInClass()
//    classFunctions()
//    companionObject()
//    creatingSingletons()
//    declaringConstants()
//    lateInitModifier()
//    nestedClasses()
    enums()
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

fun kotlinString() {
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

fun conditionals() {
    var calories = 800
    if (calories >= 2000) {
        println("You've consumed all your calories for the day.")
    } else if (calories > 1500) {
        println("You have a few more calories to eat!")
    } else if (calories > 1200) {
        println("You have some room for snacks!")
    } else if (calories > 1000) {
        println("You have plenty of calories left!")
    } else {
        println("You still have some calories left!")
    }

    val age = 9
    if (age > 10)
        println("The age is greater than 10") // Curly braces not required for one statement
        println("Hello there") // This will always print
    if (age > 5) println("The age is greater than 5") // Single-liner is preferred if no curly braces
    if (age > 10) println("The age is greater than 10") else println("The age is less than or equal to 10")
}

fun truthTables() {
    val myAge = 32
    val yourAge = 32

    val myName = "Jane"
    val yourName = "Donn"

    if ((myAge != yourAge) && (myName != yourName)) {
        println("Both items are true")
    } else if ((myAge != yourAge) || (myName != yourName)) {
        println("At least one item is true")
    } else {
        println("Both items are false")
    }
}

fun structuralEquality() {
    // Structural equality
    // == equality
    // != inequality
    var name1 = "Jane"
    var name2 = "Donn"
    println(name1 == name2) // Same as and preferred over name1.equals(name2)
    name2 = "Jane"
    println(name1 == name2)
}

fun referentialEquality() {
    // Referential equality
    // Numbers, chars, boolean are represented as primitives in runtime so === is same as == for these types
    // === equality
    // !== inequality
    var a = 12
    var b = 12
    println(a === b)

    var personA = Person("Jane")
    var personB = Person("Jane")
    println(personA === personB) // Not sharing the same object
}

class Person(var name: String)

fun nullableTypes() {
    var name: String = "Jane" // Non-nullable
    var name2: String? = "Jane" // Nullable
    name2 = null
    var age: Int = 32
    var age2: Int? = 32
    age2 = null
    var person = Person("Foo")
    var person2: Person? = Person("Foo")
    person2 = null
}

fun nullSafeCalls() {
    var firstName: String = "Jane"
    val length = firstName.length
    var lastName: String? = "Doe"
    var length2 = lastName?.length // Safe call because lastName is nullable, returns null or number

    // Equivalent of safe call
    var length3 = if (lastName != null) lastName.length else 0

    // Chaining
    // Instead of below in Java
    if (lastName != null && lastName.length > 1) {
        val length4 = lastName.length
    }
    // Can use chaining in Kotlin
    var length5 = lastName?.substring(0, 2)?.length
    var length6 = lastName?.substring(0, 5)?.drop(2)?.substring(2, 3)?.length
}

fun elvisOperator() {
    var lastName: String? = "Doe"
    var length: Int = if (lastName != null) lastName.length else 0
    // Elvis operator
    var length2: Int = lastName?.substring(0, 2)?.length ?: 0
}

fun helloWorld() {
    println("Hello World")
    println("Hello there")
    moo()
}

fun moo() {
    println("Moo!")
}

fun kotlinFunctions() {
    var x = sayHi()
    println(x)
}

fun sayHi(): String {
    // Default return type is Unit
//    println("Hello World")
    return "Hello World"
}

fun nestedFunctions() {
    println("Hi")
    fun sayBye() {
        println("Bye")
    }
    sayBye()
}

fun singleLineFunction() = println("Hi")

fun functionArguments(age: Int, name: String, isHappy: Boolean) {
    if (age < 21) {
        println("$name, you are not old enough, you are $age.")
    } else {
        println("$name, far too old at the ripe age of $age.")
    }
    println("You are happy? $isHappy")
}

fun namedParameters() {
    functionArguments(age = 32, name = "Jane", isHappy = true)
    // When using named parameters, must do so for all the arguments (cannot mix named and positional)
    // Named parameters do not have to be in the same order as function argument signature
}

fun printUserInfo(firstName: String, lastName: String, age: Int, isSunburned: Boolean = false,
                  likesMovies: Boolean = true, lovesPopcorn: Boolean = true) {
    // Conventionally default values are defined at the end of the parameter list
    println("$firstName $lastName is of age $age, Sunburned: $isSunburned, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopcorn")
}

fun defaultFunctionArguments() {
    printUserInfo(firstName = "Jane", lastName = "Doe", age = 32)
    printUserInfo(firstName = "Bob", lastName = "Doe", age = 37)
    printUserInfo(firstName = "Sarah", lastName = "Doe", age = 12, likesMovies = false)
}

fun printBookInfo(title: String, vararg authors: String) {
    // Variable arguments should be last one in list
    println("$title = Authors:")
    authors.forEach { println(it) }
}

fun variableArgs() {
    printBookInfo("Green Eggs and Ham", "Dr. Seuss", "Jane Doe")
    printBookInfo("Green Eggs and Ham")
}

fun printUserInfo(name: String) {
    println("Name: $name")
}

fun printUserInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun printUserInfo(name: String, age: Int, favColor: String) {
    println("Name: $name, Age: $age, Favorite Color: $favColor")
}

fun overloadingFunctions() {
    printUserInfo("Jane Doe")
    printUserInfo("Jane Doe", 32)
    printUserInfo("Jane Doe", 32, "Purple")
}

fun creatingClasses() {
//    var user = User(firstName = "Jane", lastName = "Doe", isPlatinum = true)
//    user.printWithPrefix("Ms.")
//    var friend = User(firstName = "John", lastName = "Smith")
//    friend.printFullName()
//    friend.updateName("Bob")
//    friend.printFullName()
//    friend.firstNameLength()

//    var cousin = User("Nick")
}

fun constructorInitBlocks() {
    val user = User("Jane", "Doe")
}

fun classProperties() {
//    val user = User("Jane", "Doe")
//    println(user.fullName)
//    // Because class property is var and in same package, it is mutable
//    user.fullName = "Hello World"
//    println(user.fullName)
//    println(user.fullNameLength)
//    user.fullName = "John Smith"
//    println(user.fullName)
}

fun multiplePropertiesInClass() {
//    val user = User("Jane", "Doe")
//    user.age = 30
//    user.favoriteColor = "Green"
//    user.sayHi()
}

fun classFunctions() {
//    val user = User("Jane", "Doe")
//    println(user.fullName())
//    println(user.fullNameLength())
//    user.updateFullNameWithSuffix("Ms.")
//    println(user.fullName())
}

fun companionObject() {
//    var user = User.createUser("foo", "bar")
//    println(user)
//
//    val users = User.createUsers(5)
//    println(users)
//    users.forEach { println(it) }

//    val users2 = User.users
//    users2.forEach { println(it) }
}

fun creatingSingletons() {
    // 1 instance
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.ingredients.add("Salt")
    println(FavoriteFood.ingredients.first())
    doStuff()
    println(FavoriteFood.name)
    println(FavoriteFood.ingredients.firstOrNull())
    println(FavoriteFood.numberOfIngredients())
    println(FavoriteFood == FavoriteFood)
}

fun doStuff() {
    FavoriteFood.name = "Chicken"
    FavoriteFood.ingredients.clear()
}

// Use object instead of class keyword to make it a singleton
object FavoriteFood {
    var name = "Unknown"
    val ingredients = mutableListOf<String>()

    fun numberOfIngredients(): Int {
        return ingredients.size
    }
}

const val MAX_AGE = 18

fun declaringConstants() {
//    val user = User("Foo", "Bar")
////    user.MAX_AGE // inaccessible because private
//    println(User.MIN_AGE)
//    println(Constants.MAX_AGE)
//    println(Constants.MIN_AGE)
//    println(MAX_AGE)
}

fun lateInitModifier() {
//    val user = User("Foo", "Bar")
//    user.favoriteCity = "New York"
//    println(user.toString())
}

fun nestedClasses() {
    val vehicle = Vehicle()
    vehicle.brand = "Fiat"
    vehicle.info()

//    val sw = Vehicle.SteeringWheel() // Can only instantiate in this manner with non-inner classes
    val sw = vehicle.SteeringWheel() // Can only call inner class constructors on instantiated outer class
    sw.info()

    val transmission = Vehicle.Transmission()
    transmission.shift()
}

class Vehicle {
    var brand: String = "Unknown"

    fun info() = println(brand)

    // Nested classes do not have access to outer class member variables, must specify nested class as inner to do so
    inner class SteeringWheel {
        var name = "leather"
        fun info() = println("$brand is the brand of vehicle with a $name steering wheel")
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}

fun enums() {
//    println(AccountType.GOLD)
//    val accountTYpeFromApi = "gold"
//    val accountType = AccountType.valueOf(accountTYpeFromApi.uppercase())
//    println(accountType == AccountType.GOLD)
//
//    val user = User("Jane", "Doe", AccountType.PLATINUM)
//
//    println(AccountType.GOLD)
//    println(AccountType.GOLD.discountPercent)
//    println(AccountType.GOLD.numberOfSubscriptions)
//
//    val value = AccountType.valueOf("Platinum".uppercase())
//    println(value)
//    println(value.discountPercent)
//    println(value.numberOfSubscriptions)
//    val fromApi = "BroNZe"
//    val accountType = AccountType.valueOf(fromApi.uppercase())
//    println(accountType.calculateDiscountPercent())
//    for(accountType in AccountType.values()){
//        println(accountType)
//    }
//    AccountType.values().forEach { println(it) }

    val accountType = AccountType.getAccountTypeByName("gold")
    println(accountType)
}

enum class AccountType() {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.uppercase())
    }
}
