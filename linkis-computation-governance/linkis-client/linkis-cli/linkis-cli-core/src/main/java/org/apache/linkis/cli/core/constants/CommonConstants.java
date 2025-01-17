/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.cli.core.constants;

public class CommonConstants {

  public static final Long JOB_QUERY_SLEEP_MILLS = 2000l;
  public static final Integer REQUEST_MAX_RETRY_TIME = 3;

  public static final String UNIVERSAL_SUBCMD = "linkis-cli";
  public static final String UNIVERSAL_SUBCMD_DESC =
      "command for all types of jobs supported by Linkis";

  public static final String SUCCESS_INDICATOR = "############Execute Success!!!########";
  public static final String FAILURE_INDICATOR = "############Execute Error!!!########";
  public static final String ARRAY_SEQ = "@#@";
  public static final String ARRAY_SEQ_REGEX = "(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
  public static final int MAX_NUM_OF_COMMAND_ARGUEMENTS = 10;
  public static final String CONFIG_DIR = "config.path";
  public static final String[] CONFIG_EXTENSION = {"properties"};
  public static final String SYSTEM_PROPERTIES_IDENTIFIER = "SYS_PROP";
  public static final String SYSTEM_ENV_IDENTIFIER = "SYS_ENV";
}
