class User(var firstName: String, var lastName: String) {

    // Similar to static method in Java - singleton tied to class
    companion object {
        val users = mutableListOf<User>()

        fun createUsers(count: Int): List<User> {
            for (i in 1..count) {
                users.add(User("FirstName${i}", "LastName${i}"))
            }
            return users
        }

        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }

}
