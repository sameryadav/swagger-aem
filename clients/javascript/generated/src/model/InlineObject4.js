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

/**
 * The InlineObject4 model module.
 * @module model/InlineObject4
 * @version 0.9.0
 */
class InlineObject4 {
    /**
     * Constructs a new <code>InlineObject4</code>.
     * @alias module:model/InlineObject4
     */
    constructor() { 
        
        InlineObject4.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject4</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject4} obj Optional instance to populate.
     * @return {module:model/InlineObject4} The populated <code>InlineObject4</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject4();

            if (data.hasOwnProperty('cert-chain')) {
                obj['cert-chain'] = ApiClient.convertToType(data['cert-chain'], File);
            }
            if (data.hasOwnProperty('pk')) {
                obj['pk'] = ApiClient.convertToType(data['pk'], File);
            }
            if (data.hasOwnProperty('keyStore')) {
                obj['keyStore'] = ApiClient.convertToType(data['keyStore'], File);
            }
        }
        return obj;
    }


}

/**
 * @member {File} cert-chain
 */
InlineObject4.prototype['cert-chain'] = undefined;

/**
 * @member {File} pk
 */
InlineObject4.prototype['pk'] = undefined;

/**
 * @member {File} keyStore
 */
InlineObject4.prototype['keyStore'] = undefined;






export default InlineObject4;
