class User(var firstName: String, var lastName: String) {

    fun fullName(): String = "$firstName $lastName"

    fun fullNameLength(): Int {
        return fullName().length
    }

    fun updateFullNameWithSuffix(suffix: String) {
        firstName = "$suffix $firstName"
    }

}
