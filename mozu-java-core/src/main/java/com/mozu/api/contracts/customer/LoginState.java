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
 *	Properties of the login state of a customer account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginState implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Date and time when the entity was created, represented in UTC Date/Time.
	 */
	protected DateTime createdOn;

	public DateTime getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * The total number of times the customer account has unsuccessfully attempted to log in.
	 */
	protected Byte failedLoginAttemptCount;

	public Byte getFailedLoginAttemptCount() {
		return this.failedLoginAttemptCount;
	}

	public void setFailedLoginAttemptCount(Byte failedLoginAttemptCount) {
		this.failedLoginAttemptCount = failedLoginAttemptCount;
	}

	/**
	 * The date and time the customer's first unsuccessful attempt to log in was recorded.
	 */
	protected DateTime firstFailedLoginAttemptOn;

	public DateTime getFirstFailedLoginAttemptOn() {
		return this.firstFailedLoginAttemptOn;
	}

	public void setFirstFailedLoginAttemptOn(DateTime firstFailedLoginAttemptOn) {
		this.firstFailedLoginAttemptOn = firstFailedLoginAttemptOn;
	}

	/**
	 * If true, the customer account is locked and the customer cannot log in.
	 */
	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * If true, the customer account user must change the password for the account.
	 */
	protected Boolean isPasswordChangeRequired;

	public Boolean getIsPasswordChangeRequired() {
		return this.isPasswordChangeRequired;
	}

	public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
		this.isPasswordChangeRequired = isPasswordChangeRequired;
	}

	/**
	 * The date and time the customer account was most recently locked.
	 */
	protected DateTime lastLockedOn;

	public DateTime getLastLockedOn() {
		return this.lastLockedOn;
	}

	public void setLastLockedOn(DateTime lastLockedOn) {
		this.lastLockedOn = lastLockedOn;
	}

	/**
	 * The date and time the customer account last logged in.
	 */
	protected DateTime lastLoginOn;

	public DateTime getLastLoginOn() {
		return this.lastLoginOn;
	}

	public void setLastLoginOn(DateTime lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	/**
	 * The date and the time the user associated with the customer account last changed the account password.
	 */
	protected DateTime lastPasswordChangeOn;

	public DateTime getLastPasswordChangeOn() {
		return this.lastPasswordChangeOn;
	}

	public void setLastPasswordChangeOn(DateTime lastPasswordChangeOn) {
		this.lastPasswordChangeOn = lastPasswordChangeOn;
	}

	/**
	 * The remaining number of login attempts the customer can perform before the system locks the customer account.
	 */
	protected Integer remainingLoginAttempts;

	public Integer getRemainingLoginAttempts() {
		return this.remainingLoginAttempts;
	}

	public void setRemainingLoginAttempts(Integer remainingLoginAttempts) {
		this.remainingLoginAttempts = remainingLoginAttempts;
	}

	/**
	 * Date and time when the entity was last updated, represented in UTC Date/Time.
	 */
	protected DateTime updatedOn;

	public DateTime getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(DateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

}
