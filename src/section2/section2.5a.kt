package section2

import java.util.*

/**
 * Shared value is initially implemented as a class.
 * Later on in the exercise it will be converted to an object
 * for converting it to a singleton.
 */
object SharedValue {
    val list = ArrayList<String>()
}

/**
 * Implement a thread class that adds the current thread information
 * to the SharedValue list
 */
class StandardThreadOne : Thread() {
    override fun run() {
        super.run()
        SharedValue.list.add(Thread.currentThread().toString())
    }
}

/**
 * Implement a second thread class that adds the current thread information
 * to the SharedValue list
 */
class StandardThreadTwo : Thread() {
    override fun run() {
        super.run()
        SharedValue.list.add(Thread.currentThread().toString())
    }
}

/**
 * This exercise will compare objects against singletons.
 * Create instances of each newly created thread class. And
 * start both threads.
 * Once the issues have been identified with using SharedValue instances, convert
 * SharedValue to an object which will convert it to a singleton. Then check the issues
 * have been resolved.
 */
fun main(args: Array<String>) {
    val thread1 = StandardThreadOne().apply {
        name = "First Thread"
        start()
    }
    val thread2 = StandardThreadTwo().apply {
        name = "Second Thread"
        start()
    }
    println(SharedValue.list)

}


