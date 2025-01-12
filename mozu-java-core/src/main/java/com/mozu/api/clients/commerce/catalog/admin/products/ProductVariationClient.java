/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the product variations sub-resource to manage the variations of a product based on its attributes. For example, a t-shirt product could be offered in six variations: Small Black, Medium Black, Large Black, Small White, Medium White, and Large White.
 * </summary>
 */
public class ProductVariationClient {
	
	/**
	 * Retrieves a collection of the localized delta price values for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> mozuClient=GetProductVariationLocalizedDeltaPricesClient(dataViewMode,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> getProductVariationLocalizedDeltaPricesClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationLocalizedDeltaPricesUrl(productCode, variationKey);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=GetProductVariationLocalizedDeltaPriceClient(dataViewMode,  productCode,  variationKey,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode) throws Exception
	{
		return getProductVariationLocalizedDeltaPriceClient(dataViewMode,  productCode,  variationKey,  currencyCode,  null);
	}

	/**
	 * Retrieves the localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=GetProductVariationLocalizedDeltaPriceClient(dataViewMode,  productCode,  variationKey,  currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> getProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationLocalizedDeltaPriceUrl(currencyCode, productCode, responseFields, variationKey);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of a product variation based on the supplied product code and variation key.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=GetProductVariationClient(dataViewMode,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> getProductVariationClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey) throws Exception
	{
		return getProductVariationClient(dataViewMode,  productCode,  variationKey,  null);
	}

	/**
	 * Retrieves the details of a product variation based on the supplied product code and variation key.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=GetProductVariationClient(dataViewMode,  productCode,  variationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> getProductVariationClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationUrl(productCode, responseFields, variationKey);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariation>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GetProductVariationsClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> getProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		return getProductVariationsClient(dataViewMode,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the product variations configured for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient=GetProductVariationsClient(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationPagedCollection productVariationPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> getProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.getProductVariationsUrl(filter, pageSize, productCode, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Adds the localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=AddProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param localizedDeltaPrice The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> addProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey) throws Exception
	{
		return addProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  null);
	}

	/**
	 * Adds the localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=AddProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param localizedDeltaPrice The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> addProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.addProductVariationLocalizedDeltaPriceUrl(productCode, responseFields, variationKey);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates all localized delta price values for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> mozuClient=UpdateProductVariationLocalizedDeltaPricesClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param localizedDeltaPrice The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> updateProductVariationLocalizedDeltaPricesClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> localizedDeltaPrice, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationLocalizedDeltaPricesUrl(productCode, variationKey);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updatesthe localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=UpdateProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param localizedDeltaPrice The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode) throws Exception
	{
		return updateProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  null);
	}

	/**
	 * Updatesthe localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient=UpdateProductVariationLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  variationKey,  currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationDeltaPrice productVariationDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param localizedDeltaPrice The difference between the base price for the product and this variation of the product, which can be a positive or negative decimal value. For example, if the base price for a t-shirt product is $10, but the XL variation should cost $12, the DeltaPrice value should be "2". However, if the XS variation should only cost $8, the DeltaPrice value should be "-2".
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> updateProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice localizedDeltaPrice, String productCode, String variationKey, String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationLocalizedDeltaPriceUrl(currencyCode, productCode, responseFields, variationKey);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies the details of a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=UpdateProductVariationClient(dataViewMode,  productVariation,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param productVariation Properties of a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> updateProductVariationClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey) throws Exception
	{
		return updateProductVariationClient(dataViewMode,  productVariation,  productCode,  variationKey,  null);
	}

	/**
	 * Modifies the details of a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient=UpdateProductVariationClient(dataViewMode,  productVariation,  productCode,  variationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariation productVariation = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @param productVariation Properties of a specific product variation.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariation>
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 * @see com.mozu.api.contracts.productadmin.ProductVariation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> updateProductVariationClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationUrl(productCode, responseFields, variationKey);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariation> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariation>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productVariation);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Modifies the collection of variations for the specified product code. Because this PUT replaces the existing resource, supply all information necessary to maintain for the product variation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> mozuClient=UpdateProductVariationsClient(dataViewMode,  productVariations,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationCollection productVariationCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productVariations Collection of variations configured for a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> updateProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode) throws Exception
	{
		return updateProductVariationsClient(dataViewMode,  productVariations,  productCode,  null);
	}

	/**
	 * Modifies the collection of variations for the specified product code. Because this PUT replaces the existing resource, supply all information necessary to maintain for the product variation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> mozuClient=UpdateProductVariationsClient(dataViewMode,  productVariations,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductVariationCollection productVariationCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param productVariations Collection of variations configured for a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductVariationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 * @see com.mozu.api.contracts.productadmin.ProductVariationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> updateProductVariationsClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.updateProductVariationsUrl(productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductVariationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductVariationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productVariations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes a variation, based on the supplied variation key, for the specified product code.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductVariationClient(dataViewMode,  productCode,  variationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductVariationClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.deleteProductVariationUrl(productCode, variationKey);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the localized delta price value for a product variation. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductVariationLocalizedDeltaPriceClient(dataViewMode,  productCode,  variationKey,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param variationKey System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductVariationLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductVariationUrl.deleteProductVariationLocalizedDeltaPriceUrl(currencyCode, productCode, variationKey);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



