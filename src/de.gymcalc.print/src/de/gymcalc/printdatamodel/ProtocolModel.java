package de.gymcalc.printdatamodel;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.WinnerType;

public class ProtocolModel {
	public static String modelName = "http://www.gymcalc.de/ProtocolModel";
	
	public ProtocolModel( ) {
		options = new DialogSettings( "" );
		options.put("additionalWinnerPerClass", 0);
		options.put("maximumRank", -1);
		options.put("useEmptyWinnerClasses", false);
		options.put("firstNameFirst", false);
	}
	public ProtocolModel( DialogSettings options ) {
		this.options = options;
	}
	public Object getSelectedModel( Object src, IStructuredSelection selection,
			AdapterFactory adapter ) {
		Object retVal = null;
		setSelection( selection );
		retVal = getModel(src, adapter);
		return retVal;
	}
	
	public void setSelection( IStructuredSelection selection ) {
		this.selected = new ArrayList<Object>();
		if( null != selection ) {
			Collection<Object> s = selection.toList();
			for( Object i : s ) {
				if( i instanceof ContestType || 
						i instanceof ClassType ||
						i instanceof WinnerType ||
						i instanceof JuriType ||
						i instanceof JuristType ) {
					this.selected.add( i );
				}
			}
		}
	}
	
	public Object getModel( Object src, AdapterFactory factory ) {
		/*
		 * taken from calcreportexportwizard
		 * might also be juryformexportwizard
		 * contest
		 * +-class? useEmptyWinnerClasses
		 *   +-name
		 *   +-diszipline[]
		 *   +-winner? .Result.Rank <= maximumRank ? additionalWinner[PerClass]
		 *     +-name ?firstNameFirst : (AthletType)winner.person.{first,}name : winner.name
		 *     +-disable
		 *     +-class
		 *     +-team
		 *     +-organization? useOrganization
		 *     +-rank? fillRankAndPoints
		 *     +-points? fillRankAndPoints
		 *     +-diszipline[]? fillRankAndPoints
		 * +-jury[]
		 *   +-name
		 *   +-jurist[]
		 *     +-name
		 *     +-organization? useOrganization
		 *     
		 */
		Map<String, Object> retVal = null;
		if (src instanceof ContestType) {
			int additionalRows = options.getInt( "additionalWinnerPerClass" );
			int maxRank = options.getInt( "maximumRank" );
			ContestType contestSrc = (ContestType) src;
			retVal = new HashMap<String, Object>();
			Map<String, Object> contest = new HashMap<String, Object>();
			retVal.put("contest", contest);
			contest.put("name", contestSrc.getName());
			String sdate = getDate( contestSrc.getDate() );
			contest.put("date", sdate );
			List<Object> classes = new ArrayList<Object>();
			contest.put("class", classes);
			List<ClassType> classesSrc = contestSrc.getClass_();
		
			for (Iterator<ClassType> iClass = classesSrc.iterator( ); iClass.hasNext ();) {
				ClassType classSrc = iClass.next ();
				if( isSelected( classSrc ) ) {
					EList<WinnerType> winnersSrc = classSrc.getWinner ();
					if( options.getBoolean( "useEmptyWinnerClasses" ) ||
							0 != winnersSrc.size( ) ) {
						Map<String, Object> class_ = new HashMap<String, Object>();
						classes.add( class_ );
						String name = classSrc.getName ();
						if( null == name ) {
							name = "";
						}
						class_.put( "name", name );
						List<Object> disziplines = new ArrayList<Object>( );
						class_.put( "diszipline", disziplines );
						Object content = factory.adapt (classSrc, ITreeItemContentProvider.class);
						int maxColumn = 0;
						if (content instanceof ITableItemLabelProvider) {
							ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) content;
							for (int column = 4; ; ++column) {
								String label = labelProvider.getColumnText (classSrc, column);
								if (0 == label.length ()) {
									maxColumn = column;
									break;
								}
								disziplines.add(label);
							}
						}					
						List<Object> winners = new ArrayList<Object>();
						class_.put( "winner", winners );
						for( Iterator<WinnerType> iWinner = winnersSrc.iterator (); iWinner.hasNext (); ){
							WinnerType winnerSrc = iWinner.next ();
							if( isSelected( winnerSrc ) ) {
								if( 0 <= maxRank && null != winnerSrc.getResult() ) {
									// for diplomas only the first maxWinners have to be printed.
									// maxWinner < 0 is invalid
									int rank = winnerSrc.getResult().getRank();
									if( rank > maxRank ) {
										break;
									}
								}
								Map<String, Object> winner = new HashMap<String, Object>();
								winners.add( winner );
								String disable = winnerSrc.getDisable ();
								if (null == disable) {
									disable = "";
								}
								winner.put( "disable", disable );
								String winnerName = "";
								if( options.getBoolean( "firstNameFirst" ) && 
										winnerSrc instanceof AthletType ) {
									winnerName = ( ( AthletType )winnerSrc ).getPerson().getFirstname() + " " + ( ( AthletType )winnerSrc ).getPerson().getName(); 
								} else {
									winnerName = winnerSrc.getName ();
								}
								winner.put( "name", winnerName );
								if( winnerSrc instanceof AthletType ) {
									winner.put( "date_of_birth", getDate( ( ( AthletType )winnerSrc ).getPerson().getDateofbirth() ) );
								} else {
									winner.put( "date_of_birth", "" );
								}
								String organizationName = "";
								if ( null != winnerSrc.getOrganization()) {
									organizationName = winnerSrc.getOrganization().getName ();
								}
								winner.put( "organization", organizationName );
								winner.put( "team", getTeamName( winnerSrc ) );
								if( null == winnerSrc.getResult() ) {
									winner.put( "rank", "");
									winner.put("points", "" );
									List<String> winnerDiszipline = new ArrayList<String>();
									winner.put("diszipline", winnerDiszipline);
								} else {
									Object elementAdapter = factory.adapt(winnerSrc, ITableItemLabelProvider.class);
									if (elementAdapter instanceof ITableItemLabelProvider) {
										ITableItemLabelProvider labelProvider = (ITableItemLabelProvider) elementAdapter;
										winner.put( "rank", labelProvider.getColumnText(winnerSrc, 2) );
										winner.put( "points", labelProvider.getColumnText(winnerSrc, 3) );
										List<String> winnerDiszipline = new ArrayList<String>();
										winner.put("diszipline", winnerDiszipline);
										for (int column = 4; maxColumn > column; ++column) {
											String label = labelProvider.getColumnText( winnerSrc, column );
											winnerDiszipline.add( label );
										}
									}
								}
							}
						}
						for( int i = 0; additionalRows > i; ++i ){
							Map<String, Object> winner = new HashMap<String, Object>();
							winners.add( winner );
							winner.put( "disable", false );
							winner.put( "name", "" );
							winner.put( "organization", "" );
							winner.put( "rank", "");
							winner.put("points", "" );
							List<String > winnerDiszipline = new ArrayList<String>();
							winner.put("diszipline", winnerDiszipline);
						}
					}
				}
			}
			List<Object> jurys = new ArrayList<Object>();
			contest.put("jury", jurys);
			EList<JuriType> jurysSrc = contestSrc.getJuri();
			for (Iterator<JuriType> iJury = jurysSrc.iterator( ); iJury.hasNext ();) {
				JuriType jurySrc = iJury.next ();
				if( isSelected( jurySrc ) ) {
					EList<JuristType> juristsSrc = jurySrc.getJurist ();
					if( 0 != juristsSrc.size( ) ) {
						Map<String, Object> jury = new HashMap<String, Object>();
						jurys.add( jury );
						String name = jurySrc.getName ();
						if( null == name ) {
							name = "";
						}
						jury.put( "name", name );
	/*
	* 						List disziplines = new ArrayList( );
	
						jury.put( "diszipline", disziplines );
						*/
						List< Object > jurists = new ArrayList< Object >();
						jury.put( "jurist", jurists );
						for( Iterator<JuristType> iJurist = juristsSrc.iterator (); iJurist.hasNext (); ){
							JuristType juristSrc = iJurist.next ();
							if( isSelected( juristSrc ) ) {
								Map<String, Object> jurist = new HashMap<String, Object>();
								jurists.add( jurist );
								String juristName = juristSrc.getName ();
								jurist.put( "name", juristName );
								String organizationName = "";
								if ( null != juristSrc.getOrganization()) {
									organizationName = juristSrc.getOrganization().getName ();
								}
								jurist.put( "organization", organizationName );
								jurist.put( "jury", name );
							}
						}
					}
				}
			}
		}
		return retVal;
	}
	static String getTeamName(WinnerType winnersrc) {
		String retVal = new String("");
		if( winnersrc instanceof AthletType && 
				null != ( ( AthletType ) winnersrc ).getTeam( ) ) {
			String res = ( ( AthletType )winnersrc ).getTeam( ).getName();
			if( null != res ) {
				retVal = res;
			}
		}
		return retVal;
	}
	static String getDate( Object odate ) {
		String retVal = "";
		if( odate instanceof String ) {
			retVal = ( String ) odate;
		} else if( odate instanceof Date ) {
			DateFormat f = DateFormat.getDateInstance();
			retVal = f.format( (Date) odate );
		} else if( null != odate ) {
			retVal = odate.toString();
		}
		return retVal;
	}

	private boolean isSelected( EObject o ) {
		boolean retVal = selected.isEmpty();
		while( !retVal ) {
			if( selected.contains( o ) ) {
				retVal = true;
			}
			if( null == o.eContainer() ) {
				break;
			}
			o = o.eContainer();
		}
		return retVal;
	}
	private Collection<Object> selected;
	private DialogSettings options;
}
