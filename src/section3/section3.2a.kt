package section3

/**
 * Add three secondary constructors which will initialize its
 * propertys in different ways
 */
open class TextBuilder {
    var capacity: Int = 0
    var content: String? = null

    constructor() {
        capacity = 16
    }

    constructor(_capacity: Int) {
        capacity = _capacity
    }

    constructor(_content: String?) {
        _content?.let {
            content = _content
        }
    }
}

class TextBuilderChild : TextBuilder {
    constructor() : super()
    constructor(capacity: Int) : super(capacity)
    constructor(content: String?) : super(content)
}
/**
 * This exercise will demonstrate how to initial a class in different ways
 * of initializing a class
 */
fun main(args: Array<String>) {
    // Create three instances of TextBuilder that call each
    // of the secondary constructors and display the results
    val textBuilder1 = TextBuilderChild()
    val textBuilder2 = TextBuilderChild(32)
    val textBuilder3 = TextBuilderChild("Hello, World")

    println(textBuilder1.capacity)
    println(textBuilder2.capacity)
    println(textBuilder3.content)

}
