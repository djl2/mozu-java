/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeSearchSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Boolean searchableInAdmin;

	public Boolean getSearchableInAdmin() {
		return this.searchableInAdmin;
	}

	public void setSearchableInAdmin(Boolean searchableInAdmin) {
		this.searchableInAdmin = searchableInAdmin;
	}

	protected Boolean searchableInStorefront;

	public Boolean getSearchableInStorefront() {
		return this.searchableInStorefront;
	}

	public void setSearchableInStorefront(Boolean searchableInStorefront) {
		this.searchableInStorefront = searchableInStorefront;
	}

	protected Boolean searchDisplayValue;

	public Boolean getSearchDisplayValue() {
		return this.searchDisplayValue;
	}

	public void setSearchDisplayValue(Boolean searchDisplayValue) {
		this.searchDisplayValue = searchDisplayValue;
	}

}
