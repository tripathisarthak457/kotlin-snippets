fun isValidEmail(email: String): Boolean {
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()
    return email.matches(emailRegex)
}

fun main() {
    val email = "example@example.com"
    println("Is the email valid and proper? ${isValidEmail(email)}")
}