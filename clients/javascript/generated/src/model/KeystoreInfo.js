/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 3.2.1-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/KeystoreItems'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./KeystoreItems'));
  } else {
    // Browser globals (root is window)
    if (!root.NodeSwaggerAem) {
      root.NodeSwaggerAem = {};
    }
    root.NodeSwaggerAem.KeystoreInfo = factory(root.NodeSwaggerAem.ApiClient, root.NodeSwaggerAem.KeystoreItems);
  }
}(this, function(ApiClient, KeystoreItems) {
  'use strict';




  /**
   * The KeystoreInfo model module.
   * @module model/KeystoreInfo
   * @version 0.9.0
   */

  /**
   * Constructs a new <code>KeystoreInfo</code>.
   * @alias module:model/KeystoreInfo
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>KeystoreInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/KeystoreInfo} obj Optional instance to populate.
   * @return {module:model/KeystoreInfo} The populated <code>KeystoreInfo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('aliases')) {
        obj['aliases'] = ApiClient.convertToType(data['aliases'], [KeystoreItems]);
      }
      if (data.hasOwnProperty('exists')) {
        obj['exists'] = ApiClient.convertToType(data['exists'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/KeystoreItems>} aliases
   */
  exports.prototype['aliases'] = undefined;
  /**
   * False if truststore don't exist
   * @member {Boolean} exists
   */
  exports.prototype['exists'] = undefined;



  return exports;
}));

