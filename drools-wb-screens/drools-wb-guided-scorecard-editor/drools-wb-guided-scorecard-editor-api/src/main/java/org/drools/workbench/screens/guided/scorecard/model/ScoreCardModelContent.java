/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.guided.scorecard.model;

import org.drools.workbench.models.guided.scorecard.shared.ScoreCardModel;
import org.guvnor.common.services.shared.metadata.model.Overview;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.kie.workbench.common.services.datamodel.model.PackageDataModelOracleBaselinePayload;
import org.uberfire.commons.validation.PortablePreconditions;

@Portable
public class ScoreCardModelContent {

    private ScoreCardModel model;
    private PackageDataModelOracleBaselinePayload dataModel;
    private Overview overview;

    public ScoreCardModelContent() {
    }

    public ScoreCardModelContent( final ScoreCardModel model,
                                  final Overview overview,
                                  final PackageDataModelOracleBaselinePayload dataModel) {
        this.model = PortablePreconditions.checkNotNull("model", model);
        this.overview = PortablePreconditions.checkNotNull("overview", overview);
        this.dataModel = PortablePreconditions.checkNotNull("dataModel", dataModel);
    }

    public ScoreCardModel getModel() {
        return this.model;
    }

    public PackageDataModelOracleBaselinePayload getDataModel() {
        return this.dataModel;
    }

    public Overview getOverview() {
        return overview;
    }
}
