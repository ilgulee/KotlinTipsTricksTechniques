package section4

/**
 * Create a function called groupByLength
 * to group the list collection by size
 */


/**
 * This exercise will demonstrate how the group a collection
 * elements by their size.
 * The collection groupBy lambda will be used to assist with
 * generating the list.
 */
fun main(args: Array<String>) {
    // Call the newly created groupByLength function
    // and pass in the words value.
    //Display the result returned from the groupByLength method.
    val words = listOf("a", "abc", "ab", "def", "abcd")
    println(groupByLength(words))

}

//fun groupByLength(value:List<String>):Collection<List<String>> {
//    val result=value.groupBy { it.length }
//    return result.values
//}
fun groupByLength(value: List<String>) = value.groupBy { it.length }.values
