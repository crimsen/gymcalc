
package de.gymcalc.rcp.juriclient.parts;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.conversion.NumberToStringConverter;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.JuriResultDetailType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.util.ContestUtil;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;

public class ResultView {

	@PostConstruct
	public void createComposite(Composite parent) {
		FormToolkit tk = new FormToolkit(parent.getDisplay());
		ScrolledForm f = tk.createScrolledForm(parent);
		Form form = f.getForm();
		tk.decorateFormHeading(form);
		form.setText("Wertung");
		Composite formBody = form.getBody();
		tk.createLabel(formBody, "D1", SWT.RIGHT);
		td11 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		td12 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "D2", SWT.RIGHT);
		td21 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		td22 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E1", SWT.RIGHT);
		te11 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		te12 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E2", SWT.RIGHT);
		te21 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		te22 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "Penalty", SWT.RIGHT);
		tp1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tp2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);

		tk.createLabel(formBody, "Gesamt");
		ts = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createButton(formBody, "Berechne", SWT.PUSH);

		bindData();

		activeObjectService.addListener(AthletType.class, new IActiveObjectListener() {
			@Override
			public void onActiveObjectChanged(Object type, Object object) {
				AthletType a = null;
				if (null != object) {
					a = (AthletType) object;
				}
				updateDataFromAthlet(a);
			}
		});
		activeObjectService.addListener(StationType.class, new IActiveObjectListener() {
			@Override
			public void onActiveObjectChanged(Object type, Object object) {
				Object o = activeObjectService.getActiveObject(AthletType.class);
				AthletType a = null;
				if (null != o) {
					a = (AthletType) o;
				}
				updateDataFromAthlet(a);
			}
		});

		GridLayoutFactory.swtDefaults().numColumns(3).generateLayout(formBody);
	}

	protected class DetailEntry {
		protected String key; // the key in juridetail
		protected WritableValue<Double> value; // the value that corresponds to the key
		protected boolean isAvailable; // marker if the key is available in the orgination details

		protected DetailEntry(String aKey, WritableValue<Double> aValue, boolean available) {
			key = aKey;
			value = aValue;
			isAvailable = available;
		}
	}

	protected void bindData() {
		values.add(new DetailEntry("D1", wd11, true));
		values.add(new DetailEntry("D2", wd21, true));
		values.add(new DetailEntry("E1", we11, true));
		values.add(new DetailEntry("E2", we21, true));
		values.add(new DetailEntry("D12", wd12, true));
		values.add(new DetailEntry("D22", wd22, true));
		values.add(new DetailEntry("E12", we12, true));
		values.add(new DetailEntry("E22", we22, true));
		values.add(new DetailEntry("P", wp1, true));
		values.add(new DetailEntry("P2", wp2, true));
		dbc = new DataBindingContext();
		IConverter targetToModelConverter = StringToNumberConverter.toDouble(true);
		IConverter modelToTargetConverter = NumberToStringConverter.fromDouble(true);
		dbc.bindValue(wd11, WidgetProperties.text().observe(td11),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(wd12, WidgetProperties.text().observe(td12),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(wd21, WidgetProperties.text().observe(td21),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(wd22, WidgetProperties.text().observe(td22),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(we11, WidgetProperties.text().observe(te11),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(we12, WidgetProperties.text().observe(te12),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(we21, WidgetProperties.text().observe(te21),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(we22, WidgetProperties.text().observe(te22),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(wp1, WidgetProperties.text().observe(tp1),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(wp2, WidgetProperties.text().observe(tp2),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
		dbc.bindValue(ws, WidgetProperties.text().observe(ts),
				new UpdateValueStrategy().setConverter(modelToTargetConverter),
				new UpdateValueStrategy().setConverter(targetToModelConverter));
	}

	protected void updateUserInterface() {

	}

	protected void updateDataFromAthlet(AthletType athlet) {
		result = null;
		Object station = activeObjectService.getActiveObject(StationType.class);
		if (null != athlet && null != station) {
			result = ContestUtil.findResult(athlet, (StationType) station);
		}
		if (null == result) {
			wd11.setValue(Double.NaN);
			wd12.setValue(Double.NaN);
			wd21.setValue(Double.NaN);
			wd22.setValue(Double.NaN);
			we11.setValue(Double.NaN);
			we12.setValue(Double.NaN);
			we21.setValue(Double.NaN);
			we22.setValue(Double.NaN);
			wp1.setValue(Double.NaN);
			wp2.setValue(Double.NaN);
			ws.setValue(Double.NaN);
		} else {
			ws.setValue(result.getValue());
			ArrayList<String> keysSet = new ArrayList<String>();
			for (JuriResultDetailType d : result.getJuriResultDetail()) {
				String key = d.getKey();
				DetailEntry de = null;
				for (DetailEntry e : values) {
					if (key.equals(e.key)) {
						de = e;
						break;
					}
				}
				if (null != de) {
					de.value.setValue(d.getValue());
					keysSet.add(key);
				}
			}
			// set all values that are not in detials to NAN
			for (DetailEntry e : values) {
				if (!keysSet.contains(e.key)) {
					e.value.setValue(Double.NaN);
				}
			}
		}
	}

	protected DataBindingContext dbc;
	protected JuriResultType result;

	@Inject
	IActiveObjectService activeObjectService;

	protected Text td11;
	protected Text td12;
	protected Text td21;
	protected Text td22;
	protected Text te11;
	protected Text te12;
	protected Text te21;
	protected Text te22;
	protected Text tp1;
	protected Text tp2;
	protected Text ts;

	protected WritableValue<Double> wd11 = new WritableValue<Double>();
	protected WritableValue<Double> wd12 = new WritableValue<Double>();
	protected WritableValue<Double> wd21 = new WritableValue<Double>();
	protected WritableValue<Double> wd22 = new WritableValue<Double>();
	protected WritableValue<Double> we11 = new WritableValue<Double>();
	protected WritableValue<Double> we12 = new WritableValue<Double>();
	protected WritableValue<Double> we21 = new WritableValue<Double>();
	protected WritableValue<Double> we22 = new WritableValue<Double>();
	protected WritableValue<Double> wp1 = new WritableValue<Double>();
	protected WritableValue<Double> wp2 = new WritableValue<Double>();
	protected WritableValue<Double> ws = new WritableValue<Double>();

	ArrayList<DetailEntry> values = new ArrayList<DetailEntry>();

}