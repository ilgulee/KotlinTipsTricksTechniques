package section4

/**
 * This exercise will demonstrate added a function type parameter
 * to a higher order function.
 * And then providing a lambda as an argument when called.
 */
fun main(args: Array<String>) {
    // Call the newThread() function and pass in the Lambda
    // code which displays the current thread information
    newThread { println(Thread.currentThread()) }
}

/**
 * An additional function type parameter will be added.
 * Which will be used to execute code passed in as Lambdas.
 */
fun newThread(
    start: Boolean = true,
    name: String? = null,
    priority: Int = -1,
    block: () -> Unit
): Thread {
    val thread = object : Thread() {
        override fun run() {
            block()
        }
    }
    if (priority > 0)
        thread.priority = priority
    if (name != null)
        thread.name = name
    if (start)
        thread.start()
    return thread
}