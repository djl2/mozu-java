/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes;

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
 * Type rules are subresources of product attributes which could be specifications that can be shared across products in a store or assigned to specific products. Attribute type rules provide definitions of how attribute types will appear on the user interface.
 * </summary>
 */
public class AttributeTypeRuleClient {
	
	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient=GetAttributeTypeRulesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeTypeRuleCollection attributeTypeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> getAttributeTypeRulesClient() throws Exception
	{
		return getAttributeTypeRulesClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of attribute type rules according to optional filter criteria and sort options. Attribute type rules help drive the behavior of attributes on a storefront page.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient=GetAttributeTypeRulesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeTypeRuleCollection attributeTypeRuleCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> getAttributeTypeRulesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeTypeRuleUrl.getAttributeTypeRulesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeTypeRuleCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



