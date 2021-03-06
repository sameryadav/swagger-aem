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
import { TruststoreItems } from './truststoreItems';


export interface TruststoreInfo { 
    aliases?: Array<TruststoreItems>;
    /**
     * False if truststore don't exist
     */
    exists?: boolean;
}
