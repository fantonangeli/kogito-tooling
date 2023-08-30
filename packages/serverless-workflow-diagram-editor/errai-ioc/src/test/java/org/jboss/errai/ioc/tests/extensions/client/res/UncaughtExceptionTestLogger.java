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


package org.jboss.errai.ioc.tests.extensions.client.res;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Max Barkley <mbarkley@redhat.com>
 */
@ApplicationScoped
public class UncaughtExceptionTestLogger {

  private final List<Throwable> logged = new ArrayList<>();

  public void reset() {
    logged.clear();
  }

  public List<Throwable> getLogged() {
    return Collections.unmodifiableList(logged);
  }

  public void log(final Throwable t) {
    logged.add(t);
  }

}
