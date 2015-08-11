/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the tenants resource to manage information about a Mozu tenant.
 * </summary>
 */
public class TenantClient {
	
	/**
	 * Retrieve details about a specific tenant by providing the tenant ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.Tenant> mozuClient=GetTenantClient( tenantId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Tenant tenant = client.Result();
	 * </code></pre></p>
	 * @param tenantId Unique identifier of the Mozu tenant.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.Tenant>
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.Tenant> getTenantClient(Integer tenantId) throws Exception
	{
		return getTenantClient( tenantId,  null);
	}

	/**
	 * Retrieve details about a specific tenant by providing the tenant ID.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.tenant.Tenant> mozuClient=GetTenantClient( tenantId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Tenant tenant = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId Unique identifier of the Mozu tenant.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.tenant.Tenant>
	 * @see com.mozu.api.contracts.tenant.Tenant
	 */
	public static MozuClient<com.mozu.api.contracts.tenant.Tenant> getTenantClient(Integer tenantId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.TenantUrl.getTenantUrl(responseFields, tenantId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.tenant.Tenant.class;
		MozuClient<com.mozu.api.contracts.tenant.Tenant> mozuClient = (MozuClient<com.mozu.api.contracts.tenant.Tenant>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}


