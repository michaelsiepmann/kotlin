fun foo(list: List<String>, p1: Any, p2: String) {
    list.contains(<caret>)
}

// ABSENT: p1
// EXIST: p2
// EXIST: { itemText: "String", tailText: "() (kotlin)" }
