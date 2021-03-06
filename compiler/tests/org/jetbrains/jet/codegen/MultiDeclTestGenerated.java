/*
 * Copyright 2010-2012 JetBrains s.r.o.
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
package org.jetbrains.jet.codegen;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.AbstractMultiDeclTestCase;

/** This class is generated by {@link org.jetbrains.jet.codegen.AbstractMultiDeclTestCase}. DO NOT MODIFY MANUALLY */
@TestMetadata("compiler/testData/codegen/multiDecl")
public class MultiDeclTestGenerated extends AbstractMultiDeclTestCase {
    public void testAllFilesPresentInMultiDecl() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.codegen.AbstractMultiDeclTestCase", new File("compiler/testData/codegen/multiDecl"), "kt", false);
    }
    
    @TestMetadata("ComplexInitializer.kt")
    public void testComplexInitializer() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ComplexInitializer.kt");
    }
    
    @TestMetadata("SimpleVals.kt")
    public void testSimpleVals() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleVals.kt");
    }
    
    @TestMetadata("SimpleValsExtensions.kt")
    public void testSimpleValsExtensions() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleValsExtensions.kt");
    }
    
    @TestMetadata("SimpleVarsExtensions.kt")
    public void testSimpleVarsExtensions() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/SimpleVarsExtensions.kt");
    }
    
    @TestMetadata("ValCapturedInFunctionLiteral.kt")
    public void testValCapturedInFunctionLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInFunctionLiteral.kt");
    }
    
    @TestMetadata("ValCapturedInLocalFunction.kt")
    public void testValCapturedInLocalFunction() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInLocalFunction.kt");
    }
    
    @TestMetadata("ValCapturedInObjectLiteral.kt")
    public void testValCapturedInObjectLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/ValCapturedInObjectLiteral.kt");
    }
    
    @TestMetadata("VarCapturedInFunctionLiteral.kt")
    public void testVarCapturedInFunctionLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInFunctionLiteral.kt");
    }
    
    @TestMetadata("VarCapturedInLocalFunction.kt")
    public void testVarCapturedInLocalFunction() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInLocalFunction.kt");
    }
    
    @TestMetadata("VarCapturedInObjectLiteral.kt")
    public void testVarCapturedInObjectLiteral() throws Exception {
        blackBoxFileByFullPath("compiler/testData/codegen/multiDecl/VarCapturedInObjectLiteral.kt");
    }
    
}
