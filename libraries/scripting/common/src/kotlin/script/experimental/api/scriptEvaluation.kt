/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("unused")

package kotlin.script.experimental.api

import kotlin.script.experimental.util.ChainedPropertyBag
import kotlin.script.experimental.util.typedKey

object ScriptEvaluationEnvironmentParams {
    val implicitReceivers by typedKey<List<Any>>()

    val contextVariables by typedKey<Map<String, Any?>>() // external variables

    val constructorArgs by typedKey<List<Any?>>()

    val runArgs by typedKey<List<Any?>>()
}

typealias ScriptEvaluationEnvironment = ChainedPropertyBag

sealed class ResultValue {
    class Value(val name: String, val value: Any?, val type: String) : ResultValue() {
        override fun toString(): String = "$name: $type = $value"
    }

    object Unit : ResultValue()
}

data class EvaluationResult(val returnValue: ResultValue, val environment: ScriptEvaluationEnvironment)

interface ScriptEvaluator {

    suspend operator fun invoke(
        compiledScript: CompiledScript<*>,
        scriptEvaluationEnvironment: ScriptEvaluationEnvironment
    ): ResultWithDiagnostics<EvaluationResult>
}
