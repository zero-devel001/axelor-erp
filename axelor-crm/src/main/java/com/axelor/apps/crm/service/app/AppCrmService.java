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
package com.axelor.apps.crm.service.app;

import com.axelor.apps.base.db.AppCrm;
import com.axelor.apps.base.service.app.AppBaseService;
import com.axelor.apps.crm.db.LeadStatus;
import com.axelor.apps.crm.db.OpportunityStatus;
import com.axelor.exception.AxelorException;

public interface AppCrmService extends AppBaseService {

  public void generateCrmConfigurations();

  public AppCrm getAppCrm();

  LeadStatus getLostLeadStatus() throws AxelorException;

  LeadStatus getConvertedLeadStatus() throws AxelorException;

  OpportunityStatus getClosedWinOpportunityStatus() throws AxelorException;

  OpportunityStatus getClosedLostOpportunityStatus() throws AxelorException;

  OpportunityStatus getSalesPropositionStatus() throws AxelorException;
}
