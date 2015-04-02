package de.gymcalc.print;

import java.io.Writer;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class CreateCalcReportHtml {

	AdapterFactory factory;
	boolean fillRankAndPoints;
	boolean useOrganization;
	boolean useFrame;
	boolean provideAdditionalRows;
	
	public CreateCalcReportHtml (AdapterFactory factory, boolean fillRankAndPoints, boolean useOrganization, boolean useFrame, boolean provideAdditionalRows) {
		this.factory = factory;
		this.fillRankAndPoints = fillRankAndPoints;
		this.useOrganization = useOrganization;
		this.useFrame = useFrame;
		this.provideAdditionalRows = provideAdditionalRows;
	}
	
	void createCalcReportHtml (Object object, Writer writer) {
		try {
			Object content = factory.adapt (object, ITreeItemContentProvider.class);
			if (content instanceof ITableItemLabelProvider) {
				writer.write("<h1>");
				writer.write(((ITableItemLabelProvider)content).getColumnText(object, 0));
				writer.write("</h1>");
			}
			writer.write("<table");
			if (this.useFrame) {
				writer.write(" border=\"1\" cellspacing=\"0\"");
			}
			writer.write(">");
			int maxColumn = 0;
			if (content instanceof ITableItemLabelProvider) {
				ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) content;
				writer.write("<tr");
				if (this.useFrame) {
					writer.write(" height=\"20\"");
				}
				writer.write(">");
				writer.write("<th>Name</th>");
				if (this.useOrganization) {
					String label = labelProvider.getColumnText (object, 1);
					writer.write("<th>");
					writer.write(label);
					writer.write("</th>");
				}
				for (int column = 2; ; ++column) {
					String label = labelProvider.getColumnText (object, column);
					if (0 == label.length ()) {
						maxColumn = column;
						break;
					}
					writer.write("<th>");
					writer.write(label);
					writer.write("</th>");
				}
				writer.write("</tr>");
			}
			Collection<?> collection = ((ITreeItemContentProvider) content).getElements (object);
			Object elements[] = collection.toArray ();
			for (int elementIdx = 0; elements.length > elementIdx; ++elementIdx) {
				Object element = elements[elementIdx];
				Object elementAdapter = factory.adapt(element, ITableItemLabelProvider.class);
				if (elementAdapter instanceof ITableItemLabelProvider) {
					ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) elementAdapter;
					writer.write("<tr");
					if (this.useFrame) {
						writer.write(" height=\"20\"");
					}
					writer.write(">");
					for (int column = 0; maxColumn > column; ++column) {
						if (!(1 == column && !this.useOrganization)) {
							String label = labelProvider.getColumnText (element, column);
							writer.write("<td>");
							if (null != label && !((2 == column || 3 == column) && !this.fillRankAndPoints)) {
								writer.write(label);
							} else {
								writer.write("&nbsp;");
							}
							writer.write("</td>");
						}
					}
					writer.write("</tr>");
				}
			}
			if (this.provideAdditionalRows) {
				// provide 3 additional empty rows
				for (int i = 0; 3 > i; ++i) {
					writer.write("<tr");
					if (this.useFrame) {
						writer.write(" height=\"20\"");
					}
					writer.write(">");
					for (int column = 0; maxColumn > column; ++column) {
						if (!(1 == column && !this.useOrganization)) {
							writer.write("<td>&nbsp;</td>");
						}
					}
					writer.write("</tr>");
				}
			}
			writer.write("</table>");
		} catch (Exception e) {
			
		}
	}
}
