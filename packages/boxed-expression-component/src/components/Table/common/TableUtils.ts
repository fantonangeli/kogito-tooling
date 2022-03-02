/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import * as _ from "lodash";
import { TableInstance } from "react-table";

const DEFAULT = { x: 0, y: 0 };

/**
 * Fetch cell coordinates.
 */
export const getCellCoordinates: (cell: Element | undefined | null) => { x: number; y: number } = (cell) => {
  const tbody = cell?.closest("tbody");
  if (!tbody) {
    return DEFAULT;
  }

  const rows = tbody.querySelectorAll("tr");

  for (let y = 0; y < rows.length; y++) {
    const row = rows[y];
    const cols = row.querySelectorAll(".data-cell");

    for (let x = 0; x < cols.length; x++) {
      if (cell === cols[x]) {
        return { x, y };
      }
    }
  }

  return DEFAULT;
};

/**
 * Fetch the closest parent table id for a given cell.
 */
export const getCellTableId: (cell: Element | undefined | null) => string = (cell) => {
  const cssClasses = cell?.closest(".table-component")?.classList || [];
  return _.first([].slice.call(cssClasses).filter((c: string) => c.match(/table-event-/g))) || "";
};

/**
 * Get the table header's hows henght.
 *
 * @param tableInstance the tableInstance
 * @param skipLastHeaderGroup true to skip last header group
 * @return the number of rows, 0 otherwise
 */
export const getHeaderRowsLenght = (tableInstance: TableInstance, skipLastHeaderGroup: boolean): number => {
  if (!tableInstance || typeof skipLastHeaderGroup === "undefined" || !tableInstance.headerGroups) {
    return 0;
  }
  return skipLastHeaderGroup ? tableInstance.headerGroups.length - 1 : tableInstance.headerGroups.length;
};
