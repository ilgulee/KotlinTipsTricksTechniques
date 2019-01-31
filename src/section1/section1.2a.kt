package section1

/**
 * Main function is used to call checkCountries() function
 * with the age argument. Then will displays the results
 * from the checkCountries() function.
 */
fun main(args: Array<String>) {

    val age = 16
    println("Can drive in ${checkCountries(age)}")
}

/**
 * This function is implemented with an if-cascade. Replace the if-cascade
 * with a when expression
 */
fun checkCountries(age: Int) = when {
    age < 14 -> "no country"
    age < 15 -> "Guyana"
    age < 16 -> "Guyana and Canada"
    age < 17 -> "Guyana, Canada and France"
    age < 18 -> "Guyana, Canada, France and Alberta"
    else -> "any country"
}
