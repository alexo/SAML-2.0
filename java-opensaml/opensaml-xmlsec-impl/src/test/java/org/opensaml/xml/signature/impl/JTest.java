/*
 * Copyright [2006] [University Corporation for Advanced Internet Development, Inc.]
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

package org.opensaml.xml.signature.impl;


import org.opensaml.xml.XMLObjectProviderBaseTestCase;
import org.opensaml.xml.signature.J;

/**
 *
 */
public class JTest extends XMLObjectProviderBaseTestCase {
    
    private String expectedCryptoBinaryContent;

    /**
     * Constructor
     *
     */
    public JTest() {
        singleElementFile = "/data/org/opensaml/xml/signature/impl/J.xml";
        
    }

    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();
        
        expectedCryptoBinaryContent = "someCryptoBinaryValue";
    }

    /** {@inheritDoc} */
    public void testSingleElementUnmarshall() {
        J cbType = (J) unmarshallElement(singleElementFile);
        
        assertNotNull("J", cbType);
        assertEquals("J value", cbType.getValue(), expectedCryptoBinaryContent);
    }

    /** {@inheritDoc} */
    public void testSingleElementMarshall() {
        J cbType = (J) buildXMLObject(J.DEFAULT_ELEMENT_NAME);
        cbType.setValue(expectedCryptoBinaryContent);
        
        assertEquals(expectedDOM, cbType);
    }

}
