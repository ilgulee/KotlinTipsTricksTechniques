package section3

/**
 * Create a class StandardThreadThree with keyword constructor and initializer block
 * The initializer block will then be replaced with a primary constructer
 * After that the class will then extend the Thread class to demonstrate initializing
 * the super class constructor.
 */

//class StandardThreadThree public constructor(_timeout:Int){
//    val timeout:Int
//    init {
//        timeout=_timeout
//    }
//}

//class StandardThreadThree public constructor(_timeout:Int){
//    val timeout:Int = _timeout
//}

//class StandardThreadThree(val timeout:Int)

class StandardThreadThree(val timeout: Int, name: String) : Thread(name) {
    override fun run() {
        super.run()
        println(Thread.currentThread().toString())
    }
}

/**
 * This exercise will demonstrate the usage of the class primary constructor.
 * The newly created Class will then extend the Thread class to demonstrate initializing
 * super class constructors.
 */
fun main(args: Array<String>) {
    //Create StandardThreadThree instance and display timeout value
    val standardThreadThree = StandardThreadThree(123, "Standard Three").apply {
        start()
    }
    println("Timeout value = ${standardThreadThree.timeout}")
}

/*
The primary constructor can make class initialization more concise
Primary constructor can not contain init code, therefore use an init block
Primary constructor is responsible for initializing super class properties
 */