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

/**
 *	The login information for a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerLoginInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The email address for the customer account and contact. This email may be used for login to the storefront and for subscription mailing lists.
	 */
	protected String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	protected String externalPassword;

	public String getExternalPassword() {
		return this.externalPassword;
	}

	public void setExternalPassword(String externalPassword) {
		this.externalPassword = externalPassword;
	}

	/**
	 * Indicates if this object/data was imported from an outside source such as a data import or synchronization via an app or service. If true, this data was originally imported into Mozu and accessible through your store database. Examples of imported objects/data include orders and customer accounts.
	 */
	protected Boolean isImport;

	public Boolean getIsImport() {
		return this.isImport;
	}

	public void setIsImport(Boolean isImport) {
		this.isImport = isImport;
	}

	/**
	 * The saved password for the customer account. 
	 */
	protected String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * The user name associated with the user profile. The customer uses the user name to access the account.
	 */
	protected String username;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
