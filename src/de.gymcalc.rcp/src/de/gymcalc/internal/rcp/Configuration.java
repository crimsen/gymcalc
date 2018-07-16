/*
 * adapted from org.gastro.rcp, an example of cdo distribution
 */
package de.gymcalc.internal.rcp;

import de.gymcalc.rcp.IConfiguration;

import java.util.Properties;

/**
 */
public class Configuration implements IConfiguration {
	public static final Configuration INSTANCE = new Configuration();

	private Properties properties;

	private Configuration() {
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getServer() {
		return properties.getProperty("server");
	}

	public String getRepository() {
		return properties.getProperty("repository");
	}

	public String getContest() {
		return properties.getProperty("contest");
	}

}
