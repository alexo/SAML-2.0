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

import org.opensaml.xml.schema.impl.XSStringImpl;
import org.opensaml.xml.signature.XPath;

/**
 * Concrete implementation of {@link org.opensaml.xml.signature.XPath}
 */
public class XPathImpl extends XSStringImpl implements XPath {

    /**
     * Constructor
     *
     * @param namespaceURI
     * @param elementLocalName
     * @param namespacePrefix
     */
    protected XPathImpl(String namespaceURI, String elementLocalName, String namespacePrefix) {
        super(namespaceURI, elementLocalName, namespacePrefix);
    }

}
