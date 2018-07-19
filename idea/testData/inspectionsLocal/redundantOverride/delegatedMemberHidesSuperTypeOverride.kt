// PROBLEM: none
interface Foo {
    fun test(arg: String)
}

open class Bar : Foo {
    override fun test(arg: String) {}
    open fun test(a: Int) {}
    open fun test2() {}
}

class Baz(val foo: Foo) : Bar(), Foo by foo {
    override <caret>fun test(arg: String) = super.test(arg)
}
