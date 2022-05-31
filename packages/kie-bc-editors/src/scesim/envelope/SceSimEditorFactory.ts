/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { SceSimEditor, SceSimEditorImpl } from "./SceSimEditor";
import { getSceSimLanguageData, SceSimEditorChannelApi } from "../api";
import { GwtEditorWrapperFactory, XmlFormatter } from "../../common";
import { EditorFactory, EditorInitArgs, KogitoEditorEnvelopeContextType } from "@kie-tools-core/editor/dist/api";

export class SceSimEditorFactory implements EditorFactory<SceSimEditor, SceSimEditorChannelApi> {
  constructor(private readonly gwtEditorEnvelopeConfig: { shouldLoadResourcesDynamically: boolean }) {}

  public createEditor(
    ctx: KogitoEditorEnvelopeContextType<SceSimEditorChannelApi>,
    initArgs: EditorInitArgs
  ): Promise<SceSimEditor> {
    const languageData = getSceSimLanguageData(initArgs.resourcesPathPrefix);
    const factory = new GwtEditorWrapperFactory<SceSimEditor>(
      languageData,
      (self) =>
        new SceSimEditorImpl(
          languageData.editorId,
          self.gwtAppFormerApi.getEditor(languageData.editorId),
          ctx.channelApi,
          new XmlFormatter(),
          self.gwtStateControlService,
          self.kieBcEditorsI18n
        ),
      this.gwtEditorEnvelopeConfig
    );

    return factory.createEditor(ctx, initArgs);
  }
}
