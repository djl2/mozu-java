/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Properties of a fulfillment contact for the shipping origin address associated with a location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingOriginContact implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The legal or doing business as (DBA) or tradestyle name of the business or organization. The maximum character length is 200.
	 */
	protected String companyOrOrganization;

	public String getCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization = companyOrOrganization;
	}

	/**
	 * The email address of the specified user or the email address associated with the specified entity.
	 */
	protected String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * The first name of the shipping origin contact.
	 */
	protected String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The last name of the shipping origin contact.
	 */
	protected String lastNameOrSurname;

	public String getLastNameOrSurname() {
		return this.lastNameOrSurname;
	}

	public void setLastNameOrSurname(String lastNameOrSurname) {
		this.lastNameOrSurname = lastNameOrSurname;
	}

	/**
	 * The middle name or middle initial of the shipping origin contact.
	 */
	protected String middleNameOrInitial;

	public String getMiddleNameOrInitial() {
		return this.middleNameOrInitial;
	}

	public void setMiddleNameOrInitial(String middleNameOrInitial) {
		this.middleNameOrInitial = middleNameOrInitial;
	}

	/**
	 * Collection of phone numbers associated with the shipping origin contact.
	 */
	protected String phoneNumber;

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
