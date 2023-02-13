/*
 * Copyright 2014 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package java.util;

import javaemul.internal.InternalPreconditions;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A helper to detect concurrent modifications to collections. This is implemented as a helper
 * utility so that we could remove the checks easily by a flag.
 */
class ConcurrentModificationDetector {

  private static final boolean API_CHECK = InternalPreconditions.isApiChecked();

  public static void structureChanged(Object host) {
    if (!API_CHECK) {
      return;
    }

    ModCountable modCountable = (ModCountable) host;
    // Ensure that modCount is initialized if it is not already.
    int modCount = modCountable.getModCount() | 0;
    modCountable.setModCount(modCount + 1);
  }

  public static void recordLastKnownStructure(Object host, Iterator<?> iterator) {
    if (!API_CHECK) {
      return;
    }

    ((ModCountable) iterator).setModCount(((ModCountable) host).getModCount());
  }

  public static void checkStructuralChange(Object host, Iterator<?> iterator) {
    if (!API_CHECK) {
      return;
    }

    if (((ModCountable) iterator).getModCount() != ((ModCountable) host).getModCount()) {
      throw new ConcurrentModificationException();
    }
  }

  @JsType(isNative = true, name = "*", namespace = JsPackage.GLOBAL)
  private interface ModCountable {
    @JsProperty(name = "$modCount")
    void setModCount(int modCount);

    @JsProperty(name = "$modCount")
    int getModCount();
  }
}
