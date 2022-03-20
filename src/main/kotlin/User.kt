class User(var firstName: String, var lastName: String) {

    private val MAX_AGE = 18

    companion object {
        const val MIN_AGE = 10
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }

}
