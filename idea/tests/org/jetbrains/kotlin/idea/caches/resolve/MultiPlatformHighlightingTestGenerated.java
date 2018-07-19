/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.caches.resolve;

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
@TestMetadata("idea/testData/multiModuleHighlighting/multiplatform")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiPlatformHighlightingTestGenerated extends AbstractMultiPlatformHighlightingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    @TestMetadata("additionalMembersInPlatformInterface")
    public void testAdditionalMembersInPlatformInterface() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/additionalMembersInPlatformInterface/");
    }

    public void testAllFilesPresentInMultiplatform() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/multiModuleHighlighting/multiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("basic")
    public void testBasic() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/basic/");
    }

    @TestMetadata("catchHeaderExceptionInPlatformModule")
    public void testCatchHeaderExceptionInPlatformModule() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/catchHeaderExceptionInPlatformModule/");
    }

    @TestMetadata("depends")
    public void testDepends() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/depends/");
    }

    @TestMetadata("headerClass")
    public void testHeaderClass() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerClass/");
    }

    @TestMetadata("headerClassImplTypealias")
    public void testHeaderClassImplTypealias() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerClassImplTypealias/");
    }

    @TestMetadata("headerFunUsesStdlibInSignature")
    public void testHeaderFunUsesStdlibInSignature() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerFunUsesStdlibInSignature/");
    }

    @TestMetadata("headerFunctionProperty")
    public void testHeaderFunctionProperty() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerFunctionProperty/");
    }

    @TestMetadata("headerPartiallyImplemented")
    public void testHeaderPartiallyImplemented() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerPartiallyImplemented/");
    }

    @TestMetadata("headerWithoutImplForBoth")
    public void testHeaderWithoutImplForBoth() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/headerWithoutImplForBoth/");
    }

    @TestMetadata("internal")
    public void testInternal() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/internal/");
    }

    @TestMetadata("internalDependencyFromTests")
    public void testInternalDependencyFromTests() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/internalDependencyFromTests/");
    }

    @TestMetadata("javaUsesPlatformFacade")
    public void testJavaUsesPlatformFacade() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/javaUsesPlatformFacade/");
    }

    @TestMetadata("multifileFacade")
    public void testMultifileFacade() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/multifileFacade/");
    }

    @TestMetadata("nestedClassWithoutImpl")
    public void testNestedClassWithoutImpl() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/nestedClassWithoutImpl/");
    }

    @TestMetadata("platformTypeAliasInterchangebleWithAliasedClass")
    public void testPlatformTypeAliasInterchangebleWithAliasedClass() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/platformTypeAliasInterchangebleWithAliasedClass/");
    }

    @TestMetadata("suppressHeaderWithoutImpl")
    public void testSuppressHeaderWithoutImpl() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/suppressHeaderWithoutImpl/");
    }

    @TestMetadata("suspend")
    public void testSuspend() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/suspend/");
    }

    @TestMetadata("transitive")
    public void testTransitive() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/transitive/");
    }

    @TestMetadata("triangle")
    public void testTriangle() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/triangle/");
    }

    @TestMetadata("triangleWithDependency")
    public void testTriangleWithDependency() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/triangleWithDependency/");
    }

    @TestMetadata("typeAliasedParameter")
    public void testTypeAliasedParameter() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/typeAliasedParameter/");
    }

    @TestMetadata("useAppendable")
    public void testUseAppendable() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/useAppendable/");
    }

    @TestMetadata("useCorrectBuiltInsForCommonModule")
    public void testUseCorrectBuiltInsForCommonModule() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/useCorrectBuiltInsForCommonModule/");
    }

    @TestMetadata("usePlatformSpecificMember")
    public void testUsePlatformSpecificMember() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/usePlatformSpecificMember/");
    }

    @TestMetadata("withOverrides")
    public void testWithOverrides() throws Exception {
        runTest("idea/testData/multiModuleHighlighting/multiplatform/withOverrides/");
    }
}
