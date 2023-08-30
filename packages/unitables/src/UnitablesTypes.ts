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

import * as React from "react";
import { DmnBuiltInDataType } from "@kie-tools/boxed-expression-component/dist/api";

export interface UnitablesColumnType {
  name: string;
  joinedName: string;
  dataType: DmnBuiltInDataType; // FIXME: Decouple from DMN --> https://github.com/kiegroup/kie-issues/issues/166
  width?: number;
  type: string;

  cellDelegate?: (id: string) => React.ReactNode;
  insideProperties?: any[];
}

export interface UnitablesRowType {
  inputEntries: string[];
}

export interface UnitablesCellConfigs {
  width?: number;
}

// Can't use Record<string, UnitablesCellConfigs | UnitablesInputsConfigs> because it can't handle recursive types;
export type UnitablesInputsConfigs = { [x: string]: UnitablesCellConfigs | UnitablesInputsConfigs };
