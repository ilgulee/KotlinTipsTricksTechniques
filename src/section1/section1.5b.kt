package section1

/**
 * This class will be provided to the main() function
 * to support demonstration of the also and apply extension
 * functions
 */
class SimpleThread : Thread() {
    override fun run() {
        println("${Thread.currentThread()} has run")
    }
}

/**
 * Create an instance of SimpleThread. Then call the also extension function.
 * Inside the also function set the priority and name properties and then start
 * the thread.
 * Then replace the also extension function with the apply extension function.
 */
//fun main(args: Array<String>) {
//    val thread = SimpleThread()
//    thread.priority=1
//    thread.name="My Thread"
//    thread.start()
//}

//fun main(args: Array<String>) {
//    SimpleThread().also {
//        it.priority = 1
//        it.name = "My Thread"
//        it.start()
//    }
//}

fun main(args: Array<String>) {
    val thread = SimpleThread().apply {
        priority = 1
        name = "My Thread"
        start()
    }
}