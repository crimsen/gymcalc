
package de.gymcalc.rcp.juriclient.parts;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.conversion.NumberToStringConverter;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.AverageFunctionType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.FunctionType;
import de.gymcalc.contest.JuriResultDetailType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.util.ContestUtil;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;
import de.gymcalc.rcp.IContestService;

public class ResultView {

	@PostConstruct
	public void createComposite(Composite parent) {
		FormToolkit tk = new FormToolkit(parent.getDisplay());
		ScrolledForm f = tk.createScrolledForm(parent);
		Form form = f.getForm();
		tk.decorateFormHeading(form);
		form.setText("Wertung");
		Composite formBody = form.getBody();
		// the heading of the table
		tk.createLabel(formBody,"");
		resultColumn1.th = tk.createLabel(formBody, "");
		resultColumn2.th = tk.createLabel(formBody, "");
		tk.createLabel(formBody, "D1", SWT.RIGHT);
		resultColumn1.td1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.td1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "D2", SWT.RIGHT);
		resultColumn1.td2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.td2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E1", SWT.RIGHT);
		resultColumn1.te1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E2", SWT.RIGHT);
		resultColumn1.te2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "Penalty", SWT.RIGHT);
		resultColumn1.tp = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.tp = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		Control seperator = tk.createSeparator(formBody, SWT.NONE);
		GridDataFactory.fillDefaults().span(3, 0).applyTo(seperator);

		tk.createLabel(formBody, "Gesamt", SWT.RIGHT);
		resultColumn1.ts = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.ts = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);

		seperator = tk.createSeparator(formBody, SWT.NONE);
		GridDataFactory.fillDefaults().span(3, 0).applyTo(seperator);

		tk.createLabel(formBody, "Mittelwert", SWT.RIGHT);
		ta = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody,"");

		Button commitButton = tk.createButton(formBody, "Veröffentlichen", SWT.PUSH);
		
		commitButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				writeDataToAthlet();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
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

	protected class ResultColumn {
		protected class DetailEntry {
			protected DetailEntry(String aKey, WritableValue<Double> aValue, boolean available) {
				key = aKey;
				value = aValue;
				isAvailable = available;
			}

			protected String key; // the key in juridetail
			protected WritableValue<Double> value; // the value that corresponds to the key
			protected boolean isAvailable; // marker if the key is available in the orgination details
		}

		protected void bindData( ) {
			values.add(new DetailEntry("D", wd1, true));
//			values.add(new DetailEntry("D2", wd2, true));
			values.add(new DetailEntry("E", we1, true));
//			values.add(new DetailEntry("E2", we2, true));
			values.add(new DetailEntry("P", wp, true));
			dbc.bindValue(wh, WidgetProperties.text().observe(th));
			bindDouble2String(dbc, wd1, WidgetProperties.text(SWT.Modify).observe(td1));
			bindDouble2String(dbc, wd2, WidgetProperties.text(SWT.Modify).observe(td2));
			bindDouble2String(dbc, we1, WidgetProperties.text(SWT.Modify).observe(te1));
			bindDouble2String(dbc, we2, WidgetProperties.text(SWT.Modify).observe(te2));
			bindDouble2String(dbc, wp, WidgetProperties.text(SWT.Modify).observe(tp));
			bindDouble2String(dbc, ws, WidgetProperties.text(SWT.Modify).observe(ts));
		}
		protected void updateDataFromResult(JuriResultType result) {
			this.result = result;
			if (null == result) {
				wh.setValue("");
				wd1.setValue(Double.NaN);
				wd2.setValue(Double.NaN);
				we1.setValue(Double.NaN);
				we2.setValue(Double.NaN);
				wp.setValue(Double.NaN);
				ws.setValue(Double.NaN);
				th.setEnabled(false);
				td1.setEnabled(false);
				td2.setEnabled(false);
				te1.setEnabled(false);
				te2.setEnabled(false);
				tp.setEnabled(false);
				ts.setEnabled(false);
			} else {
				wh.setValue(result.getDiszipline().getName());
				ws.setValue(result.getValue());
				ArrayList<String> keysSet = new ArrayList<String>();
				int emptyIdx = 0;
				for (JuriResultDetailType d : result.getJuriResultDetail()) {
					String key = d.getKey();
					DetailEntry de = null;
					// if the key is empty, then the corresponding detailentry is taken
					if( null == key || key.isEmpty()) {
						if( values.size() > emptyIdx ) {
							de = values.get(emptyIdx);
							emptyIdx++;
						}
					} else {
						for (DetailEntry e : values) {
							if (key.equals(e.key)) {
								de = e;
								break;
							}
						}
					}
					if (null != de) {
						de.value.setValue(d.getValue());
						keysSet.add(de.key);
					}
				}
				// set all values that are not in detials to NAN
				for (DetailEntry e : values) {
					if (!keysSet.contains(e.key)) {
						e.value.setValue(Double.NaN);
					}
				}
				th.setEnabled(true);
				td1.setEnabled(true);
				td2.setEnabled(true);
				te1.setEnabled(true);
				te2.setEnabled(true);
				tp.setEnabled(true);
				ts.setEnabled(true);
			}
		}
		protected void writeDataToResult() { 
			if( null != result) {
				result.setValue(ws.getValue());
				ArrayList<JuriResultDetailType> addList = new ArrayList<JuriResultDetailType>();
				ArrayList<String> keysSet = new ArrayList<String>();
				for (DetailEntry e : values) {
					JuriResultDetailType detail = null;
					for (JuriResultDetailType d : result.getJuriResultDetail()) {
						String key = d.getKey();
						if (null != key && key.equals(e.key)) {
							detail = d;
							break;
						}
					}
					Double v = e.value.getValue();
					if( ! v.isNaN() ) {
						if(null==detail) {
							detail = ContestFactory.eINSTANCE.createJuriResultDetailType();
							detail.setKey(e.key);
							addList.add(detail);
						}
						detail.setValue(v);
						keysSet.add(e.key);
					}
				}
				ArrayList<JuriResultDetailType> removeList = new ArrayList<JuriResultDetailType>();
				for (JuriResultDetailType d : result.getJuriResultDetail()) {
					String key = d.getKey();
					if (null == key || !keysSet.contains(key)) {
						removeList.add( d );
					}
				}
				result.getJuriResultDetail().removeAll(removeList);
				result.getJuriResultDetail().addAll(addList);
			}
		}
		protected JuriResultType result;
		
		protected Label th;
		
		//first column
		protected Text td1;
		protected Text td2;
		protected Text te1;
		protected Text te2;
		protected Text tp;
		protected Text ts;

		protected WritableValue<String> wh = new WritableValue<String>();

		protected WritableValue<Double> wd1 = new WritableValue<Double>();
		protected WritableValue<Double> wd2 = new WritableValue<Double>();
		protected WritableValue<Double> we1 = new WritableValue<Double>();
		protected WritableValue<Double> we2 = new WritableValue<Double>();
		protected WritableValue<Double> wp = new WritableValue<Double>();
		protected WritableValue<Double> ws = new WritableValue<Double>();

		ArrayList<DetailEntry> values = new ArrayList<DetailEntry>();
	}
	protected void bindData() {
		IConverter toDoubleConverter = StringToNumberConverter.toDouble(true);
		IConverter fromDoubleConverter = NumberToStringConverter.fromDouble(true);
		toDoubleUpdateStrategy = new UpdateValueStrategy().setConverter(toDoubleConverter);
		fromDoubleUpdateStrategy = new UpdateValueStrategy().setConverter(fromDoubleConverter);
		dbc = new DataBindingContext();
		resultColumn1.bindData();
		resultColumn2.bindData();
		bindDouble2String(dbc, wa, WidgetProperties.text(SWT.Modify).observe(ta));
	}
	
	protected void bindDouble2String(DataBindingContext dbc, IObservableValue<?> doubleValue, IObservableValue<?> stringValue) {
		dbc.bindValue( doubleValue, stringValue,
				fromDoubleUpdateStrategy, toDoubleUpdateStrategy );
	}

	protected void writeDataToAthlet() {
		if( null != resultColumn1 ) {
			resultColumn1.writeDataToResult();
		}
		if( null != resultColumn2 ) {
			resultColumn2.writeDataToResult();
		}
		if( null != resultA ) {
			resultA.setValue(wa.getValue());
		}
		flushData();
	}

	protected void updateDataFromAthlet(AthletType athlet) {
		this.athlet = athlet;
		boolean resultSet = false;
		Object station = activeObjectService.getActiveObject(StationType.class);
		if (null != athlet && null != station) {
			JuriResultType rootResult = ContestUtil.findRootResult(athlet, (StationType) station);
			if( null != rootResult ) {
				FunctionType f = rootResult.getDiszipline().getCalculationFunction();
				if( null != f && f instanceof AverageFunctionType ) {
					AverageFunctionType af = ( AverageFunctionType ) f;
					resultColumn1.updateDataFromResult(ContestUtil.findJuriResult(athlet, af.getDisziplines().get(0)));
					resultColumn2.updateDataFromResult(ContestUtil.findJuriResult(athlet, af.getDisziplines().get(1)));
					resultA = rootResult;
				} else {
					resultColumn1.updateDataFromResult(rootResult);
					resultColumn2.updateDataFromResult(null);
					resultA = null;
				}
				resultSet = true;
			}
		}
		if( !resultSet ) {
			resultColumn1.updateDataFromResult(null);
			resultColumn2.updateDataFromResult(null);
			resultA = null;
		}
		if( null == resultA ) {
			wa.setValue(Double.NaN);
			ta.setEnabled(false);
		} else {
			wa.setValue(resultA.getValue());
			ta.setEnabled(true);
		}
	}
	boolean flushData() {
		boolean retVal = contestService.flushConnection();
		return retVal;
	}
	protected DataBindingContext dbc;
	protected AthletType athlet;
	protected JuriResultType resultA; // the average of jumps
	protected ResultColumn resultColumn1 = new ResultColumn();  // the first
	protected ResultColumn resultColumn2 = new ResultColumn();  // the second (jump)

	@Inject
	IActiveObjectService activeObjectService;
	@Inject
	IContestService contestService;

	UpdateValueStrategy toDoubleUpdateStrategy;
	UpdateValueStrategy fromDoubleUpdateStrategy;

	// average for jump
	protected Text ta;

	protected WritableValue<Double> wa = new WritableValue<Double>();

}