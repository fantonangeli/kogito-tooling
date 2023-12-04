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

import React, { useEffect } from "react";
import { Card } from "@patternfly/react-core/dist/js/components/Card";
import { PageSection } from "@patternfly/react-core/dist/js/components/Page";
import { OUIAProps, ouiaPageTypeAndObjectId } from "@kie-tools/runtime-tools-components/dist/ouiaTools";
import { PageSectionHeader } from "@kie-tools/runtime-tools-components/dist/consolesCommon/components/layout/PageSectionHeader";
import FormsListContainer from "../../containers/FormsListContainer/FormsListContainer";
import "../../styles.css";

const FormsListPage: React.FC<OUIAProps> = () => {
  useEffect(() => {
    return ouiaPageTypeAndObjectId("forms-list");
  });

  return (
    <React.Fragment>
      <PageSectionHeader titleText="Forms" />
      <PageSection>
        <Card className="Dev-ui__card-size">
          <FormsListContainer />
        </Card>
      </PageSection>
    </React.Fragment>
  );
};

export default FormsListPage;
