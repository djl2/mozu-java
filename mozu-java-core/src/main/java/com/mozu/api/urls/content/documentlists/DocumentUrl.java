/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content.documentlists;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class DocumentUrl
{

	/**
	 * Get Resource Url for GetDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentUrl(String documentId, String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}?responseFields={responseFields}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetDocuments
	 * @param documentListName Name of content documentListName to delete
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getDocumentsUrl(String documentListName, String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents?filter={filter}&sortBy={sortBy}&pageSize={pageSize}&startIndex={startIndex}&responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateDocument
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createDocumentUrl(String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents?responseFields={responseFields}");
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateDocumentUrl(String documentId, String documentListName, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}?responseFields={responseFields}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocument
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentContent
	 * @param documentId Unique identifier for a document, used by content and document calls. Document IDs are associated with document types, document type lists, sites, and tenants.
	 * @param documentListName Name of content documentListName to delete
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentContentUrl(String documentId, String documentListName)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentlists/{documentListName}/documents/{documentId}/content");
		formatter.formatUrl("documentId", documentId);
		formatter.formatUrl("documentListName", documentListName);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

