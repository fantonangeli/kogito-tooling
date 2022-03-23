/*
 * Copyright (C) 2017 Red Hat, Inc. and/or its affiliates.
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

package org.jboss.errai.databinding.client.scan;

import org.jboss.errai.common.client.api.annotations.Portable;
import org.junit.Ignore;

/**
 * Simple bindable model for testing purposes (needs to be configured as
 * bindable type in ErraiApp.properties).
 * 
 * @author Ben Dol
 */
@Portable
@Ignore
public class TestModelWithoutBindableA {

  private String value;
  private TestModelWithoutBindableA child;

  public TestModelWithoutBindableA() {
    
  }
  
  public TestModelWithoutBindableA (String value) {
    this.value = value;
  }
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TestModelWithoutBindableA getChild() {
    return child;
  }

  public void setChild(TestModelWithoutBindableA child) {
    this.child = child;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((child == null) ? 0 : child.hashCode());
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TestModelWithoutBindableA other = (TestModelWithoutBindableA) obj;
    if (child == null) {
      if (other.child != null)
        return false;
    }
    else if (!child.equals(other.child))
      return false;
    if (value == null) {
      if (other.value != null)
        return false;
    }
    else if (!value.equals(other.value))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "TestModelWithoutBindableA [value=" + value + ", child=" + child + "]";
  }

}
