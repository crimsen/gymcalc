package de.gymcalc.contest.command;


public class EnterJuristCommandParam extends ContestCommandParam {

	public void setLicense(String license) {
		this.put("license", license);		
	}

	public String getLicense() {
		String retVal = null;
		Object res = this.get("license");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}

	public void setWishApparatus(String wishApparatus) {
		this.put("wishApparatus", wishApparatus);		
	}

	public String getWishApparatus() {
		String retVal = null;
		Object res = this.get("wishApparatus");
		if( null != res && res instanceof String ) {
			retVal = ( String ) res;
		}
		return retVal;
	}

}
