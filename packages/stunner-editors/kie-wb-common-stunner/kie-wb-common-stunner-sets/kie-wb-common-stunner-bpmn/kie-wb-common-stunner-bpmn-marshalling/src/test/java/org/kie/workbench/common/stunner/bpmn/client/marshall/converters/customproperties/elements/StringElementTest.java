/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */


package org.kie.workbench.common.stunner.bpmn.client.marshall.converters.customproperties.elements;

import static org.kie.workbench.common.stunner.bpmn.client.marshall.converters.tostunner.properties.Scripts.asCData;

public class StringElementTest extends MetaTypeDefinitionTest<String> {

    @Override
    public MetadataTypeDefinition<String> getMetaTypeDefinition() {
        return new StringElement("TheName", "TheDefaultValue");
    }

    @Override
    public String getTestValue() {
        return "TheValue";
    }

    @Override
    protected String formattedResult(String testValue) {
        return asCData(testValue);
    }

    @Override
    protected String formattedValue(String value) {
        return asCData(value);
    }

    @Override
    protected String asStringValue(String testValue) {
        return super.asStringValue(testValue);
    }
}