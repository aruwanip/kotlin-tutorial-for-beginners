class User(var firstName: String, var lastName: String) {

    var age: Int = 0
    var favoriteColor: String = "Blue"

    fun fullName(): String = "$firstName - $lastName"

    fun sayHi() = println("Hi ${fullName()}")

    override fun toString(): String {
        return fullName()
    }

}
