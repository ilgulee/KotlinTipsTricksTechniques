package section1

/**
 * Used to call the cricketScore() function and display the returned result
 */
fun main(args: Array<String>) {

    // cricketScore arguments will be converted to named arguments
    var total = cricketScore(12, 4, 0)
    println("total score = $total")

    total = cricketScore(12, 4)
    println("total score = $total")

    total = cricketScore()
    println("total score = $total")

    val cricketList = intArrayOf(12, 4, 0)
    total = cricketScore2(*cricketList)
    println("total score = $total")

}

/**
 * First the current parameters will be converted to default parameters.
 * Then the parameters will be replaced with a vararg.
 */
fun cricketScore(singles: Int = 0, boundaries: Int = 0, sixer: Int = 0) =
    singles + boundaries * 4 + sixer * 6

fun cricketScore2(vararg args: Int) =
    args[0] + args[1] * 4 + args[2] * 6