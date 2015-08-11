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
import com.mozu.api.contracts.core.UserScope;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Properties of a role assigned to a user for a defined scope.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRole implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the user role.
	 */
	protected Integer roleId;

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * The name of the user role, such as "developer" or "administrator".
	 */
	protected String roleName;

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Properties of the developer account or Mozu tenant associated with the user role.
	 */
	protected UserScope assignedInScope;

	public UserScope getAssignedInScope() {
		return this.assignedInScope;
	}

	public void setAssignedInScope(UserScope assignedInScope) {
		this.assignedInScope = assignedInScope;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}