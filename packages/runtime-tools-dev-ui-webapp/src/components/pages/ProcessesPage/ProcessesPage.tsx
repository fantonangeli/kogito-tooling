/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { PageSectionHeader } from "@kie-tools/runtime-tools-components/dist/consolesCommon/components/layout/PageSectionHeader";
import {
  componentOuiaProps,
  ouiaPageTypeAndObjectId,
  OUIAProps,
} from "@kie-tools/runtime-tools-components/dist/ouiaTools";
import { WorkflowDefinition, WorkflowListState } from "@kie-tools/runtime-tools-gateway-api/dist/types";
import { WorkflowDefinitionListContainer } from "@kie-tools/runtime-tools-webapp-components/dist/WorkflowDefinitionListContainer";
import { WorkflowListContainer } from "@kie-tools/runtime-tools-webapp-components/dist/WorkflowListContainer";
import { Card } from "@patternfly/react-core/dist/js/components/Card";
import { PageSection } from "@patternfly/react-core/dist/js/components/Page";
import { Tab, Tabs, TabTitleText } from "@patternfly/react-core/dist/js/components/Tabs";
import * as H from "history";
import React, { ReactText, useCallback, useEffect, useState } from "react";
import { StaticContext, useHistory } from "react-router";
import { RouteComponentProps } from "react-router-dom";
import { useDevUIAppContext } from "../../contexts/DevUIAppContext";
import "../../styles.css";
import {
  useWorkflowListGatewayApi,
  WorkflowListGatewayApi,
} from "@kie-tools/runtime-tools-webapp-components/dist/WorkflowList";

interface MatchProps {
  instanceID: string;
}

const ProcessesPage: React.FC<RouteComponentProps<MatchProps, StaticContext, H.LocationState> & OUIAProps> = ({
  ouiaId,
  ouiaSafe,
  ...props
}) => {
  const apiContext = useDevUIAppContext();
  const history = useHistory();
  const gatewayApi: WorkflowListGatewayApi = useWorkflowListGatewayApi();

  const [activeTabKey, setActiveTabKey] = useState<ReactText>(0);

  useEffect(() => {
    return ouiaPageTypeAndObjectId("process-instances");
  });

  const initialState: WorkflowListState = props.location && (props.location.state as WorkflowListState);

  const handleTabClick = (_event: React.MouseEvent<HTMLElement, MouseEvent>, tabIndex: number) => {
    setActiveTabKey(tabIndex);
  };

  const onOpenWorkflowDetails = useCallback(
    (args: { workflowId: string; state: WorkflowListState }) => {
      history.push({
        pathname: `/Process/${args.workflowId}`,
        state: gatewayApi.workflowListState,
      });
    },
    [history]
  );

  const onOpenWorkflowForm = useCallback(
    (workflowDefinition: WorkflowDefinition) => {
      history.push({
        pathname: `/WorkflowDefinition/Form/${workflowDefinition.workflowName}`,
        state: {
          workflowDefinition: {
            workflowName: workflowDefinition.workflowName,
            endpoint: workflowDefinition.endpoint,
          },
        },
      });
    },
    [history]
  );

  return (
    <React.Fragment>
      {activeTabKey === 0 && (
        <PageSectionHeader titleText={`${apiContext.customLabels?.singularProcessLabel} Instances`} ouiaId={ouiaId} />
      )}
      {activeTabKey === 1 && (
        <PageSectionHeader titleText={`${apiContext.customLabels?.singularProcessLabel} Definitions`} ouiaId={ouiaId} />
      )}
      <div>
        <Tabs
          activeKey={activeTabKey}
          onSelect={handleTabClick}
          isBox
          variant="light300"
          style={{
            background: "white",
          }}
        >
          <Tab
            id="process-list-tab"
            eventKey={0}
            title={<TabTitleText>{apiContext.customLabels?.singularProcessLabel} Instances</TabTitleText>}
          >
            <PageSection {...componentOuiaProps(ouiaId, "process-list-page-section", ouiaSafe)}>
              <Card className="Dev-ui__card-size">
                <WorkflowListContainer initialState={initialState} onOpenWorkflowDetails={onOpenWorkflowDetails} />
              </Card>
            </PageSection>
          </Tab>
          <Tab
            id="process-definitions-tab"
            eventKey={1}
            title={<TabTitleText>{apiContext.customLabels?.singularProcessLabel} Definitions</TabTitleText>}
          >
            <PageSection {...componentOuiaProps(ouiaId, "process-definition-list-page-section", ouiaSafe)}>
              <Card className="Dev-ui__card-size">
                <WorkflowDefinitionListContainer onOpenWorkflowForm={onOpenWorkflowForm} />
              </Card>
            </PageSection>
          </Tab>
        </Tabs>
      </div>
    </React.Fragment>
  );
};

export default ProcessesPage;
