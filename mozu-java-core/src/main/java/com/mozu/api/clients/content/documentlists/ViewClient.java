/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content.documentlists;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * 
 * </summary>
 */
public class ViewClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetViewDocumentsClient(dataViewMode,  documentListName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getViewDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String viewName) throws Exception
	{
		return getViewDocumentsClient(dataViewMode,  documentListName,  viewName,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient=GetViewDocumentsClient(dataViewMode,  documentListName,  viewName,  filter,  sortBy,  pageSize,  startIndex,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentCollection documentCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentCollection>
	 * @see com.mozu.api.contracts.content.DocumentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentCollection> getViewDocumentsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String viewName, String filter, String sortBy, Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.ViewUrl.getViewDocumentsUrl(documentListName, filter, pageSize, responseFields, sortBy, startIndex, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.View> mozuClient=GetDocumentListViewClient(dataViewMode,  documentListName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * View view = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.View>
	 * @see com.mozu.api.contracts.content.View
	 */
	public static MozuClient<com.mozu.api.contracts.content.View> getDocumentListViewClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String viewName) throws Exception
	{
		return getDocumentListViewClient(dataViewMode,  documentListName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.View> mozuClient=GetDocumentListViewClient(dataViewMode,  documentListName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * View view = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.View>
	 * @see com.mozu.api.contracts.content.View
	 */
	public static MozuClient<com.mozu.api.contracts.content.View> getDocumentListViewClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.ViewUrl.getDocumentListViewUrl(documentListName, responseFields, viewName);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.View.class;
		MozuClient<com.mozu.api.contracts.content.View> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.ViewCollection> mozuClient=GetDocumentListViewsClient(dataViewMode,  documentListName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ViewCollection viewCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.ViewCollection>
	 * @see com.mozu.api.contracts.content.ViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.ViewCollection> getDocumentListViewsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName) throws Exception
	{
		return getDocumentListViewsClient(dataViewMode,  documentListName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.ViewCollection> mozuClient=GetDocumentListViewsClient(dataViewMode,  documentListName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ViewCollection viewCollection = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.ViewCollection>
	 * @see com.mozu.api.contracts.content.ViewCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.ViewCollection> getDocumentListViewsClient(com.mozu.api.DataViewMode dataViewMode, String documentListName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.ViewUrl.getDocumentListViewsUrl(documentListName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.ViewCollection.class;
		MozuClient<com.mozu.api.contracts.content.ViewCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.View> mozuClient=UpdateDocumentListViewClient( documentListName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * View view = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.View>
	 * @see com.mozu.api.contracts.content.View
	 */
	public static MozuClient<com.mozu.api.contracts.content.View> updateDocumentListViewClient(String documentListName, String viewName) throws Exception
	{
		return updateDocumentListViewClient( documentListName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.View> mozuClient=UpdateDocumentListViewClient( documentListName,  viewName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * View view = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param responseFields 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.View>
	 * @see com.mozu.api.contracts.content.View
	 */
	public static MozuClient<com.mozu.api.contracts.content.View> updateDocumentListViewClient(String documentListName, String viewName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.ViewUrl.updateDocumentListViewUrl(documentListName, responseFields, viewName);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.content.View.class;
		MozuClient<com.mozu.api.contracts.content.View> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.View> mozuClient=DeleteDocumentListViewClient( documentListName,  viewName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * View view = client.Result();
	 * </code></pre></p>
	 * @param documentListName 
	 * @param viewName 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.View>
	 * @see com.mozu.api.contracts.content.View
	 */
	public static MozuClient<com.mozu.api.contracts.content.View> deleteDocumentListViewClient(String documentListName, String viewName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.documentlists.ViewUrl.deleteDocumentListViewUrl(documentListName, viewName);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.content.View.class;
		MozuClient<com.mozu.api.contracts.content.View> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



