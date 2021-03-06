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

package org.opensaml.xml.schema;

import javax.xml.namespace.QName;

import org.opensaml.xml.util.XMLConstants;
import org.opensaml.xml.validation.ValidatingXMLObject;

/**
 * XMLObject that represents an XML Schema base64Binary.
 */
public interface XSBase64Binary extends ValidatingXMLObject {

    /** Local name of the XSI type. */
    public static final String TYPE_LOCAL_NAME = "base64Binary"; 
        
    /** QName of the XSI type. */
    public static final QName TYPE_NAME = new QName(XMLConstants.XSD_NS, TYPE_LOCAL_NAME, XMLConstants.XSD_PREFIX);
    
    /**
     * Gets the base64-encoded binary value.
     * 
     * @return the string
     */
    public String getValue();
    
    /**
     * Sets the base64-encoded binary value.
     * 
     * @param newValue the string value
     */
    public void setValue(String newValue);
}