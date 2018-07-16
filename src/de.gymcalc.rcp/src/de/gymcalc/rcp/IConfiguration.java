/*
 * adapted from org.gastro.rcp, an example of cdo distribution
 */
package de.gymcalc.rcp;

/**
 */
public interface IConfiguration {
	public static final IConfiguration INSTANCE = de.gymcalc.internal.rcp.Configuration.INSTANCE;

	public String getServer();

	public String getRepository();

	public String getContest();

}
