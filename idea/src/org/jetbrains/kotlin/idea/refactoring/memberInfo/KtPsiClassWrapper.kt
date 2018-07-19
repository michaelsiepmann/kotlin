/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.memberInfo

import com.intellij.psi.PsiClass
import org.jetbrains.kotlin.psi.KtNamedDeclaration
import org.jetbrains.kotlin.psi.KtPsiFactory

interface KtPsiClassWrapper : KtNamedDeclaration {
    val psiClass: PsiClass
}

fun KtPsiClassWrapper(psiClass: PsiClass): KtPsiClassWrapper {
    val dummyKtClass = KtPsiFactory(psiClass.project).createClass("class ${psiClass.name}")
    return object : KtPsiClassWrapper, KtNamedDeclaration by dummyKtClass {
        override fun equals(other: Any?) = psiClass == (other as? KtPsiClassWrapper)?.psiClass

        override fun hashCode() = psiClass.hashCode()

        override val psiClass: PsiClass
            get() = psiClass
    }
}