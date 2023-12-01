/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
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

import React from "react";
import { Dashboard, MonitoringView } from "@kie-tools/runtime-tools-enveloped-components/dist/monitoring";

interface Props {
  dataIndexUrl?: string;
  dashboard?: Dashboard;
  workflow?: string;
}

const MonitoringContainer: React.FC<Props> = ({ workflow, dashboard, dataIndexUrl }) => {
  const _dashboard = dashboard || Dashboard.MONITORING;
  return <MonitoringView dashboard={_dashboard} workflow={workflow} dataIndexUrl={dataIndexUrl!} />;
};

export default MonitoringContainer;
