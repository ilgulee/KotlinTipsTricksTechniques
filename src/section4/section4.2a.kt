package section4

/**
 * Add a function called functionArgument, which will support a function being passed as it’s parameter.
 * To pass a function as an argument we need to provided its function type.
 */


/**
 * This exercise will demonstrate how to create a higher order function.
 * First by either passing the add or multiply function to the newly created
 * higher order function.
 * Then replacing the function with a lambda expression.
 */
fun main(args: Array<String>) {
    // Call the newly created functionArgument() function
    // and use a member reference to pass the multiply function as a argument
//    functionArguments(::add)
//    functionArguments(::multiply)

    functionArguments { a, b -> a + b }

}

/**
 * The functions be will be used initially as member references to be passed
 * as arguments to functionArgument()
 * The will then be replaced with Lambdas which have the same implementation
 */
//fun add(value1: Int, value2: Int) = value1 + value2
//fun multiply(value1: Int, value2: Int) = value1 * value2
fun functionArguments(task: (Int, Int) -> Int) {
    val result = task(2, 3)
    println(result)
}
