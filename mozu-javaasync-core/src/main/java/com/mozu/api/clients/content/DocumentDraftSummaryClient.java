/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

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
 * Use the document publishing subresource to manage and publish document drafts in the Content service.
 * </summary>
 */
public class DocumentDraftSummaryClient {
	
	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=ListDocumentDraftSummariesClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> listDocumentDraftSummariesClient() throws Exception
	{
		return listDocumentDraftSummariesClient( null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=ListDocumentDraftSummariesClient( pageSize,  startIndex,  documentLists,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> listDocumentDraftSummariesClient(Integer pageSize, Integer startIndex, String documentLists, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.listDocumentDraftSummariesUrl(documentLists, pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient = (MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentDraftsClient( documentIds);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteDocumentDraftsClient(List<String> documentIds) throws Exception
	{
		return deleteDocumentDraftsClient( documentIds,  null);
	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentDraftsClient( documentIds,  documentLists);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteDocumentDraftsClient(List<String> documentIds, String documentLists) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.deleteDocumentDraftsUrl(documentLists);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentIds);
		return mozuClient;

	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDocumentsClient( documentIds);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient publishDocumentsClient(List<String> documentIds) throws Exception
	{
		return publishDocumentsClient( documentIds,  null);
	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDocumentsClient( documentIds,  documentLists);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient publishDocumentsClient(List<String> documentIds, String documentLists) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.publishDocumentsUrl(documentLists);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentIds);
		return mozuClient;

	}

}



