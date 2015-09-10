/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2014 Axelor (<http://axelor.com>).
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
package com.axelor.apps.sale.module;

import com.axelor.app.AxelorModule;
import com.axelor.apps.base.db.IPartner;
import com.axelor.apps.sale.db.SaleOrder;
import com.axelor.apps.sale.db.repo.SaleOrderManagementRepository;
import com.axelor.apps.sale.db.repo.SaleOrderRepository;
import com.axelor.apps.sale.service.OpportunitySaleOrderService;
import com.axelor.apps.sale.service.OpportunitySaleOrderServiceImpl;
import com.axelor.apps.sale.service.SaleOrderService;
import com.axelor.apps.sale.service.SaleOrderServiceImpl;


public class SaleModule extends AxelorModule {

    @Override
    protected void configure() {
        bind(SaleOrderService.class).to(SaleOrderServiceImpl.class);
        bind(SaleOrderRepository.class).to(SaleOrderManagementRepository.class);
        bind(OpportunitySaleOrderService.class).to(OpportunitySaleOrderServiceImpl.class);
        IPartner.modelPartnerFieldMap.put(SaleOrder.class.getName(), "clientPartner");
    }
}