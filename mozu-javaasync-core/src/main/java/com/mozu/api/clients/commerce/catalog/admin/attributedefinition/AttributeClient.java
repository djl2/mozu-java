/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition;

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
 * Use the Attribute Definition resource to manage the properties, options, and extras that uniquely describe products of a specific type. Attributes can be associated with a product type, assigned values by a client or shopper, and added as faceted search filters for a product category. Options are product attributes that describe unique configurations made by the shopper, such as size or color, and generate a new product variation (or unique SKU). Properties are product attributes that describe aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand. Extras are product attributes that describe add-on configurations made by the shopper that do not represent a product variation, such as a monogram.
 * </summary>
 */
public class AttributeClient {
	
	/**
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient=GetAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeCollection>
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> getAttributesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the specified product attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN) throws Exception
	{
		return getAttributeClient( attributeFQN,  null);
	}

	/**
	 * Retrieves the details of the specified product attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=GetAttributeClient( attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> getAttributeClient(String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.getAttributeUrl(attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		return addAttributeClient( attribute,  null);
	}

	/**
	 * Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=AddAttributeClient( attribute,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> addAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.addAttributeUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * Updates an existing attribute with attribute properties to set.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttributeClient( attribute,  attributeFQN,  null);
	}

	/**
	 * Updates an existing attribute with attribute properties to set.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient=UpdateAttributeClient( attribute,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Attribute>
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Attribute> updateAttributeClient(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.updateAttributeUrl(attributeFQN, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Attribute.class;
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attribute);
		return mozuClient;

	}

	/**
	 * Deletes a defined product attribute. You cannot delete an attribute assigned a value for a product.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAttributeClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.AttributeUrl.deleteAttributeUrl(attributeFQN);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



