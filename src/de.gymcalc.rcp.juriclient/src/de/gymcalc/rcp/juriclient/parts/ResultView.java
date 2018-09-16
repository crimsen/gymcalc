
package de.gymcalc.rcp.juriclient.parts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.conversion.NumberToStringConverter;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
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
		tk.createLabel(formBody, "D", SWT.RIGHT);
		resultColumn1.td1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.td1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E1", SWT.RIGHT);
		resultColumn1.te1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te1 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E2", SWT.RIGHT);
		resultColumn1.te2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E3", SWT.RIGHT);
		resultColumn1.te3 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te3 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E4", SWT.RIGHT);
		resultColumn1.te4 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.te4 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		tk.createLabel(formBody, "E", SWT.RIGHT);
		resultColumn1.td2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
		resultColumn2.td2 = tk.createText(formBody, "", SWT.BORDER | SWT.RIGHT);
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

		Button commitButton = tk.createButton(formBody, "Daten übertragen", SWT.PUSH|SWT.CENTER);
		GridDataFactory.fillDefaults().span(3, 0).applyTo(commitButton);
		
		commitButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				writeDataToAthlet();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		formBody.setTabList(new Control[] {
				resultColumn1.td1,
				resultColumn1.te1,
				resultColumn1.te2,
				resultColumn1.te3,
				resultColumn1.te4,
				resultColumn1.td2,
				resultColumn1.tp,
				resultColumn1.ts,
				resultColumn2.td1,
				resultColumn2.te1,
				resultColumn2.te2,
				resultColumn2.te3,
				resultColumn2.te4,
				resultColumn2.td2,
				resultColumn2.tp,
				resultColumn2.ts,
				ta,
				commitButton
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
			protected DetailEntry(int aSetOrder, String aKey, WritableValue<Double> aValue, boolean available) {
				setOrder = aSetOrder;
				key = aKey;
				value = aValue;
				isAvailable = available;
			}

			// values have to be set in the correct order because some are calculated from other values
			// when calculated values are loaded then they must not be overwritten be the calculation, 
			// so these values have to be set after the source values of the calculation
			// example: e1 and e2 calculates d2, when d2 is loaded then it has to be set after e1, e2 and the calculation 
			protected int setOrder;
			protected String key; // the key in juridetail
			protected WritableValue<Double> value; // the value that corresponds to the key
			protected boolean isAvailable; // marker if the key is available in the orgination details
		}
		protected class SetValue {
			protected SetValue( WritableValue<Double> awValue, Double aValue ) {
				wValue = awValue;
				value = aValue;
			}
			protected WritableValue<Double> wValue;
			protected Double value;
		}

		protected ResultColumn( ) {
			wh.setValue("");
			wd1.setValue(Double.NaN);
			wd2.setValue(Double.NaN);
			we1.setValue(Double.NaN);
			we2.setValue(Double.NaN);
			we3.setValue(Double.NaN);
			we4.setValue(Double.NaN);
			wp.setValue(Double.NaN);
			ws.setValue(Double.NaN);
		}
		protected void bindData( ) {
			values.add(new DetailEntry(5, "D", wd1, true));
			values.add(new DetailEntry(4, "E", wd2, true));
			values.add(new DetailEntry(6, "P", wp, true));
			values.add(new DetailEntry(0, ".E1", we1, true));
			values.add(new DetailEntry(1, ".E2", we2, true));
			values.add(new DetailEntry(2, ".E3", we3, true));
			values.add(new DetailEntry(3, ".E4", we4, true));
			dbc.bindValue(WidgetProperties.text().observe(th), wh);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(td1), wd1);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(td2), wd2);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(te1), we1);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(te2), we2);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(te3), we3);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(te4), we4);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(tp), wp);
			bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(ts), ws);
			
			IChangeListener summaryCalculation = new IChangeListener( ) {
				@Override
				public void handleChange(ChangeEvent event) {
					calcSummary();
				}
			};
			wd1.addChangeListener(summaryCalculation);
			wd2.addChangeListener(summaryCalculation);
			wp.addChangeListener(summaryCalculation);

			IChangeListener averageCalculation = new IChangeListener( ) {
				@Override
				public void handleChange(ChangeEvent event) {
					calcAverageOfExecution();
				}
			};
			we1.addChangeListener(averageCalculation);
			we2.addChangeListener(averageCalculation);
			we3.addChangeListener(averageCalculation);
			we4.addChangeListener(averageCalculation);
		}
		protected void updateDataFromResult(JuriResultType result) {
			this.result = result;
			if (null == result) {
				// assure the correct sequence
				// e1 and e2 sets d2, so d2 has to be set after e1 and e2
				// d1, d2 and p sets s so s has to be set after d1, d2 and p
				wh.setValue("");
				we1.setValue(Double.NaN);
				we2.setValue(Double.NaN);
				we3.setValue(Double.NaN);
				we4.setValue(Double.NaN);
				wd1.setValue(Double.NaN);
				wd2.setValue(Double.NaN);
				wp.setValue(Double.NaN);
				ws.setValue(Double.NaN);
				th.setEnabled(false);
				td1.setEnabled(false);
				td2.setEnabled(false);
				te1.setEnabled(false);
				te2.setEnabled(false);
				te3.setEnabled(false);
				te4.setEnabled(false);
				tp.setEnabled(false);
				ts.setEnabled(false);
			} else {
				wh.setValue(result.getDiszipline().getName());
				SetValue[] orderedSetValues = new SetValue[values.size()];
				for( DetailEntry e : values) {
					orderedSetValues[e.setOrder] = new SetValue( e.value, Double.NaN);
				}
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
						orderedSetValues[de.setOrder].value = d.getValue();
					}
				}
				// finally set all the values in the correct order
				for( SetValue s:orderedSetValues) {
					s.wValue.setValue(s.value);
				}
				ws.setValue(result.getValue());
				th.setEnabled(true);
				td1.setEnabled(true);
				td2.setEnabled(true);
				te1.setEnabled(true);
				te2.setEnabled(true);
				te3.setEnabled(true);
				te4.setEnabled(true);
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
		protected void calcSummary() {
			Double summary = 0.0;
			int count = 0;
			Double val = getDoubleFromWritable( wd1 );
			if( !val.isNaN() ) {
				summary +=val;
				count++;
			}
			val = getDoubleFromWritable( wd2 );
			if( !val.isNaN() ) {
				summary +=val;
				count++;
			}
			val = getDoubleFromWritable( wp );
			if( !val.isNaN() ) {
				summary +=val;
				count++;
			}
			if( 0 < count ) {
				ws.setValue( Math.round( summary * 10000 ) / 10000.0 );
			}
		}
		protected void calcAverageOfExecution() {
			ArrayList<WritableValue<Double>> a = new ArrayList<WritableValue<Double>>();
			a.add(we1);
			a.add(we2);
			a.add(we3);
			a.add(we4);
			Double average = calcAverage(a);
			if( !average.isNaN() ) {
				wd2.setValue(average);
			}
		}
		protected JuriResultType result;
		
		protected Label th;
		
		//first column
		protected Text td1;
		protected Text td2;
		protected Text te1;
		protected Text te2;
		protected Text te3;
		protected Text te4;
		protected Text tp;
		protected Text ts;

		protected WritableValue<String> wh = new WritableValue<String>();

		protected WritableValue<Double> wd1 = new WritableValue<Double>();
		protected WritableValue<Double> wd2 = new WritableValue<Double>();
		protected WritableValue<Double> we1 = new WritableValue<Double>();
		protected WritableValue<Double> we2 = new WritableValue<Double>();
		protected WritableValue<Double> we3 = new WritableValue<Double>();
		protected WritableValue<Double> we4 = new WritableValue<Double>();
		protected WritableValue<Double> wp = new WritableValue<Double>();
		protected WritableValue<Double> ws = new WritableValue<Double>();

		ArrayList<DetailEntry> values = new ArrayList<DetailEntry>();
	}
	protected static Double calcAverage(Collection<WritableValue<Double>> wValues) {
		Double retVal = Double.NaN;
		ArrayList<Double> values = new ArrayList<Double>();
		Double average = 0.0;
		for( WritableValue<Double> wVal : wValues) {
			Double val = getDoubleFromWritable( wVal );
			if( !val.isNaN()  && 0.0 < val ) {
				// take only valid values
				values.add(val);
			}
		}
		switch( values.size() ) {
		case 4:	{
				Collections.sort(values);
				average = ( values.get(1) + values.get(2) ) / 2;
			}
			break;
		case 3:	{
			/* rule for 3 jurists is quite complicated:
			 * take the 2 results with the minimum difference
			 * if the differences are equal, take the middle value
			 */
				Collections.sort(values);
				double diff1 = Math.round( ( values.get(1) - values.get(0) ) * 1000000 ) / 1000000.0;
				double diff3 = Math.round( ( values.get(2) - values.get(1) ) * 1000000 ) / 1000000.0;
				int compare = Double.compare( diff1, diff3 );
				if( 0 < compare  ) {
					average = ( values.get( 1 ) + values.get( 2 ) ) / 2;
				} else if( 0 > compare ) {
					average = ( values.get( 0 ) + values.get( 1 ) ) / 2;
				} else {
					average = values.get(1);
				}
			}
			break;
		case 2:	{
				average = ( values.get(0) + values.get(1) ) / 2;
			}
			break;
		case 1:
			{
				average = values.get(0);
			}
			break;
		}
		retVal = average;
		retVal = Math.round( retVal * 10000 ) / 10000.0;
		return retVal;
	}
	protected static Double getDoubleFromWritable(WritableValue<Double> wVal) {
		Double retVal = Double.NaN;
		Object val = wVal.getValue();
		if( val instanceof Double ) {
			retVal = ( Double )val;
		}
		return retVal;
	}
	protected void bindData() {
		wa.setValue(Double.NaN);
		IConverter toDoubleConverter = StringToNumberConverter.toDouble(true);
		IConverter fromDoubleConverter = NumberToStringConverter.fromDouble(true);
		toDoubleUpdateStrategy = new UpdateValueStrategy().setConverter(toDoubleConverter);
		fromDoubleUpdateStrategy = new UpdateValueStrategy().setConverter(fromDoubleConverter);
		dbc = new DataBindingContext();
		resultColumn1.bindData();
		resultColumn2.bindData();
		bindString2Double(dbc, WidgetProperties.text(SWT.Modify).observe(ta), wa);
		IChangeListener averageCalculation = new IChangeListener( ) {
			@Override
			public void handleChange(ChangeEvent event) {
				calcAverageOfSummary();
			}
		};
		resultColumn1.ws.addChangeListener(averageCalculation);
		resultColumn2.ws.addChangeListener(averageCalculation);
	}
	
	protected void bindString2Double(DataBindingContext dbc, IObservableValue<?> stringValue, IObservableValue<?> doubleValue ) {
		dbc.bindValue( stringValue, doubleValue, 
				toDoubleUpdateStrategy, fromDoubleUpdateStrategy );
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
	protected void calcAverageOfSummary() {
		if( null != resultA ) {
			ArrayList<WritableValue<Double>> a = new ArrayList<WritableValue<Double>>();
			a.add(resultColumn1.ws);
			a.add(resultColumn2.ws);
			Double average = calcAverage(a);
			if( !average.isNaN() ) {
				wa.setValue(average);
			}
		}
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