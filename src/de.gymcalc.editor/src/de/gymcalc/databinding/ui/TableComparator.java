package de.gymcalc.databinding.ui;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class TableComparator extends ViewerComparator {

	private int sortColumn = 0;
	private int lastSortColumn = 0;
	private boolean ascending = true;
	private boolean lastAscending = true;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.
	 * viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public int compare(Viewer viewer, Object e1, Object e2) {
/*		if (sortColumn == 0) {
			AboutBundleData d1 = (AboutBundleData) e1;
			AboutBundleData d2 = (AboutBundleData) e2;
			int diff = getSignedSortValue(d1) - getSignedSortValue(d2);
			// If values are different, or there is no secondary column defined,
			// we are done
			if (diff != 0 || lastSortColumn == 0)
				return ascending ? diff : -diff;
			// try a secondary sort
			if (viewer instanceof TableViewer) {
				TableViewer tableViewer = (TableViewer) viewer;
				IBaseLabelProvider baseLabel = tableViewer.getLabelProvider();
				if (baseLabel instanceof ITableLabelProvider) {
					ITableLabelProvider tableProvider = (ITableLabelProvider) baseLabel;
					String e1p = tableProvider
							.getColumnText(e1, lastSortColumn);
					String e2p = tableProvider
							.getColumnText(e2, lastSortColumn);
					int result = getComparator().compare(e1p, e2p);
					return lastAscending ? result : (-1) * result;
				}
			}
			// we couldn't determine a secondary sort, call it equal
			return 0;
		}
*/		if (viewer instanceof TableViewer) {
			TableViewer tableViewer = (TableViewer) viewer;
			CellLabelProvider cellProvider = tableViewer.getLabelProvider(sortColumn);
			if (cellProvider instanceof ILabelProvider ) {
				ILabelProvider labelProvider = ( ILabelProvider ) cellProvider;
				String e1p = labelProvider.getText( e1 );
				String e2p = labelProvider.getText( e2 );
				int result = getComparator().compare(e1p, e2p);
				// Secondary column sort
				if (result == 0) {
					CellLabelProvider cell2Provider = tableViewer.getLabelProvider(lastSortColumn);
					if (cell2Provider instanceof ILabelProvider ) {
						ILabelProvider label2Provider = ( ILabelProvider ) cell2Provider;
						e1p = label2Provider.getText(e1);
						e2p = label2Provider.getText(e2);
						result = getComparator().compare(e1p, e2p);
						return lastAscending ? result : (-1) * result;
					} // secondary sort is by column 0
/*					if (e1 instanceof AboutBundleData
							&& e2 instanceof AboutBundleData) {
						AboutBundleData d1 = (AboutBundleData) e1;
						AboutBundleData d2 = (AboutBundleData) e2;
						int diff = getSignedSortValue(d1)
								- getSignedSortValue(d2);
						return lastAscending ? diff : -diff;
					}
*/				}
				// primary column sort
				return ascending ? result : (-1) * result;
			}
		}

		return super.compare(viewer, e1, e2);
	}

	/**
	 * @param data
	 * @return a sort value depending on the signed state
	 */
/*	private int getSignedSortValue(AboutBundleData data) {
		if (!data.isSignedDetermined()) {
			return 0;
		} else if (data.isSigned()) {
			return 1;
		} else {
			return -1;
		}
	}
*/
	/**
	 * @return Returns the sortColumn.
	 */
	public int getSortColumn() {
		return sortColumn;
	}

	/**
	 * @param sortColumn
	 *            The sortColumn to set.
	 */
	public void setSortColumn(int sortColumn) {
		if (this.sortColumn != sortColumn) {
			lastSortColumn = this.sortColumn;
			lastAscending = this.ascending;
			this.sortColumn = sortColumn;
		}
	}

	/**
	 * @return Returns the ascending.
	 */
	public boolean isAscending() {
		return ascending;
	}

	/**
	 * @param ascending
	 *            The ascending to set.
	 */
	public void setAscending(boolean ascending) {
		this.ascending = ascending;
	}
}
