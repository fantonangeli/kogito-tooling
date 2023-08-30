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
import { Page, PageSection } from "@patternfly/react-core/dist/js/components/Page";
import { Text, TextContent } from "@patternfly/react-core/dist/js/components/Text";

export function Home() {
  return (
    <Page>
      <PageSection>
        <TextContent>
          <Text component={"h1"}>Welcome to KIE Tools Examples</Text>
          <Text component={"p"}>
            <span>To understand what's in this webapp, please refer to the project </span>
            <a href={"https://github.com/kiegroup/kie-tools/blob/main/examples/webapp/README.md"}>{"README"}</a>
            <span> on GitHub.</span>
          </Text>
        </TextContent>
      </PageSection>
    </Page>
  );
}
