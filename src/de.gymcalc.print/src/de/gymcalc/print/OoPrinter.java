// taken from: http://api.libreoffice.org/examples/java/DocumentHandling/

package de.gymcalc.print;

//import com.sun.star.uno.UnoRuntime;

public class OoPrinter {
	public static void print(String document, String printer, String pages) {

		//seems not to work, eclipse does always throw class not found com.sun.star.comp.helper.Bootstrap
		// did not find a way to solve this, might be
		// http://cgit.freedesktop.org/libreoffice/contrib/ooeclipse/
		// can help
/*
 * 		com.sun.star.uno.XComponentContext xContext = null;
 
        try {
            // get the remote office component context
            xContext = com.sun.star.comp.helper.Bootstrap.bootstrap();
            System.out.println("Connected to a running office ...");

            // get the remote office service manager
            com.sun.star.lang.XMultiComponentFactory xMCF =
                xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                "com.sun.star.frame.Desktop", xContext);

            com.sun.star.frame.XComponentLoader xCompLoader =
                UnoRuntime.queryInterface(
                 com.sun.star.frame.XComponentLoader.class, oDesktop);

            java.io.File sourceFile = new java.io.File(document);
            StringBuffer sUrl = new StringBuffer("file:///");
            sUrl.append(sourceFile.getCanonicalPath().replace('\\', '/'));

            // Load a Writer document, which will be automaticly displayed
            com.sun.star.lang.XComponent xComp = xCompLoader.loadComponentFromURL(
                sUrl.toString(), "_blank", 0,
                new com.sun.star.beans.PropertyValue[0] );

            // Querying for the interface XPrintable on the loaded document
            com.sun.star.view.XPrintable xPrintable =
                UnoRuntime.queryInterface(
                com.sun.star.view.XPrintable.class, xComp);

            // Setting the property "Name" for the favoured printer (name of
            // IP address)
            com.sun.star.beans.PropertyValue propertyValue[] =
                new com.sun.star.beans.PropertyValue[1];
            propertyValue[0] = new com.sun.star.beans.PropertyValue();
            propertyValue[0].Name = "Name";
            propertyValue[0].Value = args[ 0 ];

            // Setting the name of the printer
            xPrintable.setPrinter( propertyValue );

            // Setting the property "Pages" so that only the desired pages
            // will be printed.
            propertyValue[0] = new com.sun.star.beans.PropertyValue();
            propertyValue[0].Name = "Pages";
            propertyValue[0].Value = args[ 2 ];

            // Printing the loaded document
            xPrintable.print( propertyValue );

            System.exit(0);
        }
        catch( Exception e ) {
            e.printStackTrace(System.err);
            System.exit(1);
        }
        */
   }

}
