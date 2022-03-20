class User(var firstName: String, var lastName: String, var isPlatinum: Boolean) {

    init {
        // Called after PRIMARY constructor and before secondary constructors
        println("Hello 1")
    }

    init {
        // Can have multiple initializer blocks and will run in order
        println("Hello 2")
    }

    constructor(firstName: String, lastName: String): this(firstName, lastName, false) {
        // Body (curly brackets) is not required unless you have statements to run
        println("isPlatinum is False by default")
    }

    constructor(firstName: String): this(firstName, "Unknown") {
        println("I'm in the 3rd constructor")
    }

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $lastName")
    }

    fun updateName(newName: String) {
        firstName = newName
    }

    fun firstNameLength() {
        println(firstName.length)
    }
}
