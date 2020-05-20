/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.io.File;
import org.openapitools.client.model.InstallStatus;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CrxApi {
  String basePath = "http://localhost";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * 
   * @return String
  */
  public String getCrxdeStatus () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/crx/server/crx.default/jcr:root/.1.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 

  */
  public void getCrxdeStatus (final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/crx/server/crx.default/jcr:root/.1.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @return InstallStatus
  */
  public InstallStatus getInstallStatus () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/crx/packmgr/installstatus.jsp";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (InstallStatus) ApiInvoker.deserialize(localVarResponse, "", InstallStatus.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 

  */
  public void getInstallStatus (final Response.Listener<InstallStatus> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/crx/packmgr/installstatus.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((InstallStatus) ApiInvoker.deserialize(localVarResponse,  "", InstallStatus.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @return void
  */
  public void getPackageManagerServlet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/crx/packmgr/service/script.html";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 

  */
  public void getPackageManagerServlet (final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/crx/packmgr/service/script.html".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param cmd 
   * @return String
  */
  public String postPackageService (String cmd) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'cmd' when calling postPackageService",
        new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageService"));
    }

    // create path and map variables
    String path = "/crx/packmgr/service.jsp";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cmd", cmd));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param cmd 
  */
  public void postPackageService (String cmd, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'cmd' when calling postPackageService",
        new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageService"));
    }

    // create path and map variables
    String path = "/crx/packmgr/service.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "cmd", cmd));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param path 
   * @param cmd 
   * @param groupName 
   * @param packageName 
   * @param packageVersion 
   * @param charset 
   * @param force 
   * @param recursive 
   * @param _package 
   * @return String
  */
  public String postPackageServiceJson (String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, File _package) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'path' is set
    if (path == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'path' when calling postPackageServiceJson",
        new ApiException(400, "Missing the required parameter 'path' when calling postPackageServiceJson"));
    }
    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'cmd' when calling postPackageServiceJson",
        new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageServiceJson"));
    }

    // create path and map variables
    String path = "/crx/packmgr/service/.json/{path}".replaceAll("\\{" + "path" + "\\}", apiInvoker.escapeString(path.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cmd", cmd));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "groupName", groupName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageName", packageName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageVersion", packageVersion));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "_charset_", charset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "force", force));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "recursive", recursive));
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (_package != null) {
        localVarBuilder.addBinaryBody("package", _package);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param path    * @param cmd    * @param groupName    * @param packageName    * @param packageVersion    * @param charset    * @param force    * @param recursive    * @param _package 
  */
  public void postPackageServiceJson (String path, String cmd, String groupName, String packageName, String packageVersion, String charset, Boolean force, Boolean recursive, File _package, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'path' is set
    if (path == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'path' when calling postPackageServiceJson",
        new ApiException(400, "Missing the required parameter 'path' when calling postPackageServiceJson"));
    }
    // verify the required parameter 'cmd' is set
    if (cmd == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'cmd' when calling postPackageServiceJson",
        new ApiException(400, "Missing the required parameter 'cmd' when calling postPackageServiceJson"));
    }

    // create path and map variables
    String path = "/crx/packmgr/service/.json/{path}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "path" + "\\}", apiInvoker.escapeString(path.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "cmd", cmd));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "groupName", groupName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageName", packageName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageVersion", packageVersion));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "_charset_", charset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "force", force));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "recursive", recursive));


    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (_package != null) {
        localVarBuilder.addBinaryBody("package", _package);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param groupName 
   * @param packageName 
   * @param version 
   * @param path 
   * @param filter 
   * @param charset 
   * @return String
  */
  public String postPackageUpdate (String groupName, String packageName, String version, String path, String filter, String charset) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupName' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'groupName' when calling postPackageUpdate"));
    }
    // verify the required parameter 'packageName' is set
    if (packageName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageName' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'packageName' when calling postPackageUpdate"));
    }
    // verify the required parameter 'version' is set
    if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'version' when calling postPackageUpdate"));
    }
    // verify the required parameter 'path' is set
    if (path == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'path' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'path' when calling postPackageUpdate"));
    }

    // create path and map variables
    String path = "/crx/packmgr/update.jsp";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "groupName", groupName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageName", packageName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "version", version));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "path", path));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "_charset_", charset));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param groupName    * @param packageName    * @param version    * @param path    * @param filter    * @param charset 
  */
  public void postPackageUpdate (String groupName, String packageName, String version, String path, String filter, String charset, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'groupName' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'groupName' when calling postPackageUpdate"));
    }
    // verify the required parameter 'packageName' is set
    if (packageName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'packageName' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'packageName' when calling postPackageUpdate"));
    }
    // verify the required parameter 'version' is set
    if (version == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'version' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'version' when calling postPackageUpdate"));
    }
    // verify the required parameter 'path' is set
    if (path == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'path' when calling postPackageUpdate",
        new ApiException(400, "Missing the required parameter 'path' when calling postPackageUpdate"));
    }

    // create path and map variables
    String path = "/crx/packmgr/update.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "groupName", groupName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "packageName", packageName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "version", version));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "path", path));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "_charset_", charset));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param old 
   * @param plain 
   * @param verify 
   * @return String
  */
  public String postSetPassword (String old, String plain, String verify) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'old' is set
    if (old == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'old' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'old' when calling postSetPassword"));
    }
    // verify the required parameter 'plain' is set
    if (plain == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'plain' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'plain' when calling postSetPassword"));
    }
    // verify the required parameter 'verify' is set
    if (verify == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'verify' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'verify' when calling postSetPassword"));
    }

    // create path and map variables
    String path = "/crx/explorer/ui/setpassword.jsp";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "old", old));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plain", plain));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "verify", verify));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "aemAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param old    * @param plain    * @param verify 
  */
  public void postSetPassword (String old, String plain, String verify, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'old' is set
    if (old == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'old' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'old' when calling postSetPassword"));
    }
    // verify the required parameter 'plain' is set
    if (plain == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'plain' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'plain' when calling postSetPassword"));
    }
    // verify the required parameter 'verify' is set
    if (verify == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'verify' when calling postSetPassword",
        new ApiException(400, "Missing the required parameter 'verify' when calling postSetPassword"));
    }

    // create path and map variables
    String path = "/crx/explorer/ui/setpassword.jsp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "old", old));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "plain", plain));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "verify", verify));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "aemAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}