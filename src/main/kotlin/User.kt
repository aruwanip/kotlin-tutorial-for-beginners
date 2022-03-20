class User(var firstName: String, var lastName: String) {

    lateinit var favoriteCity: String

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName() + "'s Favorite City is: $favoriteCity"
    }

}
