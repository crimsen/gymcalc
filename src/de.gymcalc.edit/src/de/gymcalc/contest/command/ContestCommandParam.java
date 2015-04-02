package de.gymcalc.contest.command;

import java.util.Date;

public class ContestCommandParam extends CommandParam {

	public void setName(String name) {
		this.put("name", name);
	}
	public String getName( )
	{
		String retVal = null;
		Object res = this.get("name");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
	public void setFirstname(String firstname) {
		this.put("firstname", firstname);
	}
	public String getFirstname( )
	{
		String retVal = null;
		Object res = this.get("firstname");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
	public void setDateOfBirth( Date date ) {
		this.put("dateofbirth", date);
	}
	public Object getDateOfBirth( )
	{
		Object retVal = null;
		Object res = this.get("dateofbirth");
		if( null != res ) {
			retVal = res;
		}
		return retVal;
	}
	public void setTeam(String name) {
		this.put("team", name);
	}
	public String getTeam( )
	{
		String retVal = null;
		Object res = this.get("team");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
	public void setOrganization(String name) {
		this.put("organization", name);
	}
	public String getOrganization( )
	{
		String retVal = null;
		Object res = this.get("organization");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
	public void setJuri(String name) {
		this.put("juri", name);
	}
	public String getJuri( )
	{
		String retVal = null;
		Object res = this.get("juri");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
	public void setClass_(String name) {
		this.put("class", name);
	}
	public String getClass_( )
	{
		String retVal = null;
		Object res = this.get("class");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}
}
