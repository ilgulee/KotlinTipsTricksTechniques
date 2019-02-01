package section4

import kotlin.concurrent.thread

/**
 * This class will be used to contain three properties
 * 1/ mutable list
 * 2/ readOnly mutable list
 * 3/ immutable list
 * Each of the properties for will tested for thread safety
 */
class StateObjects {
    var mutableList = mutableListOf(1, 2, 3)
    val readOnlyList = mutableListOf(1.0, 2.0, 3.0)
    val immutableList = listOf("1", "2", "3")

}

/**
 * Create new function modifyMutableList() to modify mutable list
 */
fun modifyMutableList(stateObjects: StateObjects) {
    thread {
        stateObjects.mutableList = mutableListOf(4, 5, 6)
        println(stateObjects.mutableList)
    }
}

/**
 * Create new function modifyReadOnlyList() to modify read-only mutable list
 */
fun modifyReadOnlyList(stateObjects: StateObjects) {
    thread {
        for (i in stateObjects.readOnlyList.indices)
            stateObjects.readOnlyList[i] = stateObjects.mutableList[i].toDouble()
        print(stateObjects.readOnlyList)
    }
}
/**
 * Create new function  immutableList() to attempt to modify immutable list
 */

/**
 * This exercise will compare three values for thread safety. A mutable list,
 * a read-only list and an immutable list.
 * And identify which values are thread safe.
 */
fun main(args: Array<String>) {
    // Call the three newly created functions to see which are thread safe.
    val stateObjects = StateObjects()
    modifyMutableList(stateObjects)
    modifyReadOnlyList(stateObjects)
}

