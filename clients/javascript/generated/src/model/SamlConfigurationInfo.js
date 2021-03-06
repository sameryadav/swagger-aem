/**
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.5.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SamlConfigurationProperties from './SamlConfigurationProperties';

/**
 * The SamlConfigurationInfo model module.
 * @module model/SamlConfigurationInfo
 * @version 0.9.0
 */
class SamlConfigurationInfo {
    /**
     * Constructs a new <code>SamlConfigurationInfo</code>.
     * @alias module:model/SamlConfigurationInfo
     */
    constructor() { 
        
        SamlConfigurationInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SamlConfigurationInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SamlConfigurationInfo} obj Optional instance to populate.
     * @return {module:model/SamlConfigurationInfo} The populated <code>SamlConfigurationInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SamlConfigurationInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('bundle_location')) {
                obj['bundle_location'] = ApiClient.convertToType(data['bundle_location'], 'String');
            }
            if (data.hasOwnProperty('service_location')) {
                obj['service_location'] = ApiClient.convertToType(data['service_location'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = SamlConfigurationProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * Persistent Identity (PID)
 * @member {String} pid
 */
SamlConfigurationInfo.prototype['pid'] = undefined;

/**
 * Title
 * @member {String} title
 */
SamlConfigurationInfo.prototype['title'] = undefined;

/**
 * Title
 * @member {String} description
 */
SamlConfigurationInfo.prototype['description'] = undefined;

/**
 * needed for configuration binding
 * @member {String} bundle_location
 */
SamlConfigurationInfo.prototype['bundle_location'] = undefined;

/**
 * needed for configuraiton binding
 * @member {String} service_location
 */
SamlConfigurationInfo.prototype['service_location'] = undefined;

/**
 * @member {module:model/SamlConfigurationProperties} properties
 */
SamlConfigurationInfo.prototype['properties'] = undefined;






export default SamlConfigurationInfo;

