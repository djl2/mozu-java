/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.installedapplications;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomFunction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected String applicationKey;

	public String getApplicationKey() {
		return this.applicationKey;
	}

	public void setApplicationKey(String applicationKey) {
		this.applicationKey = applicationKey;
	}

	protected String customFunctionName;

	public String getCustomFunctionName() {
		return this.customFunctionName;
	}

	public void setCustomFunctionName(String customFunctionName) {
		this.customFunctionName = customFunctionName;
	}

	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	protected com.fasterxml.jackson.databind.JsonNode configuration;

	public com.fasterxml.jackson.databind.JsonNode getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(com.fasterxml.jackson.databind.JsonNode configuration) {
		this.configuration = configuration;
	}

}
