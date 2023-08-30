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

package org.uberfire.ext.wires.core.grids.client.widget.grid.columns;

import java.util.ArrayList;
import java.util.List;

import org.uberfire.ext.wires.core.grids.client.model.GridColumn;
import org.uberfire.ext.wires.core.grids.client.model.impl.BaseGridColumn;
import org.uberfire.ext.wires.core.grids.client.widget.dom.multiple.HasMultipleDOMElementResources;
import org.uberfire.ext.wires.core.grids.client.widget.dom.multiple.impl.TextBoxDOMElementFactory;
import org.uberfire.ext.wires.core.grids.client.widget.grid.renderers.columns.multiple.impl.StringColumnDOMElementRenderer;

public class StringDOMElementColumn extends BaseGridColumn<String> implements HasMultipleDOMElementResources {

    private TextBoxDOMElementFactory factory;

    public StringDOMElementColumn(final GridColumn.HeaderMetaData headerMetaData,
                                  final TextBoxDOMElementFactory factory,
                                  final double width) {
        this(new ArrayList<HeaderMetaData>() {{
                 add(headerMetaData);
             }},
             factory,
             width);
    }

    public StringDOMElementColumn(final List<GridColumn.HeaderMetaData> headerMetaData,
                                  final TextBoxDOMElementFactory factory,
                                  final double width) {
        super(headerMetaData,
              new StringColumnDOMElementRenderer(factory),
              width);
        this.factory = factory;
    }

    @Override
    public void initialiseResources() {
        factory.initialiseResources();
    }

    @Override
    public void destroyResources() {
        factory.destroyResources();
    }

    @Override
    public void freeUnusedResources() {
        factory.freeUnusedResources();
    }
}