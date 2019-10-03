package templates;

import de.gymcalc.contest.*;
import de.gymcalc.server.internal.web.*;

public class ClassResultTemplate
{
  protected static String nl;
  public static synchronized ClassResultTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ClassResultTemplate result = new ClassResultTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<html>" + NL + "  <header>" + NL + "\t  <title>" + NL + "\t\t\t";
  protected final String TEXT_3 = NL + "\t  </title>" + NL + "\t<header>" + NL + "<body>" + NL + "" + NL + "<h1>";
  protected final String TEXT_4 = "</h1>" + NL + "<table border=\"0\" width=\"400\">";
  protected final String TEXT_5 = NL + "\t<tr><td colspan=\"3\"><h2>";
  protected final String TEXT_6 = "</h2></td></tr>";
  protected final String TEXT_7 = NL + "</table>" + NL + "" + NL + "</body>" + NL + "</html>";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     ClassType class_ = (ClassType)argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(GymCalcServlet.html(class_.getName()));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(GymCalcServlet.html(class_.getName()));
    stringBuffer.append(TEXT_4);
    for (WinnerType winner : class_.getWinner()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(GymCalcServlet.html(winner.getName()));
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
