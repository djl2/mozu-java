/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class TenantExtensionsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TenantExtensionsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	TenantExtensions tenantextensions = new TenantExtensions();
	 *	TenantExtensions tenantExtensions = tenantextensions.getExtensions();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public com.mozu.api.contracts.installedapplications.TenantExtensions getExtensions() throws Exception
	{
		return getExtensions( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantExtensions tenantextensions = new TenantExtensions();
	 *	TenantExtensions tenantExtensions = tenantextensions.getExtensions( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public com.mozu.api.contracts.installedapplications.TenantExtensions getExtensions(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> client = com.mozu.api.clients.platform.TenantExtensionsClient.getExtensionsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantExtensions tenantextensions = new TenantExtensions();
	 *	TenantExtensions tenantExtensions = tenantextensions.updateExtensions( extensions);
	 * </code></pre></p>
	 * @param extensions 
	 * @return com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public com.mozu.api.contracts.installedapplications.TenantExtensions updateExtensions(com.mozu.api.contracts.installedapplications.TenantExtensions extensions) throws Exception
	{
		return updateExtensions( extensions,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	TenantExtensions tenantextensions = new TenantExtensions();
	 *	TenantExtensions tenantExtensions = tenantextensions.updateExtensions( extensions,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param extensions 
	 * @return com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public com.mozu.api.contracts.installedapplications.TenantExtensions updateExtensions(com.mozu.api.contracts.installedapplications.TenantExtensions extensions, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> client = com.mozu.api.clients.platform.TenantExtensionsClient.updateExtensionsClient( extensions,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



