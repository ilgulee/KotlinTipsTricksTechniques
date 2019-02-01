package section3

/**
 * Create a function called thread(), which returns a thread
 * An anonymous object will be used to create a single instance
 * of the Thread class
 * Display the current thread information inside the object's
 * run method.
 */
fun thread(
    start: Boolean = true,
    name: String? = null,
    priority: Int = -1
): Thread {
    val thread = object : Thread() {
        override fun run() {
            super.run()
            println(Thread.currentThread().toString())
        }
    }
    if (priority > 0) {
        thread.priority = priority
        name?.let {
            thread.name = name
        }
    }
    if (start) {
        thread.start()
    }
    return thread
}

/**
 * In this exercise we will demonstrate how to use an object expression
 * to create an anonymous object. The anonymous object will be a Thread
 * singleton.
 */
fun main(args: Array<String>) {
    // Call the thread function pasing the name and priority arguments.
    thread(
        name = "MyOwnThread",
        priority = 10
    )
}

