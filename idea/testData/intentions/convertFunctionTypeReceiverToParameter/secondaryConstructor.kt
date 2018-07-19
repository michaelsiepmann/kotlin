open class Foo {
    constructor(f: <caret>Int.(Boolean) -> String) {
        1.f(false)
        bar(f)
    }

    constructor(a: Int, f: (Int, Boolean) -> String) : this(f)
    constructor(a: Int) : this(::g)
    constructor(a: Int, b: Int) : this(lambda())
    constructor(a: Int, b: Int, c: Int) : this({ b -> "${this + 1} $b" })
}

fun bar(f: (Int, Boolean) -> String) {

}

fun lambda(): (Int, Boolean) -> String = { i, b -> "$i $b"}

fun g(i: Int, b: Boolean) = ""

fun baz(f: (Int, Boolean) -> String) {
    Foo(f)

    Foo(::g)

    Foo(lambda())

    Foo { b -> "${this + 1} $b" }
}

class Baz1(f: (Int, Boolean) -> String) : Foo(f)
class Baz2 : Foo(::g)
class Baz3 : Foo(lambda())
class Baz4 : Foo({ b -> "${this + 1} $b" })

class Baz5 : Foo {
    constructor(f: (Int, Boolean) -> String) : super(f)
    constructor(a: Int) : super(::g)
    constructor(a: Int, b: Int) : super(lambda())
    constructor(a: Int, b: Int, c: Int) : super({ b -> "${this + 1} $b" })
}