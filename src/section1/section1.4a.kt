package section1

import java.text.DateFormat
import java.util.*

/**
 * The main function will creates a date object. Which will then
 * call the newly created extension function Date.shortDate()
 */
fun main(args: Array<String>) {
    val date = Date()
    // Modify the code to call the extension function shortDate()
    println("Current date = ${date.shortDate()}")
}

/**
 * Add an extension function called Date.shortDate(), which
 * will return a date instance
 */
fun Date.shortDate() = DateFormat.getDateInstance().format(this)

