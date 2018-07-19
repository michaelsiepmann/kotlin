// FILE: inlined.kt
// COMMON_COROUTINES_TEST
// WITH_RUNTIME
// NO_CHECK_LAMBDA_INLINING

import COROUTINES_PACKAGE.intrinsics.*

var i = 0;

suspend fun suspendHere() = suspendCoroutineOrReturn<Unit> {
    i++
    COROUTINE_SUSPENDED
}

suspend inline fun crossinlineMe(crossinline c: suspend () -> Unit) {
    val l: suspend () -> Unit = {
        suspendHere()
        suspendHere()
        suspendHere()
        suspendHere()
        suspendHere()
    }
    l()
}

// FILE: inlineSite.kt
// COMMON_COROUTINES_TEST

import COROUTINES_PACKAGE.*

fun builder(c: suspend () -> Unit) {
    c.startCoroutine(object: Continuation<Unit> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resume(value: Unit) {
        }

        override fun resumeWithException(exception: Throwable) {
            throw exception
        }
    })
}

fun box(): String {
    var res = "OK"
    builder {
        crossinlineMe {
            res = "FAIL 1"
        }
    }
    if (i != 1) return "FAIL 2"
    return res
}