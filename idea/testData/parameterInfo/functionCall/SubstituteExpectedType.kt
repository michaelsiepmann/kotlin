fun test() {
    foo(mapOf(<caret>))
}

fun foo(map: Map<Int, String>) {}

/*
Text: (<highlight>pair: Pair<Int, String></highlight>), Disabled: false, Strikeout: false, Green: false
Text: (<highlight>vararg pairs: Pair<Int, String></highlight>), Disabled: false, Strikeout: false, Green: false
Text: (<no parameters>), Disabled: false, Strikeout: false, Green: true
*/