/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.imports;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class JsOptimizeImportsTestGenerated extends AbstractJsOptimizeImportsTest {
    @TestMetadata("idea/testData/editor/optimizeImports/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractJsOptimizeImportsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/js"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("DefaultJsImports.kt")
        public void testDefaultJsImports() throws Exception {
            runTest("idea/testData/editor/optimizeImports/js/DefaultJsImports.kt");
        }
    }

    @TestMetadata("idea/testData/editor/optimizeImports/common")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Common extends AbstractJsOptimizeImportsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInCommon() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/common"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ArrayAccessExpression.kt")
        public void testArrayAccessExpression() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ArrayAccessExpression.kt");
        }

        @TestMetadata("ClassMemberImported.kt")
        public void testClassMemberImported() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ClassMemberImported.kt");
        }

        @TestMetadata("ComponentFunction.kt")
        public void testComponentFunction() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ComponentFunction.kt");
        }

        @TestMetadata("CurrentPackage.kt")
        public void testCurrentPackage() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/CurrentPackage.kt");
        }

        @TestMetadata("DefaultObjectReference.kt")
        public void testDefaultObjectReference() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/DefaultObjectReference.kt");
        }

        @TestMetadata("Enums.kt")
        public void testEnums() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/Enums.kt");
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObject.kt")
        public void testExtensionFunctionalTypeValFromCompanionObject() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObject.kt");
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt");
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectNonExtCall() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt");
        }

        @TestMetadata("InvokeFunction.kt")
        public void testInvokeFunction() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/InvokeFunction.kt");
        }

        @TestMetadata("IteratorFunction.kt")
        public void testIteratorFunction() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/IteratorFunction.kt");
        }

        @TestMetadata("KT11640.kt")
        public void testKT11640() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/KT11640.kt");
        }

        @TestMetadata("KT11640_1.kt")
        public void testKT11640_1() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/KT11640_1.kt");
        }

        @TestMetadata("KT13689.kt")
        public void testKT13689() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/KT13689.kt");
        }

        @TestMetadata("KT9875.kt")
        public void testKT9875() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/KT9875.kt");
        }

        @TestMetadata("KeywordNames.kt")
        public void testKeywordNames() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/KeywordNames.kt");
        }

        @TestMetadata("Kt2488EnumEntry.kt")
        public void testKt2488EnumEntry() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/Kt2488EnumEntry.kt");
        }

        @TestMetadata("Kt2709.kt")
        public void testKt2709() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/Kt2709.kt");
        }

        @TestMetadata("MemberImports.kt")
        public void testMemberImports() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/MemberImports.kt");
        }

        @TestMetadata("MembersInScope.kt")
        public void testMembersInScope() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/MembersInScope.kt");
        }

        @TestMetadata("NestedClassReferenceOutsideClassBody.kt")
        public void testNestedClassReferenceOutsideClassBody() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/NestedClassReferenceOutsideClassBody.kt");
        }

        @TestMetadata("Overloads.kt")
        public void testOverloads() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/Overloads.kt");
        }

        @TestMetadata("TwoConstructors.kt")
        public void testTwoConstructors() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/TwoConstructors.kt");
        }

        @TestMetadata("TypeAliasUsage.kt")
        public void testTypeAliasUsage() throws Exception {
            runTest("idea/testData/editor/optimizeImports/common/TypeAliasUsage.kt");
        }

        @TestMetadata("idea/testData/editor/optimizeImports/common/kt21515")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Kt21515 extends AbstractJsOptimizeImportsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInKt21515() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/common/kt21515"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("callableReferenceOnClass.kt")
            public void testCallableReferenceOnClass() throws Exception {
                runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnClass.kt");
            }

            @TestMetadata("callableReferenceOnClassWithCompanion.kt")
            public void testCallableReferenceOnClassWithCompanion() throws Exception {
                runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnClassWithCompanion.kt");
            }

            @TestMetadata("callableReferenceOnObject.kt")
            public void testCallableReferenceOnObject() throws Exception {
                runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnObject.kt");
            }

            @TestMetadata("constructor.kt")
            public void testConstructor() throws Exception {
                runTest("idea/testData/editor/optimizeImports/common/kt21515/constructor.kt");
            }

            @TestMetadata("typeReference.kt")
            public void testTypeReference() throws Exception {
                runTest("idea/testData/editor/optimizeImports/common/kt21515/typeReference.kt");
            }
        }
    }
}
