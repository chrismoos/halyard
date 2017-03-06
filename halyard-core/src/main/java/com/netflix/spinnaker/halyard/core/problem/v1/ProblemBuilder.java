/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.netflix.spinnaker.halyard.core.problem.v1;

import com.netflix.spinnaker.halyard.core.problem.v1.Problem.Severity;
import lombok.Setter;

import java.util.List;

public class ProblemBuilder {
  @Setter
  private Severity severity;

  @Setter
  private String location;

  @Setter
  private String message;

  @Setter
  private String remediation;

  @Setter
  private List<String> options;

  public ProblemBuilder(Severity severity, String message) {
    this.severity = severity;
    this.message = message;
  }

  public Problem build() {
    return new Problem(message, remediation, options, severity, location);
  }
}