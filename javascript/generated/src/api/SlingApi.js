(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.NodeSwaggerAem) {
      root.NodeSwaggerAem = {};
    }
    root.NodeSwaggerAem.SlingApi = factory(root.NodeSwaggerAem.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Sling service.
   * @module api/SlingApi
   * @version 0.0.1
   */

  /**
   * Constructs a new SlingApi. 
   * @alias module:api/SlingApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the deleteAgent operation.
     * @callback module:api/SlingApi~deleteAgentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} runmode 
     * @param {String} name 
     * @param {module:api/SlingApi~deleteAgentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteAgent = function(runmode, name, callback) {
      var postBody = null;

      // verify the required parameter 'runmode' is set
      if (runmode == undefined || runmode == null) {
        throw "Missing the required parameter 'runmode' when calling deleteAgent";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling deleteAgent";
      }


      var pathParams = {
        'runmode': runmode,
        'name': name
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/etc/replication/agents.{runmode}/{name}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteNode operation.
     * @callback module:api/SlingApi~deleteNodeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} path 
     * @param {String} name 
     * @param {module:api/SlingApi~deleteNodeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteNode = function(path, name, callback) {
      var postBody = null;

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling deleteNode";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling deleteNode";
      }


      var pathParams = {
        'path': path,
        'name': name
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/{path}/{name}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getAgent operation.
     * @callback module:api/SlingApi~getAgentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} runmode 
     * @param {String} name 
     * @param {module:api/SlingApi~getAgentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.getAgent = function(runmode, name, callback) {
      var postBody = null;

      // verify the required parameter 'runmode' is set
      if (runmode == undefined || runmode == null) {
        throw "Missing the required parameter 'runmode' when calling getAgent";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling getAgent";
      }


      var pathParams = {
        'runmode': runmode,
        'name': name
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/etc/replication/agents.{runmode}/{name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getNode operation.
     * @callback module:api/SlingApi~getNodeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} path 
     * @param {String} name 
     * @param {module:api/SlingApi~getNodeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.getNode = function(path, name, callback) {
      var postBody = null;

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling getNode";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling getNode";
      }


      var pathParams = {
        'path': path,
        'name': name
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/{path}/{name}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPackage operation.
     * @callback module:api/SlingApi~getPackageCallback
     * @param {String} error Error message, if any.
     * @param {File} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} group 
     * @param {String} name 
     * @param {String} version 
     * @param {module:api/SlingApi~getPackageCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {File}
     */
    this.getPackage = function(group, name, version, callback) {
      var postBody = null;

      // verify the required parameter 'group' is set
      if (group == undefined || group == null) {
        throw "Missing the required parameter 'group' when calling getPackage";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling getPackage";
      }

      // verify the required parameter 'version' is set
      if (version == undefined || version == null) {
        throw "Missing the required parameter 'version' when calling getPackage";
      }


      var pathParams = {
        'group': group,
        'name': name,
        'version': version
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['application/octet-stream'];
      var returnType = File;

      return this.apiClient.callApi(
        '/etc/packages/{group}/{name}-{version}.zip', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPackageFilter operation.
     * @callback module:api/SlingApi~getPackageFilterCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} group 
     * @param {String} name 
     * @param {String} version 
     * @param {module:api/SlingApi~getPackageFilterCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {'String'}
     */
    this.getPackageFilter = function(group, name, version, callback) {
      var postBody = null;

      // verify the required parameter 'group' is set
      if (group == undefined || group == null) {
        throw "Missing the required parameter 'group' when calling getPackageFilter";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling getPackageFilter";
      }

      // verify the required parameter 'version' is set
      if (version == undefined || version == null) {
        throw "Missing the required parameter 'version' when calling getPackageFilter";
      }


      var pathParams = {
        'group': group,
        'name': name,
        'version': version
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postAgent operation.
     * @callback module:api/SlingApi~postAgentCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} runmode 
     * @param {String} name 
     * @param {Object} opts Optional parameters
     * @param {String} opts.jcrprimaryType 
     * @param {String} opts.jcrcontentcqname 
     * @param {String} opts.jcrcontentjcrtitle 
     * @param {String} opts.jcrcontentjcrdescription 
     * @param {String} opts.jcrcontentslingresourceType 
     * @param {String} opts.jcrcontenttransportUri 
     * @param {String} opts.jcrcontentlogLevel 
     * @param {Boolean} opts.jcrcontentnoVersioning 
     * @param {Array.<String>} opts.jcrcontentprotocolHTTPHeaders 
     * @param {String} opts.jcrcontentprotocolHTTPHeadersTypeHint 
     * @param {String} opts.jcrcontentprotocolHTTPMethod 
     * @param {String} opts.jcrcontentretryDelay 
     * @param {String} opts.jcrcontentserializationType 
     * @param {String} opts.jcrcontentjcrmixinTypes 
     * @param {Boolean} opts.jcrcontenttriggerReceive 
     * @param {Boolean} opts.jcrcontenttriggerSpecific 
     * @param {String} opts.jcrcontentcqtemplate 
     * @param {Boolean} opts.jcrcontentenabled 
     * @param {module:api/SlingApi~postAgentCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postAgent = function(runmode, name, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'runmode' is set
      if (runmode == undefined || runmode == null) {
        throw "Missing the required parameter 'runmode' when calling postAgent";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling postAgent";
      }


      var pathParams = {
        'runmode': runmode,
        'name': name
      };
      var queryParams = {
        'jcr:primaryType': opts['jcrprimaryType'],
        'jcr:content/cq:name': opts['jcrcontentcqname'],
        'jcr:content/jcr:title': opts['jcrcontentjcrtitle'],
        'jcr:content/jcr:description': opts['jcrcontentjcrdescription'],
        'jcr:content/sling:resourceType': opts['jcrcontentslingresourceType'],
        'jcr:content/transportUri': opts['jcrcontenttransportUri'],
        'jcr:content/logLevel': opts['jcrcontentlogLevel'],
        'jcr:content/noVersioning': opts['jcrcontentnoVersioning'],
        'jcr:content/protocolHTTPHeaders': this.apiClient.buildCollectionParam(opts['jcrcontentprotocolHTTPHeaders'], 'multi'),
        'jcr:content/protocolHTTPHeaders@TypeHint': opts['jcrcontentprotocolHTTPHeadersTypeHint'],
        'jcr:content/protocolHTTPMethod': opts['jcrcontentprotocolHTTPMethod'],
        'jcr:content/retryDelay': opts['jcrcontentretryDelay'],
        'jcr:content/serializationType': opts['jcrcontentserializationType'],
        'jcr:content/jcr:mixinTypes': opts['jcrcontentjcrmixinTypes'],
        'jcr:content/triggerReceive': opts['jcrcontenttriggerReceive'],
        'jcr:content/triggerSpecific': opts['jcrcontenttriggerSpecific'],
        'jcr:content/cq:template': opts['jcrcontentcqtemplate'],
        'jcr:content/enabled': opts['jcrcontentenabled']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/etc/replication/agents.{runmode}/{name}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postAuthorizables operation.
     * @callback module:api/SlingApi~postAuthorizablesCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} authorizableId 
     * @param {String} intermediatePath 
     * @param {Object} opts Optional parameters
     * @param {String} opts.createUser 
     * @param {String} opts.createGroup 
     * @param {String} opts.reppassword 
     * @param {String} opts.profilegivenName 
     * @param {module:api/SlingApi~postAuthorizablesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {'String'}
     */
    this.postAuthorizables = function(authorizableId, intermediatePath, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorizableId' is set
      if (authorizableId == undefined || authorizableId == null) {
        throw "Missing the required parameter 'authorizableId' when calling postAuthorizables";
      }

      // verify the required parameter 'intermediatePath' is set
      if (intermediatePath == undefined || intermediatePath == null) {
        throw "Missing the required parameter 'intermediatePath' when calling postAuthorizables";
      }


      var pathParams = {
      };
      var queryParams = {
        'authorizableId': authorizableId,
        'intermediatePath': intermediatePath,
        'createUser': opts['createUser'],
        'createGroup': opts['createGroup'],
        'rep:password': opts['reppassword'],
        'profile/givenName': opts['profilegivenName']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/html'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/libs/granite/security/post/authorizables', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postConfig operation.
     * @callback module:api/SlingApi~postConfigCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} runmode 
     * @param {String} name 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.orgApacheFelixHttpsNio 
     * @param {String} opts.orgApacheFelixHttpsNioTypeHint 
     * @param {String} opts.orgApacheFelixHttpsKeystore 
     * @param {String} opts.orgApacheFelixHttpsKeystoreTypeHint 
     * @param {String} opts.orgApacheFelixHttpsKeystorePassword 
     * @param {String} opts.orgApacheFelixHttpsKeystorePasswordTypeHint 
     * @param {String} opts.orgApacheFelixHttpsKeystoreKey 
     * @param {String} opts.orgApacheFelixHttpsKeystoreKeyTypeHint 
     * @param {String} opts.orgApacheFelixHttpsKeystoreKeyPassword 
     * @param {String} opts.orgApacheFelixHttpsKeystoreKeyPasswordTypeHint 
     * @param {String} opts.orgApacheFelixHttpsTruststore 
     * @param {String} opts.orgApacheFelixHttpsTruststoreTypeHint 
     * @param {String} opts.orgApacheFelixHttpsTruststorePassword 
     * @param {String} opts.orgApacheFelixHttpsTruststorePasswordTypeHint 
     * @param {String} opts.orgApacheFelixHttpsClientcertificate 
     * @param {String} opts.orgApacheFelixHttpsClientcertificateTypeHint 
     * @param {String} opts.orgApacheFelixHttpsEnable 
     * @param {String} opts.orgApacheFelixHttpsEnableTypeHint 
     * @param {String} opts.orgOsgiServiceHttpPortSecure 
     * @param {String} opts.orgOsgiServiceHttpPortSecureTypeHint 
     * @param {module:api/SlingApi~postConfigCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postConfig = function(runmode, name, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'runmode' is set
      if (runmode == undefined || runmode == null) {
        throw "Missing the required parameter 'runmode' when calling postConfig";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling postConfig";
      }


      var pathParams = {
        'runmode': runmode,
        'name': name
      };
      var queryParams = {
        'org.apache.felix.https.nio': opts['orgApacheFelixHttpsNio'],
        'org.apache.felix.https.nio@TypeHint': opts['orgApacheFelixHttpsNioTypeHint'],
        'org.apache.felix.https.keystore': opts['orgApacheFelixHttpsKeystore'],
        'org.apache.felix.https.keystore@TypeHint': opts['orgApacheFelixHttpsKeystoreTypeHint'],
        'org.apache.felix.https.keystore.password': opts['orgApacheFelixHttpsKeystorePassword'],
        'org.apache.felix.https.keystore.password@TypeHint': opts['orgApacheFelixHttpsKeystorePasswordTypeHint'],
        'org.apache.felix.https.keystore.key': opts['orgApacheFelixHttpsKeystoreKey'],
        'org.apache.felix.https.keystore.key@TypeHint': opts['orgApacheFelixHttpsKeystoreKeyTypeHint'],
        'org.apache.felix.https.keystore.key.password': opts['orgApacheFelixHttpsKeystoreKeyPassword'],
        'org.apache.felix.https.keystore.key.password@TypeHint': opts['orgApacheFelixHttpsKeystoreKeyPasswordTypeHint'],
        'org.apache.felix.https.truststore': opts['orgApacheFelixHttpsTruststore'],
        'org.apache.felix.https.truststore@TypeHint': opts['orgApacheFelixHttpsTruststoreTypeHint'],
        'org.apache.felix.https.truststore.password': opts['orgApacheFelixHttpsTruststorePassword'],
        'org.apache.felix.https.truststore.password@TypeHint': opts['orgApacheFelixHttpsTruststorePasswordTypeHint'],
        'org.apache.felix.https.clientcertificate': opts['orgApacheFelixHttpsClientcertificate'],
        'org.apache.felix.https.clientcertificate@TypeHint': opts['orgApacheFelixHttpsClientcertificateTypeHint'],
        'org.apache.felix.https.enable': opts['orgApacheFelixHttpsEnable'],
        'org.apache.felix.https.enable@TypeHint': opts['orgApacheFelixHttpsEnableTypeHint'],
        'org.osgi.service.http.port.secure': opts['orgOsgiServiceHttpPortSecure'],
        'org.osgi.service.http.port.secure@TypeHint': opts['orgOsgiServiceHttpPortSecureTypeHint']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/apps/system/config.{runmode}/{name}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postNodeRw operation.
     * @callback module:api/SlingApi~postNodeRwCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} path 
     * @param {String} name 
     * @param {Object} opts Optional parameters
     * @param {String} opts.addMembers 
     * @param {module:api/SlingApi~postNodeRwCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postNodeRw = function(path, name, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling postNodeRw";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling postNodeRw";
      }


      var pathParams = {
        'path': path,
        'name': name
      };
      var queryParams = {
        'addMembers': opts['addMembers']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/{path}/{name}.rw.html', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postPath operation.
     * @callback module:api/SlingApi~postPathCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} path 
     * @param {String} jcrprimaryType 
     * @param {String} name 
     * @param {module:api/SlingApi~postPathCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postPath = function(path, jcrprimaryType, name, callback) {
      var postBody = null;

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling postPath";
      }

      // verify the required parameter 'jcrprimaryType' is set
      if (jcrprimaryType == undefined || jcrprimaryType == null) {
        throw "Missing the required parameter 'jcrprimaryType' when calling postPath";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling postPath";
      }


      var pathParams = {
        'path': path
      };
      var queryParams = {
        'jcr:primaryType': jcrprimaryType,
        ':name': name
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/{path}/', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postQuery operation.
     * @callback module:api/SlingApi~postQueryCallback
     * @param {String} error Error message, if any.
     * @param {'String'} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} path 
     * @param {Number} pLimit 
     * @param {String} _1Property 
     * @param {String} _1PropertyValue 
     * @param {module:api/SlingApi~postQueryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {'String'}
     */
    this.postQuery = function(path, pLimit, _1Property, _1PropertyValue, callback) {
      var postBody = null;

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling postQuery";
      }

      // verify the required parameter 'pLimit' is set
      if (pLimit == undefined || pLimit == null) {
        throw "Missing the required parameter 'pLimit' when calling postQuery";
      }

      // verify the required parameter '_1Property' is set
      if (_1Property == undefined || _1Property == null) {
        throw "Missing the required parameter '_1Property' when calling postQuery";
      }

      // verify the required parameter '_1PropertyValue' is set
      if (_1PropertyValue == undefined || _1PropertyValue == null) {
        throw "Missing the required parameter '_1PropertyValue' when calling postQuery";
      }


      var pathParams = {
      };
      var queryParams = {
        'path': path,
        'p.limit': pLimit,
        '1_property': _1Property,
        '1_property.value': _1PropertyValue
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/bin/querybuilder.json', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postTreeActivation operation.
     * @callback module:api/SlingApi~postTreeActivationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Boolean} ignoredeactivated 
     * @param {Boolean} onlymodified 
     * @param {String} path 
     * @param {module:api/SlingApi~postTreeActivationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postTreeActivation = function(ignoredeactivated, onlymodified, path, callback) {
      var postBody = null;

      // verify the required parameter 'ignoredeactivated' is set
      if (ignoredeactivated == undefined || ignoredeactivated == null) {
        throw "Missing the required parameter 'ignoredeactivated' when calling postTreeActivation";
      }

      // verify the required parameter 'onlymodified' is set
      if (onlymodified == undefined || onlymodified == null) {
        throw "Missing the required parameter 'onlymodified' when calling postTreeActivation";
      }

      // verify the required parameter 'path' is set
      if (path == undefined || path == null) {
        throw "Missing the required parameter 'path' when calling postTreeActivation";
      }


      var pathParams = {
      };
      var queryParams = {
        'ignoredeactivated': ignoredeactivated,
        'onlymodified': onlymodified,
        'path': path
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['aemAuth'];
      var contentTypes = [];
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/etc/replication/treeactivation.html', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
