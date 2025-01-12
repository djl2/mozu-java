/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

import com.mozu.api.ApiContext;
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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the document lists resource to organize your site's documents into a hierarchy. Document lists can contain documents, folders, and complete hierarchies of folders, which contain documents with unique names.
 * </summary>
 */
public class DocumentListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentListResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.getDocumentLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists() throws Exception
	{
		return getDocumentLists( null,  null,  null);
	}

	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.getDocumentLists( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public CountDownLatch getDocumentListsAsync( AsyncCallback<com.mozu.api.contracts.content.DocumentListCollection> callback) throws Exception
	{
		return getDocumentListsAsync( null,  null,  null, callback);
	}

	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentListCollection documentListCollection = documentlist.getDocumentLists( pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public com.mozu.api.contracts.content.DocumentListCollection getDocumentLists(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentListCollection> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListsClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a collection of document lists.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.getDocumentLists( pageSize,  startIndex,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentListCollection
	 * @see com.mozu.api.contracts.content.DocumentListCollection
	 */
	public CountDownLatch getDocumentListsAsync(Integer pageSize, Integer startIndex, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentListCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentListCollection> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListsClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.getDocumentList( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList getDocumentList(String documentListName) throws Exception
	{
		return getDocumentList( documentListName,  null);
	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.getDocumentList( documentListName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch getDocumentListAsync(String documentListName, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		return getDocumentListAsync( documentListName,  null, callback);
	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.getDocumentList( documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList getDocumentList(String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListClient(_dataViewMode,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the details of a document list by providing the list name.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.getDocumentList( documentListName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch getDocumentListAsync(String documentListName, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.getDocumentListClient(_dataViewMode,  documentListName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new documentList
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.createDocumentList( list);
	 * </code></pre></p>
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList createDocumentList(com.mozu.api.contracts.content.DocumentList list) throws Exception
	{
		return createDocumentList( list,  null);
	}

	/**
	 * Creates a new documentList
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.createDocumentList( list, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch createDocumentListAsync(com.mozu.api.contracts.content.DocumentList list, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		return createDocumentListAsync( list,  null, callback);
	}

	/**
	 * Creates a new documentList
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.createDocumentList( list,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList createDocumentList(com.mozu.api.contracts.content.DocumentList list, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.createDocumentListClient(_dataViewMode,  list,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new documentList
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.createDocumentList( list,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch createDocumentListAsync(com.mozu.api.contracts.content.DocumentList list, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.createDocumentListClient(_dataViewMode,  list,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates a `DocumentListName`.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.updateDocumentList( list,  documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList updateDocumentList(com.mozu.api.contracts.content.DocumentList list, String documentListName) throws Exception
	{
		return updateDocumentList( list,  documentListName,  null);
	}

	/**
	 * Updates a `DocumentListName`.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.updateDocumentList( list,  documentListName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param  callback callback handler for asynchronous operations
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch updateDocumentListAsync(com.mozu.api.contracts.content.DocumentList list, String documentListName, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		return updateDocumentListAsync( list,  documentListName,  null, callback);
	}

	/**
	 * Updates a `DocumentListName`.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	DocumentList documentList = documentlist.updateDocumentList( list,  documentListName,  responseFields);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public com.mozu.api.contracts.content.DocumentList updateDocumentList(com.mozu.api.contracts.content.DocumentList list, String documentListName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.updateDocumentListClient( list,  documentListName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a `DocumentListName`.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	CountDownLatch latch = documentlist.updateDocumentList( list,  documentListName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param list The list of document types and related properties that define content used by the content management system (CMS).
	 * @return com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 * @see com.mozu.api.contracts.content.DocumentList
	 */
	public CountDownLatch updateDocumentListAsync(com.mozu.api.contracts.content.DocumentList list, String documentListName, String responseFields, AsyncCallback<com.mozu.api.contracts.content.DocumentList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentList> client = com.mozu.api.clients.content.DocumentListClient.updateDocumentListClient( list,  documentListName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the specified `DocumentListName`.
	 * <p><pre><code>
	 *	DocumentList documentlist = new DocumentList();
	 *	documentlist.deleteDocumentList( documentListName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @return 
	 */
	public void deleteDocumentList(String documentListName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.content.DocumentListClient.deleteDocumentListClient( documentListName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



