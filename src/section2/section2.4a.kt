package section2

import java.util.*
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.schedule
import kotlin.concurrent.withLock

/**
 * Object to be shared between the two threads
 */
class SharedObject(var sharedData: String = "")

/**
 * First thread to use the shared data.
 * A synchronized lock will first be implemented. Then the ReentrantLock
 * will replace the synchronized lock.
 */
class BasicThreadOne(var shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
        lock.withLock {
            shared.sharedData = Thread.currentThread().toString()
            Thread.sleep(2000)
        }
    }
}

/**
 * Second thread to use the shared data.
 * A synchronized lock will first be implemented. Then the ReentrantLock
 * will replace the synchronized lock.
 */
class BasicThreadTwo(var shared: SharedObject, private val lock: Lock) : Thread() {
    override fun run() {
        super.run()
        lock.withLock {
            shared.sharedData = Thread.currentThread().toString()
        }
    }
}

/**
 * This exercise will demonstrate thread safety by using a shared object
 * A SharedObject instance will be passed to each of the BasicThread class instances.
 * A timer will be used to test for thread contention
 */
fun main(args: Array<String>) {
    val data = SharedObject()
    val lock = ReentrantLock()
    BasicThreadOne(data, lock).apply {
        name = "Theread One"
        start()
    }
    BasicThreadTwo(data, lock).apply {
        name = "Theread Two"
        start()
    }
    Timer().schedule(1000) {
        println(data.sharedData)
    }
}

