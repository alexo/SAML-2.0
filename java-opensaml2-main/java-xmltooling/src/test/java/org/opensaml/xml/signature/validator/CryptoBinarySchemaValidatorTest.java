/*
 * Copyright [2007] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.xml.signature.validator;

import org.opensaml.xml.BaseXMLObjectValidatorTestCase;
import org.opensaml.xml.signature.CryptoBinary;

/**
 * Tests CryptoBinaryValidator.
 */
public class CryptoBinarySchemaValidatorTest extends BaseXMLObjectValidatorTestCase {
    
    /**
     * Constructor.
     *
     */
    public CryptoBinarySchemaValidatorTest() {
        targetQName = CryptoBinary.TYPE_NAME;
        validator = new CryptoBinarySchemaValidator();
    }

    /** {@inheritDoc} */
    protected void populateRequiredData() {
        super.populateRequiredData();
        CryptoBinary cryptoBinary = (CryptoBinary) target;
        cryptoBinary.setValue("ABCDabcd");
    }
    
    /**
     *  Test empty content.
     */
    public void testEmpty() {
        CryptoBinary cryptoBinary = (CryptoBinary) target;
        
        cryptoBinary.setValue(null);
        assertValidationFail("Content was null, should raise a Validation Exception");
        
        cryptoBinary.setValue("");
        assertValidationFail("Content was empty, should raise a Validation Exception");
        
        cryptoBinary.setValue("   ");
        assertValidationFail("Content was all whitespace, should raise a Validation Exception");
    }
}
