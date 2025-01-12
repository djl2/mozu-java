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
 * Use the tenants resource to manage information about a Mozu tenant.
 * </summary>
 */
public class TenantResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TenantResource() 
		{
			_apiContext = null;
	}
public TenantResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve details about a specific tenant by providing the tenant ID.
	 * <p><pre><code>
	 *	Tenant tenant = new Tenant();
	 *	Tenant tenant = tenant.getTenant( tenantId);
	 * </code></pre></p>
	 * @param tenantId Unique identifier of the Mozu tenant.
	 * @return com.mozu.api.contracts.tenant.Tenant
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public com.mozu.api.contracts.tenant.Tenant getTenant(Integer tenantId) throws Exception
	{
		return getTenant( tenantId,  null);
	}

	/**
	 * Retrieve details about a specific tenant by providing the tenant ID.
	 * <p><pre><code>
	 *	Tenant tenant = new Tenant();
	 *	Tenant tenant = tenant.getTenant( tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId Unique identifier of the Mozu tenant.
	 * @return com.mozu.api.contracts.tenant.Tenant
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public com.mozu.api.contracts.tenant.Tenant getTenant(Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.tenant.Tenant> client = com.mozu.api.clients.platform.TenantClient.getTenantClient( tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



