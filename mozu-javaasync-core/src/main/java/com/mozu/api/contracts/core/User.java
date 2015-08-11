/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.UserRole;
import com.mozu.api.contracts.core.UserSystemData;

/**
 *	Properties of the user. Users include customers and Mozu users.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The email address of the specified user or the email address associated with the specified entity.
	 */
	protected String emailAddress;

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * The first name of the contact. The maximum character length is 200.
	 */
	protected String firstName;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Indicates if the object or feature is active. This indicator is used for subscriptions (at the site or tenant level), customer accounts, products and variations.
	 */
	protected Boolean isActive;

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * The last name or surname of the contact. The maximum character length is 200.
	 */
	protected String lastName;

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
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
	 * Collection of roles assigned to the user.
	 */
	protected List<UserRole> roles;
	public List<UserRole> getRoles() {
		return this.roles;
	}
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	/**
	 * Collection of system-supplied data about the user.
	 */
	protected UserSystemData systemData;

	public UserSystemData getSystemData() {
		return this.systemData;
	}

	public void setSystemData(UserSystemData systemData) {
		this.systemData = systemData;
	}

}