/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	System-supplied and read-only information about the user.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSystemData implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of login attempts remaining for the customer. The user must login successfully before this value reaches zero otherwise the account locks.
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
	 * The total number of failed authentication attempts associated with a customer account attempting access.
	 */
	protected Byte failedLoginAttemptCount;

	public Byte getFailedLoginAttemptCount() {
		return this.failedLoginAttemptCount;
	}

	public void setFailedLoginAttemptCount(Byte failedLoginAttemptCount) {
		this.failedLoginAttemptCount = failedLoginAttemptCount;
	}

	/**
	 * The date and time the initial login was unsuccessful. System-supplied and read only. Each time user authentication fails, an update occurs on this field. The amount of failures is calculated together for `failedLoginAttemptCount`.
	 */
	protected DateTime firstFailedLoginAttemptOn;

	public DateTime getFirstFailedLoginAttemptOn() {
		return this.firstFailedLoginAttemptOn;
	}

	public void setFirstFailedLoginAttemptOn(DateTime firstFailedLoginAttemptOn) {
		this.firstFailedLoginAttemptOn = firstFailedLoginAttemptOn;
	}

	/**
	 * Indicates if a customer account and associated data is locked. If true, the user account is locked due to multiple failed authentication attempts. The user cannot login until the account is unlocked.
	 */
	protected Boolean isLocked;

	public Boolean getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * Indicates if the customer account must have the password changed on login. If true, the login action requires a password change for increased security. If false, the login does not require a password change.
	 */
	protected Boolean isPasswordChangeRequired;

	public Boolean getIsPasswordChangeRequired() {
		return this.isPasswordChangeRequired;
	}

	public void setIsPasswordChangeRequired(Boolean isPasswordChangeRequired) {
		this.isPasswordChangeRequired = isPasswordChangeRequired;
	}

	/**
	 * Provides date and time data when the customer's account was last locked. System-supplied and read-only.
	 */
	protected DateTime lastLockedOn;

	public DateTime getLastLockedOn() {
		return this.lastLockedOn;
	}

	public void setLastLockedOn(DateTime lastLockedOn) {
		this.lastLockedOn = lastLockedOn;
	}

	/**
	 * Provides the date and time the customer last logged into the store. System-supplied and read-only.
	 */
	protected DateTime lastLoginOn;

	public DateTime getLastLoginOn() {
		return this.lastLoginOn;
	}

	public void setLastLoginOn(DateTime lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	/**
	 * Date and time the customer's password was last modified. System-supplied and read-only.
	 */
	protected DateTime lastPasswordChangeOn;

	public DateTime getLastPasswordChangeOn() {
		return this.lastPasswordChangeOn;
	}

	public void setLastPasswordChangeOn(DateTime lastPasswordChangeOn) {
		this.lastPasswordChangeOn = lastPasswordChangeOn;
	}

}
