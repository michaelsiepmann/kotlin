fun maybeFoo(): String? {
    return "foo"
}

fun main(args: Array<String>) {
    val foo = maybeFoo()
    <caret>if (foo == null)
        null
    else
        foo.length
}
