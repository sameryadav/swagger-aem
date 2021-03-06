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

package org.openapitools.client.model


case class SamlConfigurationInfo (
  // Persistent Identity (PID)
  pid: Option[String] = None,
  // Title
  title: Option[String] = None,
  // Title
  description: Option[String] = None,
  // needed for configuration binding
  bundleLocation: Option[String] = None,
  // needed for configuraiton binding
  serviceLocation: Option[String] = None,
  properties: Option[SamlConfigurationProperties] = None
)

