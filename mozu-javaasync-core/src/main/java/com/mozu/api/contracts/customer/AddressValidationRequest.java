/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.Address;

/**
 *	Properties of the address used for validation of the account's full address. This content may include multiple lines of an address, city, state/province, zip/postal code, and country.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressValidationRequest implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * All address information for the contact. This data is used to validate the address for the customer account and includes the full address.
	 */
	protected Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
