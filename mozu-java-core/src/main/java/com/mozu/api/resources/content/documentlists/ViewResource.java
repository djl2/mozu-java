/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

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
 * Properties and content for views within a site/tenant. Views provide the schema, formatting, and associated content and entities for displaying content within a site/tenant.
 * </summary>
 */
public class ViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a collection of documents associated with a view.
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName) throws Exception
	{
		return getViewDocuments( documentListName,  viewName,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a collection of documents associated with a view.
	 * <p><pre><code>
	 *	View view = new View();
	 *	DocumentCollection documentCollection = view.getViewDocuments( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 * @param viewName The name for a view. Views are used to render data in Mozu, such as document and entity lists. Each view includes a schema, format, name, ID, and associated data types to render.
	 * @return com.mozu.api.contracts.content.DocumentCollection
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public com.mozu.api.contracts.content.DocumentCollection getViewDocuments(String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> client = com.mozu.api.clients.content.documentlists.ViewClient.getViewDocumentsClient( documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



