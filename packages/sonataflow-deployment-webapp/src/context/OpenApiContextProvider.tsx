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

import { OpenAPI } from "openapi-types";
import React, { PropsWithChildren, useEffect, useMemo, useState } from "react";
import { WorkflowFormGatewayApi } from "../api";
import { useOpenApiPromise } from "../hooks/useOpenApiPromise";
import { WorkflowFormGatewayApiImpl } from "../impl/WorkflowFormGatewayApiImpl";
import { OpenApiContext } from "./OpenApiContext";

export function OpenApiContextProvider(props: PropsWithChildren<{}>) {
  const openApiPromise = useOpenApiPromise();
  const [openApiData, setOpenApiData] = useState<OpenAPI.Document>();
  const [gatewayApi, setGatewayApi] = useState<WorkflowFormGatewayApi>();

  useEffect(() => {
    if (!openApiPromise.data) {
      return;
    }

    setOpenApiData(openApiPromise.data);
    setGatewayApi(new WorkflowFormGatewayApiImpl(openApiPromise.data));
  }, [openApiPromise.data]);

  const value = useMemo(
    () => ({
      openApiPromise,
      openApiData,
      gatewayApi,
    }),
    [openApiPromise, openApiData, gatewayApi]
  );

  return <OpenApiContext.Provider value={value}>{props.children}</OpenApiContext.Provider>;
}
