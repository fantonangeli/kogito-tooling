/*
 * Copyright 2023 Red Hat, Inc. and/or its affiliates.
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

import { OpenApi } from "openapi-v3";
import React, { PropsWithChildren, useEffect, useMemo, useState } from "react";
import { useOpenApiPromise } from "../hooks/useOpenApiPromise";
import { OpenApiContext } from "./OpenApiContext";

export function OpenApiContextProvider(props: PropsWithChildren<{}>) {
  const openApiPromise = useOpenApiPromise();
  const [openApiData, setOpenApiData] = useState<OpenApi>();

  useEffect(() => {
    if (!openApiPromise.data) {
      return;
    }

    setOpenApiData(openApiPromise.data);
  }, [openApiPromise.data]);

  const value = useMemo(
    () => ({
      openApiPromise,
      openApiData,
    }),
    [openApiPromise, openApiData]
  );

  return <OpenApiContext.Provider value={value}>{props.children}</OpenApiContext.Provider>;
}
