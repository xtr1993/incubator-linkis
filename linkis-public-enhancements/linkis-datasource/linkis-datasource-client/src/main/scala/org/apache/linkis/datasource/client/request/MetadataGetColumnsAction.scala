/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.datasource.client.request

import org.apache.linkis.datasource.client.config.DatasourceClientConfig.METADATA_SERVICE_MODULE
import org.apache.linkis.datasource.client.exception.DataSourceClientBuilderException
import org.apache.linkis.httpclient.request.GetAction

class MetadataGetColumnsAction extends GetAction with DataSourceAction {

  private var dataSourceName: String = _

  private var database: String = _
  private var table: String = _

  override def suffixURLs: Array[String] = Array(METADATA_SERVICE_MODULE.getValue, "getColumns")

  private var user: String = _

  override def setUser(user: String): Unit = this.user = user

  override def getUser: String = this.user
}

object MetadataGetColumnsAction {
  def builder(): Builder = new Builder

  class Builder private[MetadataGetColumnsAction] () {
    private var dataSourceName: String = _
    private var database: String = _
    private var table: String = _
    private var system: String = _
    private var user: String = _

    def setUser(user: String): Builder = {
      this.user = user
      this
    }

    def setDataSourceName(dataSourceName: String): Builder = {
      this.dataSourceName = dataSourceName
      this
    }

    def setDatabase(database: String): Builder = {
      this.database = database
      this
    }

    def setTable(table: String): Builder = {
      this.table = table
      this
    }

    def setSystem(system: String): Builder = {
      this.system = system
      this
    }

    def build(): MetadataGetColumnsAction = {
      if (dataSourceName == null)
        throw new DataSourceClientBuilderException("dataSourceName is needed!")
      if (database == null) throw new DataSourceClientBuilderException("database is needed!")
      if (table == null) throw new DataSourceClientBuilderException("table is needed!")
      if (system == null) throw new DataSourceClientBuilderException("system is needed!")
      if (user == null) throw new DataSourceClientBuilderException("user is needed!")

      val metadataGetColumnsAction = new MetadataGetColumnsAction
      metadataGetColumnsAction.dataSourceName = this.dataSourceName
      metadataGetColumnsAction.database = this.database
      metadataGetColumnsAction.table = this.table
      metadataGetColumnsAction.setParameter("system", system)
      metadataGetColumnsAction.setUser(user)
      metadataGetColumnsAction
    }

  }

}
