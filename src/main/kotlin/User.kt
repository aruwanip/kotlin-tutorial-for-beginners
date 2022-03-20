class User(var firstName: String, var lastName: String, var isPlatinum: Boolean) {

    var fullName = "$firstName $lastName"
        get() = "Full Name: $field"
        set(value) {
            if (value.startsWith("J")) {
                field = "James Bond"
            } else {
                // If else is not provided then fullName will not be updated and previous value will remain
                field = value
            }
        }

    val fullNameLength = fullName.length

    init {
        // Called after PRIMARY constructor and before secondary constructors
        println("In Init block")
        // fullName must have been initialized for below to compile - make sure fullName property is declared before
        // init block
        println("This class is for user $fullName")
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
