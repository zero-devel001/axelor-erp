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
package com.axelor.apps.supplierportal.exceptions;

/** @deprecated Replaced by {@link SupplierPortalExceptionMessage} */
@Deprecated
public interface IExceptionMessage {
  static final String PRODUCT_SUPPLIER_NO_NAME = /*$$(*/ "Product has no name." /*)*/;

  static final String PRODUCT_SUPPLIER_NO_CODE = /*$$(*/ "Product has no code." /*)*/;

  static final String PRODUCT_SUPPLIER_SAME_CODE = /*$$(*/
      "The code is already in database. Please choose another one." /*)*/;
}
