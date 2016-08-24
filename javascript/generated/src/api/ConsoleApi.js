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
    root.NodeSwaggerAem.ConsoleApi = factory(root.NodeSwaggerAem.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * Console service.
   * @module api/ConsoleApi
   * @version 0.0.1
   */

  /**
   * Constructs a new ConsoleApi. 
   * @alias module:api/ConsoleApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use, default to {@link module:ApiClient#instance}
   * if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the postBundle operation.
     * @callback module:api/ConsoleApi~postBundleCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} name 
     * @param {String} action 
     * @param {module:api/ConsoleApi~postBundleCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postBundle = function(name, action, callback) {
      var postBody = null;

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling postBundle";
      }

      // verify the required parameter 'action' is set
      if (action == undefined || action == null) {
        throw "Missing the required parameter 'action' when calling postBundle";
      }


      var pathParams = {
        'name': name
      };
      var queryParams = {
        'action': action
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
        '/system/console/bundles/{name}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the postJmxRepository operation.
     * @callback module:api/ConsoleApi~postJmxRepositoryCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} action 
     * @param {module:api/ConsoleApi~postJmxRepositoryCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.postJmxRepository = function(action, callback) {
      var postBody = null;

      // verify the required parameter 'action' is set
      if (action == undefined || action == null) {
        throw "Missing the required parameter 'action' when calling postJmxRepository";
      }


      var pathParams = {
        'action': action
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
        '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
