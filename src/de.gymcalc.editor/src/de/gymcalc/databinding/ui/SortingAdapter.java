package de.gymcalc.databinding.ui;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SortingAdapter extends SelectionAdapter {
	public SortingAdapter( TableViewer viewer, int columnIndex ) {
		this.viewer = viewer;
		this.columnIndex = columnIndex;
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		TableComparator comparator = (TableComparator) viewer
				.getComparator();
		// toggle direction if it's the same column
		if (columnIndex == comparator.getSortColumn()) {
			comparator.setAscending(!comparator.isAscending());
		}
		comparator.setSortColumn(columnIndex);
		viewer.getTable().setSortColumn(
				viewer.getTable().getColumn(columnIndex));
		viewer.getTable().setSortDirection(
				comparator.isAscending() ? SWT.UP : SWT.DOWN);
		viewer.refresh(false);
	}
	private TableViewer viewer;
	private int columnIndex = -1;
}
