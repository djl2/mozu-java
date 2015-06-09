/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
import java.util.concurrent.CountDownLatch;

/** <summary>
 * Tenant administrators can add and view internal notes for a customer account. For example, a client can track a shopper's interests or complaints. Only clients can add and view notes. Shoppers cannot view these notes from the My Account page.
 * </summary>
 */
public class CustomerNoteResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerNoteResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the contents of a particular note attached to a specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.getAccountNote( accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote getAccountNote(Integer accountId, Integer noteId) throws Exception
	{
		return getAccountNote( accountId,  noteId,  null);
	}

	/**
	 * Retrieves the contents of a particular note attached to a specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNote( accountId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch getAccountNoteAsync(Integer accountId, Integer noteId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return getAccountNoteAsync( accountId,  noteId,  null, callback);
	}

	/**
	 * Retrieves the contents of a particular note attached to a specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.getAccountNote( accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote getAccountNote(Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNoteClient( accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the contents of a particular note attached to a specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNote( accountId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch getAccountNoteAsync(Integer accountId, Integer noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNoteClient( accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.getAccountNotes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId) throws Exception
	{
		return getAccountNotes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNotes( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public CountDownLatch getAccountNotesAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNoteCollection> callback) throws Exception
	{
		return getAccountNotesAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNoteCollection customerNoteCollection = customernote.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public com.mozu.api.contracts.customer.CustomerNoteCollection getAccountNotes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.getAccountNotes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerNoteCollection
	 * @see com.mozu.api.contracts.customer.CustomerNoteCollection
	 */
	public CountDownLatch getAccountNotesAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNoteCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNoteCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.getAccountNotesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Adds a new note to the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote addAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId) throws Exception
	{
		return addAccountNote( note,  accountId,  null);
	}

	/**
	 * Adds a new note to the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.addAccountNote( note,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch addAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return addAccountNoteAsync( note,  accountId,  null, callback);
	}

	/**
	 * Adds a new note to the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.addAccountNote( note,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote addAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.addAccountNoteClient( note,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Adds a new note to the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.addAccountNote( note,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch addAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.addAccountNoteClient( note,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Modifies an existing note for a customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote updateAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId) throws Exception
	{
		return updateAccountNote( note,  accountId,  noteId,  null);
	}

	/**
	 * Modifies an existing note for a customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.updateAccountNote( note,  accountId,  noteId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch updateAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		return updateAccountNoteAsync( note,  accountId,  noteId,  null, callback);
	}

	/**
	 * Modifies an existing note for a customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CustomerNote customerNote = customernote.updateAccountNote( note,  accountId,  noteId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public com.mozu.api.contracts.customer.CustomerNote updateAccountNote(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.updateAccountNoteClient( note,  accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies an existing note for a customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	CountDownLatch latch = customernote.updateAccountNote( note,  accountId,  noteId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param note Properties of a note configured for a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 * @see com.mozu.api.contracts.customer.CustomerNote
	 */
	public CountDownLatch updateAccountNoteAsync(com.mozu.api.contracts.customer.CustomerNote note, Integer accountId, Integer noteId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerNote> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerNote> client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.updateAccountNoteClient( note,  accountId,  noteId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Removes a note from the specified customer account.
	 * <p><pre><code>
	 *	CustomerNote customernote = new CustomerNote();
	 *	customernote.deleteAccountNote( accountId,  noteId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param noteId Unique identifier of a particular note to retrieve.
	 * @return 
	 */
	public void deleteAccountNote(Integer accountId, Integer noteId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerNoteClient.deleteAccountNoteClient( accountId,  noteId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



