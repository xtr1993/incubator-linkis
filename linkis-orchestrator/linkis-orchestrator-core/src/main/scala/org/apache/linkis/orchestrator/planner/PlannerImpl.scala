/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.orchestrator.planner

import org.apache.linkis.orchestrator.extensions.catalyst.{AnalyzeTransform, PlannerTransform}
import org.apache.linkis.orchestrator.plans.logical.{LogicalContext, LogicalContextImpl, Task}

/**
  *
  *
  */
class PlannerImpl extends AbstractPlanner {

  override protected def plannerTransforms: Array[PlannerTransform] = Array.empty

  override protected def createLogicalContext(task: Task): LogicalContext = new LogicalContextImpl

  override protected def analyzeTransforms: Array[AnalyzeTransform] = Array.empty

}