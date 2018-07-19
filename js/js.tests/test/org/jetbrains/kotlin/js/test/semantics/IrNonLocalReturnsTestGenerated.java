/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

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
@TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrNonLocalReturnsTestGenerated extends AbstractIrNonLocalReturnsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
    }

    public void testAllFilesPresentInNonLocalReturns() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
    }

    @TestMetadata("explicitLocalReturn.kt")
    public void testExplicitLocalReturn() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/explicitLocalReturn.kt");
    }

    @TestMetadata("justReturnInLambda.kt")
    public void testJustReturnInLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/justReturnInLambda.kt");
    }

    @TestMetadata("kt5199.kt")
    public void testKt5199() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/kt5199.kt");
    }

    @TestMetadata("kt8948.kt")
    public void testKt8948() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/kt8948.kt");
    }

    @TestMetadata("kt8948v2.kt")
    public void testKt8948v2() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/kt8948v2.kt");
    }

    @TestMetadata("nestedNonLocals.kt")
    public void testNestedNonLocals() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/nestedNonLocals.kt");
    }

    @TestMetadata("noInlineLocalReturn.kt")
    public void testNoInlineLocalReturn() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/noInlineLocalReturn.kt");
    }

    @TestMetadata("nonLocalReturnFromOuterLambda.kt")
    public void testNonLocalReturnFromOuterLambda() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/nonLocalReturnFromOuterLambda.kt");
    }

    @TestMetadata("propertyAccessors.kt")
    public void testPropertyAccessors() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/propertyAccessors.kt");
    }

    @TestMetadata("returnFromFunctionExpr.kt")
    public void testReturnFromFunctionExpr() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/returnFromFunctionExpr.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/simple.kt");
    }

    @TestMetadata("simpleFunctional.kt")
    public void testSimpleFunctional() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/simpleFunctional.kt");
    }

    @TestMetadata("simpleVoid.kt")
    public void testSimpleVoid() throws Exception {
        runTest("compiler/testData/codegen/boxInline/nonLocalReturns/simpleVoid.kt");
    }

    @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/deparenthesize")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Deparenthesize extends AbstractIrNonLocalReturnsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInDeparenthesize() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/deparenthesize"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
        }

        @TestMetadata("bracket.kt")
        public void testBracket() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/deparenthesize/bracket.kt");
        }

        @TestMetadata("labeled.kt")
        public void testLabeled() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/deparenthesize/labeled.kt");
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TryFinally extends AbstractIrNonLocalReturnsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
        }

        public void testAllFilesPresentInTryFinally() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
        }

        @TestMetadata("kt20433.kt")
        public void testKt20433() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt20433.kt");
        }

        @TestMetadata("kt20433_2.kt")
        public void testKt20433_2() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt20433_2.kt");
        }

        @TestMetadata("kt20433_2_void.kt")
        public void testKt20433_2_void() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt20433_2_void.kt");
        }

        @TestMetadata("kt20433_void.kt")
        public void testKt20433_void() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt20433_void.kt");
        }

        @TestMetadata("kt6956.kt")
        public void testKt6956() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt6956.kt");
        }

        @TestMetadata("kt7273.kt")
        public void testKt7273() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/kt7273.kt");
        }

        @TestMetadata("nonLocalReturnFromCatchBlock.kt")
        public void testNonLocalReturnFromCatchBlock() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/nonLocalReturnFromCatchBlock.kt");
        }

        @TestMetadata("nonLocalReturnFromOuterLambda.kt")
        public void testNonLocalReturnFromOuterLambda() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/nonLocalReturnFromOuterLambda.kt");
        }

        @TestMetadata("nonLocalReturnToCatchBlock.kt")
        public void testNonLocalReturnToCatchBlock() throws Exception {
            runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/nonLocalReturnToCatchBlock.kt");
        }

        @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class CallSite extends AbstractIrNonLocalReturnsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
            }

            public void testAllFilesPresentInCallSite() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
            }

            @TestMetadata("callSite.kt")
            public void testCallSite() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/callSite.kt");
            }

            @TestMetadata("callSiteComplex.kt")
            public void testCallSiteComplex() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/callSiteComplex.kt");
            }

            @TestMetadata("exceptionTableSplit.kt")
            public void testExceptionTableSplit() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/exceptionTableSplit.kt");
            }

            @TestMetadata("exceptionTableSplitNoReturn.kt")
            public void testExceptionTableSplitNoReturn() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/exceptionTableSplitNoReturn.kt");
            }

            @TestMetadata("finallyInFinally.kt")
            public void testFinallyInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/finallyInFinally.kt");
            }

            @TestMetadata("wrongVarInterval.kt")
            public void testWrongVarInterval() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/callSite/wrongVarInterval.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Chained extends AbstractIrNonLocalReturnsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
            }

            public void testAllFilesPresentInChained() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
            }

            @TestMetadata("finallyInFinally.kt")
            public void testFinallyInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/finallyInFinally.kt");
            }

            @TestMetadata("finallyInFinally2.kt")
            public void testFinallyInFinally2() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/finallyInFinally2.kt");
            }

            @TestMetadata("intReturn.kt")
            public void testIntReturn() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/intReturn.kt");
            }

            @TestMetadata("intReturnComplex.kt")
            public void testIntReturnComplex() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/intReturnComplex.kt");
            }

            @TestMetadata("intReturnComplex2.kt")
            public void testIntReturnComplex2() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/intReturnComplex2.kt");
            }

            @TestMetadata("intReturnComplex3.kt")
            public void testIntReturnComplex3() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/intReturnComplex3.kt");
            }

            @TestMetadata("intReturnComplex4.kt")
            public void testIntReturnComplex4() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/intReturnComplex4.kt");
            }

            @TestMetadata("nestedLambda.kt")
            public void testNestedLambda() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/chained/nestedLambda.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class DeclSite extends AbstractIrNonLocalReturnsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
            }

            public void testAllFilesPresentInDeclSite() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
            }

            @TestMetadata("complex.kt")
            public void testComplex() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/complex.kt");
            }

            @TestMetadata("intReturn.kt")
            public void testIntReturn() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/intReturn.kt");
            }

            @TestMetadata("intReturnComplex.kt")
            public void testIntReturnComplex() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/intReturnComplex.kt");
            }

            @TestMetadata("longReturn.kt")
            public void testLongReturn() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/longReturn.kt");
            }

            @TestMetadata("nested.kt")
            public void testNested() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/nested.kt");
            }

            @TestMetadata("returnInFinally.kt")
            public void testReturnInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/returnInFinally.kt");
            }

            @TestMetadata("returnInTry.kt")
            public void testReturnInTry() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/returnInTry.kt");
            }

            @TestMetadata("returnInTryAndFinally.kt")
            public void testReturnInTryAndFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/returnInTryAndFinally.kt");
            }

            @TestMetadata("severalInTry.kt")
            public void testSeveralInTry() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/severalInTry.kt");
            }

            @TestMetadata("severalInTryComplex.kt")
            public void testSeveralInTryComplex() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/severalInTryComplex.kt");
            }

            @TestMetadata("voidInlineFun.kt")
            public void testVoidInlineFun() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/voidInlineFun.kt");
            }

            @TestMetadata("voidNonLocal.kt")
            public void testVoidNonLocal() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/declSite/voidNonLocal.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class ExceptionTable extends AbstractIrNonLocalReturnsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
            }

            public void testAllFilesPresentInExceptionTable() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
            }

            @TestMetadata("break.kt")
            public void testBreak() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/break.kt");
            }

            @TestMetadata("continue.kt")
            public void testContinue() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/continue.kt");
            }

            @TestMetadata("exceptionInFinally.kt")
            public void testExceptionInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/exceptionInFinally.kt");
            }

            @TestMetadata("forInFinally.kt")
            public void testForInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/forInFinally.kt");
            }

            @TestMetadata("innerAndExternal.kt")
            public void testInnerAndExternal() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/innerAndExternal.kt");
            }

            @TestMetadata("innerAndExternalNested.kt")
            public void testInnerAndExternalNested() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/innerAndExternalNested.kt");
            }

            @TestMetadata("innerAndExternalSimple.kt")
            public void testInnerAndExternalSimple() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/innerAndExternalSimple.kt");
            }

            @TestMetadata("nested.kt")
            public void testNested() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/nested.kt");
            }

            @TestMetadata("nestedWithReturns.kt")
            public void testNestedWithReturns() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/nestedWithReturns.kt");
            }

            @TestMetadata("nestedWithReturnsSimple.kt")
            public void testNestedWithReturnsSimple() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/nestedWithReturnsSimple.kt");
            }

            @TestMetadata("noFinally.kt")
            public void testNoFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/noFinally.kt");
            }

            @TestMetadata("severalCatchClause.kt")
            public void testSeveralCatchClause() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/severalCatchClause.kt");
            }

            @TestMetadata("simpleThrow.kt")
            public void testSimpleThrow() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/simpleThrow.kt");
            }

            @TestMetadata("synchonized.kt")
            public void testSynchonized() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/synchonized.kt");
            }

            @TestMetadata("throwInFinally.kt")
            public void testThrowInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/throwInFinally.kt");
            }

            @TestMetadata("tryCatchInFinally.kt")
            public void testTryCatchInFinally() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/exceptionTable/tryCatchInFinally.kt");
            }
        }

        @TestMetadata("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/variables")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Variables extends AbstractIrNonLocalReturnsTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS_IR, testDataFilePath);
            }

            public void testAllFilesPresentInVariables() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/variables"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS_IR, true);
            }

            @TestMetadata("kt7792.kt")
            public void testKt7792() throws Exception {
                runTest("compiler/testData/codegen/boxInline/nonLocalReturns/tryFinally/variables/kt7792.kt");
            }
        }
    }
}
