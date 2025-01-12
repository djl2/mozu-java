/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders.attributedefinition;

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
 * Use the Order Attribute Definition resource to manage the attributes that uniquely describe orders, such as the associated shopping season or "How did you hear about us?" information. Merchants can display order attributes on the order summary, the order confirmation page, invoices, or packing slips.
 * </summary>
 */
public class AttributeClient {
	
	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient() throws Exception
	{
		return getAttributesClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient=GetAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeCollection attributeCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.AttributeCollection>
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> getAttributesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.AttributeCollection.class;
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Returns the list of vocabulary values defined for the order attribute specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> mozuClient=GetAttributeVocabularyValuesClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> getAttributeVocabularyValuesClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> mozuClient = (MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeClient(String attributeFQN) throws Exception
	{
		return getAttributeClient( attributeFQN,  null);
	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient=GetAttributeClient( attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Attribute attribute = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.core.extensible.Attribute>
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public static MozuClient<com.mozu.api.contracts.core.extensible.Attribute> getAttributeClient(String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.attributedefinition.AttributeUrl.getAttributeUrl(attributeFQN, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.core.extensible.Attribute.class;
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> mozuClient = (MozuClient<com.mozu.api.contracts.core.extensible.Attribute>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



