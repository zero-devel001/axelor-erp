/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.bpm.service;

import com.axelor.apps.bpm.db.WkfProcessConfig;
import com.axelor.db.Model;
import com.axelor.exception.AxelorException;
import java.util.Map;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;

public interface WkfCommonService {

  public WkfProcessConfig findCurrentProcessConfig(Model model);

  public WkfProcessConfig findOldProcessConfig(Model model);

  public Object evalExpression(Map<String, Object> varMap, String expr);

  public Map<String, Object> createVariables(Map<String, Object> modelMap);

  public String getVarName(Object model);

  public Object findRelatedRecord(Model model, String path) throws AxelorException;

  public Model addProperties(
      Map<String, String> propertyMap, Model model, ModelElementInstance element);
}
