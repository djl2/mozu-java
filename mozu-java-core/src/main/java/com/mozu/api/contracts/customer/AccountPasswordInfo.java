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
import com.mozu.api.contracts.customer.PasswordInfo;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountPasswordInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer accountId;

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	protected Boolean unlockAccount;

	public Boolean getUnlockAccount() {
		return this.unlockAccount;
	}

	public void setUnlockAccount(Boolean unlockAccount) {
		this.unlockAccount = unlockAccount;
	}

	protected PasswordInfo passwordInfo;

	public PasswordInfo getPasswordInfo() {
		return this.passwordInfo;
	}

	public void setPasswordInfo(PasswordInfo passwordInfo) {
		this.passwordInfo = passwordInfo;
	}

}
