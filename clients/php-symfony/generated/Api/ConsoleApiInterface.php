<?php
/**
 * ConsoleApiInterface
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Adobe Experience Manager (AEM) API
 *
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 3.2.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\SamlConfigurationInfo;

/**
 * ConsoleApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface ConsoleApiInterface
{

    /**
     * Sets authentication method aemAuth
     *
     * @param string $value Value of the aemAuth authentication method.
     *
     * @return void
     */
    public function setaemAuth($value);

    /**
     * Operation getAemProductInfo
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return string
     *
     */
    public function getAemProductInfo(&$responseCode, array &$responseHeaders);

    /**
     * Operation getConfigMgr
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return string
     *
     */
    public function getConfigMgr(&$responseCode, array &$responseHeaders);

    /**
     * Operation postBundle
     *
     * @param  string $name   (required)
     * @param  string $action   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function postBundle($name, $action, &$responseCode, array &$responseHeaders);

    /**
     * Operation postJmxRepository
     *
     * @param  string $action   (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function postJmxRepository($action, &$responseCode, array &$responseHeaders);

    /**
     * Operation postSamlConfiguration
     *
     * @param  bool $post   (optional)
     * @param  bool $apply   (optional)
     * @param  bool $delete   (optional)
     * @param  string $action   (optional)
     * @param  string $location   (optional)
     * @param  string[] $path   (optional)
     * @param  int $serviceRanking   (optional)
     * @param  string $idpUrl   (optional)
     * @param  string $idpCertAlias   (optional)
     * @param  bool $idpHttpRedirect   (optional)
     * @param  string $serviceProviderEntityId   (optional)
     * @param  string $assertionConsumerServiceURL   (optional)
     * @param  string $spPrivateKeyAlias   (optional)
     * @param  string $keyStorePassword   (optional)
     * @param  string $defaultRedirectUrl   (optional)
     * @param  string $userIDAttribute   (optional)
     * @param  bool $useEncryption   (optional)
     * @param  bool $createUser   (optional)
     * @param  bool $addGroupMemberships   (optional)
     * @param  string $groupMembershipAttribute   (optional)
     * @param  string[] $defaultGroups   (optional)
     * @param  string $nameIdFormat   (optional)
     * @param  string[] $synchronizeAttributes   (optional)
     * @param  bool $handleLogout   (optional)
     * @param  string $logoutUrl   (optional)
     * @param  int $clockTolerance   (optional)
     * @param  string $digestMethod   (optional)
     * @param  string $signatureMethod   (optional)
     * @param  string $userIntermediatePath   (optional)
     * @param  string[] $propertylist   (optional)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return OpenAPI\Server\Model\SamlConfigurationInfo[]
     *
     */
    public function postSamlConfiguration($post = null, $apply = null, $delete = null, $action = null, $location = null, array $path = null, $serviceRanking = null, $idpUrl = null, $idpCertAlias = null, $idpHttpRedirect = null, $serviceProviderEntityId = null, $assertionConsumerServiceURL = null, $spPrivateKeyAlias = null, $keyStorePassword = null, $defaultRedirectUrl = null, $userIDAttribute = null, $useEncryption = null, $createUser = null, $addGroupMemberships = null, $groupMembershipAttribute = null, array $defaultGroups = null, $nameIdFormat = null, array $synchronizeAttributes = null, $handleLogout = null, $logoutUrl = null, $clockTolerance = null, $digestMethod = null, $signatureMethod = null, $userIntermediatePath = null, array $propertylist = null, &$responseCode, array &$responseHeaders);
}