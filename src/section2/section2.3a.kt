package section2

/**
 * This exercise will involve the creation of a new value called scoresNotNull
 * which will be made up of scores without the null elements
 * First create scoresNotNull by stripping out the nulls in code.
 * Then replace that implementation with scoresNotNull
 */
fun main(args: Array<String>) {
    val scores = arrayListOf("45", null, "120", null)
    val scoresNotNull = scores.filterNotNull()

//    val scoresNotNull = arrayListOf<String>()
//    for (score in scores){
//        score?.let {
//            scoresNotNull.add(it)
//        }
//    }
    println(scoresNotNull)
}