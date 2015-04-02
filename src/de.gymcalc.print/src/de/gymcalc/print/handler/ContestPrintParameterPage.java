package de.gymcalc.print.handler;

import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import de.gymcalc.print.Activator;

public class ContestPrintParameterPage extends WizardPageWithOptions implements Listener  {

	// useEmptyWinnerClasses:Boolean
	// firstNameFirst:Boolean		
	Button fillRankAndPoints;
	Button useOrganization;
	Button provideAdditionalRows;
	Button useEmptyWinnerClasses;
	Button firstNameFirst;
	Text additionalWinnerPerClass;
	Text maximumRank;
	Text additionalWinner;
	
	public ContestPrintParameterPage(String pageName, DialogSettings options) {
		super(pageName);
		this.dialogOptions = options;
	}

	public void createControl(Composite parent) {
        initializeDialogUnits(parent);
        Composite topLevel = new Composite(parent, SWT.NONE);
        topLevel.setLayout(new GridLayout());
        topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                | GridData.HORIZONTAL_ALIGN_FILL));
/*
* 	        fillRankAndPoints = new Button(topLevel, SWT.CHECK);
	        fillRankAndPoints.setText( Activator.getString( "fillRankAndPoints" ) );
        fillRankAndPoints.setSelection(true);
        useOrganization = new Button(topLevel, SWT.CHECK);
        useOrganization.setText( Activator.getString( "useOrganization" ) );
        useOrganization.setSelection(true);
        this.provideAdditionalRows = new Button(topLevel, SWT.CHECK);
        this.provideAdditionalRows.setText( Activator.getString( "provideAdditionalRows" ) );
        this.provideAdditionalRows.setSelection(false);
*/
        this.useEmptyWinnerClasses = new Button(topLevel, SWT.CHECK);
        this.useEmptyWinnerClasses.setText( Activator.getString( "useEmptyWinnerClasses" ) );
        this.useEmptyWinnerClasses.setSelection(false);
        this.firstNameFirst = new Button(topLevel, SWT.CHECK);
        this.firstNameFirst.setText( Activator.getString( "firstNameFirst" ) );
        this.firstNameFirst.setSelection(false);

        Composite textLevel = new Composite(topLevel, SWT.NONE);
        textLevel.setLayout( new GridLayout( 2, false) );
        textLevel.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
        
        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "additionalWinner" ) );
        this.additionalWinner = new Text( textLevel, SWT.SINGLE );
        this.additionalWinner.setText( "0" );
        this.additionalWinner.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "additionalWinnerPerClass" ) );
        this.additionalWinnerPerClass = new Text( textLevel, SWT.SINGLE );
        this.additionalWinnerPerClass.setText( "0" );
        this.additionalWinnerPerClass.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );
        new Label( textLevel, SWT.NONE ).setText( Activator.getString( "maximumRank" ) );
        this.maximumRank = new Text( textLevel, SWT.SINGLE );
        this.maximumRank.setText( "-1" );
        this.maximumRank.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ) );

        setControl (topLevel);
        updatePage( dialogOptions );
	}

	/**
	 * The <code>WizardNewFileCreationPage</code> implementation of this
	 * <code>Listener</code> method handles all events and enablements for
	 * controls on this page. Subclasses may extend.
	 */
	public void handleEvent(Event event) {
		setPageComplete(validatePage());
	}

	public boolean validatePage() {
		boolean retVal = true;
		updateOptions( dialogOptions );
		return retVal;
	}

	public boolean updateOptions( DialogSettings options )
	{
		boolean retVal = true;
		options.put( "useEmptyWinnerClasses", this.useEmptyWinnerClasses.getSelection() );
		options.put( "firstNameFirst", this.firstNameFirst.getSelection() );
		options.put( "additionalWinner", Integer.valueOf( this.additionalWinner.getText( ) ).intValue() );
		options.put( "additionalWinnerPerClass", Integer.valueOf( this.additionalWinnerPerClass.getText( ) ).intValue() );
		options.put( "maximumRank", Integer.valueOf( this.maximumRank.getText( ) ).intValue() );
		return retVal;
	}
	public void updatePage( DialogSettings options )
	{
		if( null != this.getControl() ) {
			this.useEmptyWinnerClasses.setSelection( options.getBoolean( "useEmptyWinnerClasses" ) );
			this.firstNameFirst.setSelection( options.getBoolean( "firstNameFirst" ) );
			this.additionalWinner.setText( Integer.toString( options.getInt( "additionalWinner" ) ) );
			this.additionalWinnerPerClass.setText( Integer.toString( options.getInt( "additionalWinnerPerClass" ) ) );
			this.maximumRank.setText( Integer.toString( options.getInt( "maximumRank" ) ) );
			this.getControl().redraw();
		}
	}
	
	private DialogSettings dialogOptions;
}
