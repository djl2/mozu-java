/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.platform.developer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ApplicationUrl
{

	/**
	 * Get Resource Url for GetAllApplications
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAllApplicationsUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackageItemMetadata
	 * @param applicationId 
	 * @param itempath Complete file directory location and name of the item in the package to retrieve metadata.
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageItemMetadataUrl(Integer applicationId, String itempath, Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files/?itemPath={itempath}&responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("itempath", itempath);
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackageItemsMetadata
	 * @param applicationId 
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageItemsMetadataUrl(Integer applicationId, Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files?responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackageFilesZip
	 * @param applicationId 
	 * @param packageId The unique identifier of the package to zip.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageFilesZipUrl(Integer applicationId, Integer packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/zip");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("packageId", packageId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackage
	 * @param packageId Unique identifier of the package to retrieve.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageUrl(Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}?responseFields={responseFields}");
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetPackages
	 * @param applicationId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackagesUrl(Integer applicationId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages?responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for GetApplication
	 * @param applicationId Unique identifier of the application.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getApplicationUrl(Integer applicationId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}?responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for ChangePackageFileNameOrPath
	 * @param applicationId 
	 * @param packageId The unique identifier of the development or release package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl changePackageFileNameOrPathUrl(Integer applicationId, Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files/change-name-or-path?responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for AddPackageFile
	 * @param applicationId 
	 * @param filepath The file location to which to add the package file.
	 * @param packageId Unique identifier of the package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addPackageFileUrl(Integer applicationId, String filepath, Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files?filePath={filepath}&responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("filepath", filepath);
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for AddPackage
	 * @param applicationId 
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addPackageUrl(Integer applicationId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages?responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePackageFile
	 * @param applicationId 
	 * @param filepath The location path and name that identifies the package file to update.
	 * @param packageId The unique identifier of the package.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePackageFileUrl(Integer applicationId, String filepath, Integer packageId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files?filePath={filepath}&responseFields={responseFields}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("filepath", filepath);
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

	/**
	 * Get Resource Url for DeletePackageFile
	 * @param applicationId 
	 * @param filepath The file path and name of the file location to delete from the package.
	 * @param packageId Unique identifier of the package.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePackageFileUrl(Integer applicationId, String filepath, Integer packageId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/platform/developer/applications/{applicationId}/packages/{packageId}/files?filePath={filepath}");
		formatter.formatUrl("applicationId", applicationId);
		formatter.formatUrl("filepath", filepath);
		formatter.formatUrl("packageId", packageId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.HOME_POD) ;
	}

}

