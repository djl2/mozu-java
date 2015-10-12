/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Categories resource to organize products and control where they appear on the storefront. Create and maintain a hierarchy of categories and subcategories where the site will store properties.
 * </summary>
 */
public class CategoryClient {
	
	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient() throws Exception
	{
		return getCategoriesClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of categories according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient=GetCategoriesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryPagedCollection categoryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryPagedCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> getCategoriesClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoriesUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CategoryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(Integer categoryId) throws Exception
	{
		return getChildCategoriesClient( categoryId,  null);
	}

	/**
	 * Retrieves the list of subcategories within a category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient=GetChildCategoriesClient( categoryId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CategoryCollection categoryCollection = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CategoryCollection>
	 * @see com.mozu.api.contracts.productadmin.CategoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> getChildCategoriesClient(Integer categoryId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getChildCategoriesUrl(categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CategoryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CategoryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(Integer categoryId) throws Exception
	{
		return getCategoryClient( categoryId,  null);
	}

	/**
	 * Retrieves the details of a single category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=GetCategoryClient( categoryId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> getCategoryClient(Integer categoryId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.getCategoryUrl(categoryId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient( category);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.contracts.productadmin.Category category) throws Exception
	{
		return addCategoryClient( category,  null,  null);
	}

	/**
	 * Adds a new category to the site's category hierarchy. Specify a ParentCategoryID to determine where to place the category in the hierarchy. If no ParentCategoryID is specified, the new category is a top-level category.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=AddCategoryClient( category,  incrementSequence,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param incrementSequence If true, when adding a new product category, set the sequence number of the new category to an increment of one integer greater than the maximum available sequence number across all product categories. If false, set the sequence number to zero.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> addCategoryClient(com.mozu.api.contracts.productadmin.Category category, Boolean incrementSequence, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.addCategoryUrl(incrementSequence, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		return mozuClient;

	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient( category,  categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.contracts.productadmin.Category category, Integer categoryId) throws Exception
	{
		return updateCategoryClient( category,  categoryId,  null,  null);
	}

	/**
	 * Update the properties of a defined category or move it to another location in the category hierarchy. Because this operation replaces the defined resource,include all the information to maintain for the category in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient=UpdateCategoryClient( category,  categoryId,  cascadeVisibility,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Category category = client.Result();
	 * </code></pre></p>
	 * @param cascadeVisibility If true, when changing the display option for the category, change it for all subcategories also. Default: False.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param category A descriptive container that groups products. A category is merchant defined with associated products and discounts as configured. GThe storefront displays products in a hierarchy of categories. As such, categories can include a nesting of sub-categories to organize products and product options per set guidelines such as color, brand, material, and size.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Category>
	 * @see com.mozu.api.contracts.productadmin.Category
	 * @see com.mozu.api.contracts.productadmin.Category
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Category> updateCategoryClient(com.mozu.api.contracts.productadmin.Category category, Integer categoryId, Boolean cascadeVisibility, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.updateCategoryUrl(cascadeVisibility, categoryId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.Category.class;
		MozuClient<com.mozu.api.contracts.productadmin.Category> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Category>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(category);
		return mozuClient;

	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient( categoryId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(Integer categoryId) throws Exception
	{
		return deleteCategoryByIdClient( categoryId,  null,  null,  null);
	}

	/**
	 * Deletes the category specified by its category ID.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCategoryByIdClient( categoryId,  cascadeDelete,  forceDelete,  reassignToParent);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cascadeDelete If true, also delete all subcategories associated with the specified category.
	 * @param categoryId Unique identifier of the category to modify.
	 * @param forceDelete 
	 * @param reassignToParent 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCategoryByIdClient(Integer categoryId, Boolean cascadeDelete, Boolean forceDelete, Boolean reassignToParent) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CategoryUrl.deleteCategoryByIdUrl(cascadeDelete, categoryId, forceDelete, reassignToParent);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



