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

import * as React from "react";
import { useCallback, useMemo } from "react";
import { Tbody, Td, Tr } from "@patternfly/react-table";
import { Column as IColumn, TableHeaderVisibility } from "../../api";
import { Cell, Column, Row, TableInstance } from "react-table";
import { DEFAULT_MIN_WIDTH, Resizer } from "../Resizer";
import {
  focusPrevCell,
  focusNextCell,
  focusUpperCell,
  focusLowerCell,
  focusInsideCell,
  getParentCell,
  focusParentCell,
} from "./common";
import { BoxedExpressionGlobalContext, useBoxedExpression } from "../../context";

export interface TableBodyProps {
  /** Table instance */
  tableInstance: TableInstance;
  /** The way in which the header will be rendered */
  headerVisibility?: TableHeaderVisibility;
  /** Optional children element to be appended below the table content */
  children?: React.ReactElement[];
  /** Custom function for getting row key prop, and avoid using the row index */
  getRowKey: (row: Row) => string;
  /** Custom function for getting column key prop, and avoid using the column index */
  getColumnKey: (column: Column) => string;
  /** Function to be executed when columns are modified */
  onColumnsUpdate?: (columns: Column[]) => void;
  /** Td props */
  tdProps: (cellIndex: number, rowIndex: number) => any;
  /** Show/hide table handler */
  showTableHandler: boolean;
  /** Function to programmatically show/hide table handler */
  setShowTableHandler: React.Dispatch<React.SetStateAction<boolean>>;
}

export const TableBody: React.FunctionComponent<TableBodyProps> = ({
  tableInstance,
  children,
  headerVisibility,
  getRowKey,
  getColumnKey,
  onColumnsUpdate,
  tdProps,
  showTableHandler,
}) => {
  const headerVisibilityMemo = useMemo(() => headerVisibility ?? TableHeaderVisibility.Full, [headerVisibility]);

  const { isContextMenuOpen } = useBoxedExpression();

  /**
   * base props for td elements
   */
  const tdBaseProps = useCallback(
    (_columnIndex: number, rowIndex: number) => ({
      tabIndex: 0,
      onKeyDown: (e: React.KeyboardEvent<HTMLElement>) => {
        const key = e.key;

        if (isContextMenuOpen) {
          e.preventDefault();
          return;
        }

        //prevent the parent cell catch this event if there is a nested table
        if (e.currentTarget !== getParentCell(e.target as HTMLElement)) {
          return;
        }

        /* FIXME: View mode: Tab/shift+tab should move focus one cell to the right/left. At the last cell on a line tab should advance to the first row on the next line.*/
        /* FIXME: Edit mode: Tab/shift+tab should end editing and advance the focus to the next cell to the right. Currently it ends editing but you lose the focus rectangle and have to hit tab again to get it back. You can’t type “AA” tab “BB” to put AA in cell 1 and BB in cell 2, especially if there is already text in the cells.*/

        const isFiredFromThis = e.currentTarget === e.target;

        if (key === "Tab") {
          e.preventDefault();
          if (e.shiftKey) {
            focusPrevCell(e.currentTarget);
          } else {
            /* FIXME: When edit the last cell of a row, press tab -> focus is lost */
            focusNextCell(e.currentTarget);
          }
        } else if (key === "ArrowLeft") {
          focusPrevCell(e.currentTarget);
        } else if (key === "ArrowRight") {
          focusNextCell(e.currentTarget);
        } else if (key === "ArrowUp") {
          focusUpperCell(e.currentTarget, rowIndex);
        } else if (key === "ArrowDown") {
          focusLowerCell(e.currentTarget, rowIndex);
        } else if (key === "Escape") {
          focusParentCell(e.currentTarget);
        } else if (!isContextMenuOpen && isFiredFromThis) {
          if (key === "Enter") {
            focusInsideCell(e.currentTarget);
          } else {
            focusInsideCell(e.currentTarget, true);
          }
        }
      },
    }),
    [isContextMenuOpen]
  );

  const renderCell = useCallback(
    (cellIndex: number, cell: Cell, rowIndex: number, inAForm: boolean) => {
      let cellType = cellIndex === 0 ? "counter-cell" : "data-cell";
      const column = tableInstance.allColumns[cellIndex] as unknown as IColumn;
      const width = typeof column?.width === "number" ? column?.width : DEFAULT_MIN_WIDTH;

      const onResize = (width: number) => {
        if (column.setWidth) {
          column.setWidth(width);
          tableInstance.allColumns[cellIndex].width = width;
          onColumnsUpdate?.(tableInstance.columns);
        }
      };
      const cellTemplate =
        cellIndex === 0 ? (
          <>{rowIndex + 1}</>
        ) : (
          <Resizer width={width} onHorizontalResizeStop={onResize}>
            <>
              {inAForm && typeof (cell.column as any)?.cellDelegate === "function"
                ? (cell.column as any)?.cellDelegate(`dmn-auto-form-${rowIndex}`)
                : cell.render("Cell")}
            </>
          </Resizer>
        );

      if (typeof (cell.column as any)?.cellDelegate === "function") {
        cellType += " input";
      }

      const tdProp = { ...tdBaseProps(cellIndex, rowIndex), ...tdProps(cellIndex, rowIndex) };

      return (
        <Td
          {...tdProp}
          key={`${rowIndex}-${getColumnKey(cell.column)}-${cellIndex}`}
          data-ouia-component-id={"expression-column-" + cellIndex}
          className={`${cellType}`}
        >
          {cellTemplate}
        </Td>
      );
    },
    [getColumnKey, onColumnsUpdate, tableInstance, tdProps, tdBaseProps]
  );

  const renderBodyRow = useCallback(
    (row: Row, rowIndex: number) => {
      tableInstance.prepareRow(row);
      const rowProps = { ...row.getRowProps(), style: {} };
      const RowDelegate = (row.original as any).rowDelegate;
      const rowKey = getRowKey(row);
      const rowClassNames = `${rowKey} table-row`;
      return (
        <React.Fragment key={rowKey}>
          {RowDelegate ? (
            <RowDelegate>
              <Tr className={rowClassNames} {...rowProps} ouiaId={"expression-row-" + rowIndex} key={rowKey}>
                {row.cells.map((cell: Cell, cellIndex: number) => renderCell(cellIndex, cell, rowIndex, true))}
              </Tr>
            </RowDelegate>
          ) : (
            <Tr className={rowClassNames} {...rowProps} ouiaId={"expression-row-" + rowIndex} key={rowKey}>
              {row.cells.map((cell: Cell, cellIndex: number) => renderCell(cellIndex, cell, rowIndex, false))}
            </Tr>
          )}
        </React.Fragment>
      );
    },
    [getRowKey, renderCell, tableInstance]
  );

  const renderAdditiveRow = useCallback(
    (rowIndex: number) => (
      <Tr className="table-row additive-row">
        <Td role="cell" className="empty-cell" {...tdBaseProps(0, rowIndex)}>
          <br />
        </Td>
        {children?.map((child, childIndex) => {
          return (
            <Td role="cell" key={childIndex} className="row-remainder-content" {...tdBaseProps(childIndex, rowIndex)}>
              {child}
            </Td>
          );
        })}
      </Tr>
    ),
    [children, tdBaseProps]
  );

  return (
    <Tbody
      className={`${headerVisibilityMemo === TableHeaderVisibility.None ? "missing-header" : ""}`}
      {...(tableInstance.getTableBodyProps() as any)}
    >
      {tableInstance.rows.map((row: Row, rowIndex: number) => renderBodyRow(row, rowIndex))}
      {children ? renderAdditiveRow(tableInstance.rows.length) : null}
    </Tbody>
  );
};
