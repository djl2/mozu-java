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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Vocabulary values are predefined for an attribute.
 * </summary>
 */
public class AttributeVocabularyValueClient {
	
	/**
	 * Retrieves a list of vocabulary values defined for the attribute specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient=GetAttributeVocabularyValuesClient( attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> getAttributeVocabularyValuesClient(String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a collection of localized content for vocabulary value attributes based on a `localeCode`. 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> mozuClient=GetAttributeVocabularyValueLocalizedContentsClient( attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> getAttributeVocabularyValueLocalizedContentsClient(String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValueLocalizedContentsUrl(attributeFQN, value);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the localized content for a vocabulary value attribute based on a `localeCode`. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=GetAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContentClient(String attributeFQN, String value, String localeCode) throws Exception
	{
		return getAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * Retrieves the localized content for a vocabulary value attribute based on a `localeCode`. 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=GetAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> getAttributeVocabularyValueLocalizedContentClient(String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValueLocalizedContentUrl(attributeFQN, localeCode, responseFields, value);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a vocabulary value defined for an attribute by providing the attribute's fully qualified name and the value to retrieve.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=GetAttributeVocabularyValueClient( attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValueClient(String attributeFQN, String value) throws Exception
	{
		return getAttributeVocabularyValueClient( attributeFQN,  value,  null);
	}

	/**
	 * Retrieves the details of a vocabulary value defined for an attribute by providing the attribute's fully qualified name and the value to retrieve.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=GetAttributeVocabularyValueClient( attributeFQN,  value,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValueClient(String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValueUrl(attributeFQN, responseFields, value);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates and saves localized vocabulary value content for an attribute, based on the `localeCode`.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=AddAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> addAttributeVocabularyValueLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value) throws Exception
	{
		return addAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  null);
	}

	/**
	 * Creates and saves localized vocabulary value content for an attribute, based on the `localeCode`.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=AddAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> addAttributeVocabularyValueLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.addAttributeVocabularyValueLocalizedContentUrl(attributeFQN, responseFields, value);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * Creates a vocabulary value for a defined product attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=AddAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> addAttributeVocabularyValueClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN) throws Exception
	{
		return addAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  null);
	}

	/**
	 * Creates a vocabulary value for a defined product attribute.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=AddAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> addAttributeVocabularyValueClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.addAttributeVocabularyValueUrl(attributeFQN, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeVocabularyValue);
		return mozuClient;

	}

	/**
	 * Update existing vocabulary values for an attribute.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient=UpdateAttributeVocabularyValuesClient( vocabularyValues,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param vocabularyValues Properties of a vocabulary value defined for an extensible attribute.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> updateAttributeVocabularyValuesClient(List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> vocabularyValues, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(vocabularyValues);
		return mozuClient;

	}

	/**
	 * Updates a collection of localized vocabulary value content for existing attributes, based on the `localeCode`.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> mozuClient=UpdateAttributeVocabularyValueLocalizedContentsClient( localizedContent,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> updateAttributeVocabularyValueLocalizedContentsClient(List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> localizedContent, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValueLocalizedContentsUrl(attributeFQN, value);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * Updates localized vocabulary value content for an existing attribute, based on the `localeCode`.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=UpdateAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode) throws Exception
	{
		return updateAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * Updates localized vocabulary value content for an existing attribute, based on the `localeCode`.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient=UpdateAttributeVocabularyValueLocalizedContentClient( localizedContent,  attributeFQN,  value,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode The two character country code that sets the locale, such as US for United States. Sites, tenants, and catalogs use locale codes for localizing content, such as translated product text per supported country.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param localizedContent The localized text for the string value of a product attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> updateAttributeVocabularyValueLocalizedContentClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent localizedContent, String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValueLocalizedContentUrl(attributeFQN, localeCode, responseFields, value);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		return mozuClient;

	}

	/**
	 * Updates existing attribute vocabulary values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=UpdateAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValueClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value) throws Exception
	{
		return updateAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  value,  null);
	}

	/**
	 * Updates existing attribute vocabulary values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=UpdateAttributeVocabularyValueClient( attributeVocabularyValue,  attributeFQN,  value,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue Properties of a vocabulary value defined for an extensible attribute.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValueClient(com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValueUrl(attributeFQN, responseFields, value);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeVocabularyValue);
		return mozuClient;

	}

	/**
	 * Deletes an attribute's vocabulary value.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAttributeVocabularyValueClient( attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAttributeVocabularyValueClient(String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.deleteAttributeVocabularyValueUrl(attributeFQN, value);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Removes localized content for a vocabulary value attribute. 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAttributeVocabularyValueLocalizedContentClient( attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param value The value string to create.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAttributeVocabularyValueLocalizedContentClient(String attributeFQN, String value, String localeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.deleteAttributeVocabularyValueLocalizedContentUrl(attributeFQN, localeCode, value);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



