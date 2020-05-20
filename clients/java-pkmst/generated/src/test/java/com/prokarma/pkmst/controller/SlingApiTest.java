/*
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


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.io.File;
import com.prokarma.pkmst.model.KeystoreInfo;
import com.prokarma.pkmst.model.TruststoreInfo;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for SlingApi
 */
@Ignore
public class SlingApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final SlingApi api = new SlingApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAgentTest() throws Exception {
        String runmode = null;
        String name = null;
    ResponseEntity<Void> response = api.deleteAgent(runmode, name , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteNodeTest() throws Exception {
        String path = null;
        String name = null;
    ResponseEntity<Void> response = api.deleteNode(path, name , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAgentTest() throws Exception {
        String runmode = null;
        String name = null;
    ResponseEntity<Void> response = api.getAgent(runmode, name , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAgentsTest() throws Exception {
        String runmode = null;
    ResponseEntity<String> response = api.getAgents(runmode , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAuthorizableKeystoreTest() throws Exception {
        String intermediatePath = null;
        String authorizableId = null;
    ResponseEntity<KeystoreInfo> response = api.getAuthorizableKeystore(intermediatePath, authorizableId , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getKeystoreTest() throws Exception {
        String intermediatePath = null;
        String authorizableId = null;
    ResponseEntity<File> response = api.getKeystore(intermediatePath, authorizableId , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws Exception {
        String path = null;
        String name = null;
    ResponseEntity<Void> response = api.getNode(path, name , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackageTest() throws Exception {
        String group = null;
        String name = null;
        String version = null;
    ResponseEntity<File> response = api.getPackage(group, name, version , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPackageFilterTest() throws Exception {
        String group = null;
        String name = null;
        String version = null;
    ResponseEntity<String> response = api.getPackageFilter(group, name, version , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getQueryTest() throws Exception {
        String path = null;
        BigDecimal pLimit = null;
        String _1property = null;
        String _1propertyValue = null;
    ResponseEntity<String> response = api.getQuery(path, pLimit, _1property, _1propertyValue , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTruststoreTest() throws Exception {
    ResponseEntity<File> response = api.getTruststore(  accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTruststoreInfoTest() throws Exception {
    ResponseEntity<TruststoreInfo> response = api.getTruststoreInfo(  accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAgentTest() throws Exception {
        String runmode = null;
        String name = null;
        Boolean jcrColonContentSlashCqColonDistribute = null;
        String jcrColonContentSlashCqColonDistributeAtTypeHint = null;
        String jcrColonContentSlashCqColonName = null;
        String jcrColonContentSlashCqColonTemplate = null;
        Boolean jcrColonContentSlashEnabled = null;
        String jcrColonContentSlashJcrColonDescription = null;
        String jcrColonContentSlashJcrColonLastModified = null;
        String jcrColonContentSlashJcrColonLastModifiedBy = null;
        String jcrColonContentSlashJcrColonMixinTypes = null;
        String jcrColonContentSlashJcrColonTitle = null;
        String jcrColonContentSlashLogLevel = null;
        Boolean jcrColonContentSlashNoStatusUpdate = null;
        Boolean jcrColonContentSlashNoVersioning = null;
        BigDecimal jcrColonContentSlashProtocolConnectTimeout = null;
        Boolean jcrColonContentSlashProtocolHTTPConnectionClosed = null;
        String jcrColonContentSlashProtocolHTTPExpired = null;
        List<String> jcrColonContentSlashProtocolHTTPHeaders = null;
        String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint = null;
        String jcrColonContentSlashProtocolHTTPMethod = null;
        Boolean jcrColonContentSlashProtocolHTTPSRelaxed = null;
        String jcrColonContentSlashProtocolInterface = null;
        BigDecimal jcrColonContentSlashProtocolSocketTimeout = null;
        String jcrColonContentSlashProtocolVersion = null;
        String jcrColonContentSlashProxyNTLMDomain = null;
        String jcrColonContentSlashProxyNTLMHost = null;
        String jcrColonContentSlashProxyHost = null;
        String jcrColonContentSlashProxyPassword = null;
        BigDecimal jcrColonContentSlashProxyPort = null;
        String jcrColonContentSlashProxyUser = null;
        BigDecimal jcrColonContentSlashQueueBatchMaxSize = null;
        String jcrColonContentSlashQueueBatchMode = null;
        BigDecimal jcrColonContentSlashQueueBatchWaitTime = null;
        String jcrColonContentSlashRetryDelay = null;
        Boolean jcrColonContentSlashReverseReplication = null;
        String jcrColonContentSlashSerializationType = null;
        String jcrColonContentSlashSlingColonResourceType = null;
        String jcrColonContentSlashSsl = null;
        String jcrColonContentSlashTransportNTLMDomain = null;
        String jcrColonContentSlashTransportNTLMHost = null;
        String jcrColonContentSlashTransportPassword = null;
        String jcrColonContentSlashTransportUri = null;
        String jcrColonContentSlashTransportUser = null;
        Boolean jcrColonContentSlashTriggerDistribute = null;
        Boolean jcrColonContentSlashTriggerModified = null;
        Boolean jcrColonContentSlashTriggerOnOffTime = null;
        Boolean jcrColonContentSlashTriggerReceive = null;
        Boolean jcrColonContentSlashTriggerSpecific = null;
        String jcrColonContentSlashUserId = null;
        String jcrColonPrimaryType = null;
        String colonOperation = null;
    ResponseEntity<Void> response = api.postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAuthorizableKeystoreTest() throws Exception {
        String intermediatePath = null;
        String authorizableId = null;
        String colonOperation = null;
        String currentPassword = null;
        String newPassword = null;
        String rePassword = null;
        String keyPassword = null;
        String keyStorePass = null;
        String alias = null;
        String newAlias = null;
        String removeAlias = null;
        MultipartFile certChain = null;
        MultipartFile pk = null;
        MultipartFile keyStore = null;
    ResponseEntity<KeystoreInfo> response = api.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChain, pk, keyStore , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAuthorizablesTest() throws Exception {
        String authorizableId = null;
        String intermediatePath = null;
        String createUser = null;
        String createGroup = null;
        String repColonPassword = null;
        String profileSlashGivenName = null;
    ResponseEntity<String> response = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigAdobeGraniteSamlAuthenticationHandlerTest() throws Exception {
        String keyStorePassword = null;
        String keyStorePasswordAtTypeHint = null;
        Integer serviceRanking = null;
        String serviceRankingAtTypeHint = null;
        Boolean idpHttpRedirect = null;
        String idpHttpRedirectAtTypeHint = null;
        Boolean createUser = null;
        String createUserAtTypeHint = null;
        String defaultRedirectUrl = null;
        String defaultRedirectUrlAtTypeHint = null;
        String userIDAttribute = null;
        String userIDAttributeAtTypeHint = null;
        List<String> defaultGroups = null;
        String defaultGroupsAtTypeHint = null;
        String idpCertAlias = null;
        String idpCertAliasAtTypeHint = null;
        Boolean addGroupMemberships = null;
        String addGroupMembershipsAtTypeHint = null;
        List<String> path = null;
        String pathAtTypeHint = null;
        List<String> synchronizeAttributes = null;
        String synchronizeAttributesAtTypeHint = null;
        Integer clockTolerance = null;
        String clockToleranceAtTypeHint = null;
        String groupMembershipAttribute = null;
        String groupMembershipAttributeAtTypeHint = null;
        String idpUrl = null;
        String idpUrlAtTypeHint = null;
        String logoutUrl = null;
        String logoutUrlAtTypeHint = null;
        String serviceProviderEntityId = null;
        String serviceProviderEntityIdAtTypeHint = null;
        String assertionConsumerServiceURL = null;
        String assertionConsumerServiceURLAtTypeHint = null;
        Boolean handleLogout = null;
        String handleLogoutAtTypeHint = null;
        String spPrivateKeyAlias = null;
        String spPrivateKeyAliasAtTypeHint = null;
        Boolean useEncryption = null;
        String useEncryptionAtTypeHint = null;
        String nameIdFormat = null;
        String nameIdFormatAtTypeHint = null;
        String digestMethod = null;
        String digestMethodAtTypeHint = null;
        String signatureMethod = null;
        String signatureMethodAtTypeHint = null;
        String userIntermediatePath = null;
        String userIntermediatePathAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword, keyStorePasswordAtTypeHint, serviceRanking, serviceRankingAtTypeHint, idpHttpRedirect, idpHttpRedirectAtTypeHint, createUser, createUserAtTypeHint, defaultRedirectUrl, defaultRedirectUrlAtTypeHint, userIDAttribute, userIDAttributeAtTypeHint, defaultGroups, defaultGroupsAtTypeHint, idpCertAlias, idpCertAliasAtTypeHint, addGroupMemberships, addGroupMembershipsAtTypeHint, path, pathAtTypeHint, synchronizeAttributes, synchronizeAttributesAtTypeHint, clockTolerance, clockToleranceAtTypeHint, groupMembershipAttribute, groupMembershipAttributeAtTypeHint, idpUrl, idpUrlAtTypeHint, logoutUrl, logoutUrlAtTypeHint, serviceProviderEntityId, serviceProviderEntityIdAtTypeHint, assertionConsumerServiceURL, assertionConsumerServiceURLAtTypeHint, handleLogout, handleLogoutAtTypeHint, spPrivateKeyAlias, spPrivateKeyAliasAtTypeHint, useEncryption, useEncryptionAtTypeHint, nameIdFormat, nameIdFormatAtTypeHint, digestMethod, digestMethodAtTypeHint, signatureMethod, signatureMethodAtTypeHint, userIntermediatePath, userIntermediatePathAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheFelixJettyBasedHttpServiceTest() throws Exception {
        Boolean orgApacheFelixHttpsNio = null;
        String orgApacheFelixHttpsNioAtTypeHint = null;
        String orgApacheFelixHttpsKeystore = null;
        String orgApacheFelixHttpsKeystoreAtTypeHint = null;
        String orgApacheFelixHttpsKeystorePassword = null;
        String orgApacheFelixHttpsKeystorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKey = null;
        String orgApacheFelixHttpsKeystoreKeyAtTypeHint = null;
        String orgApacheFelixHttpsKeystoreKeyPassword = null;
        String orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint = null;
        String orgApacheFelixHttpsTruststore = null;
        String orgApacheFelixHttpsTruststoreAtTypeHint = null;
        String orgApacheFelixHttpsTruststorePassword = null;
        String orgApacheFelixHttpsTruststorePasswordAtTypeHint = null;
        String orgApacheFelixHttpsClientcertificate = null;
        String orgApacheFelixHttpsClientcertificateAtTypeHint = null;
        Boolean orgApacheFelixHttpsEnable = null;
        String orgApacheFelixHttpsEnableAtTypeHint = null;
        String orgOsgiServiceHttpPortSecure = null;
        String orgOsgiServiceHttpPortSecureAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio, orgApacheFelixHttpsNioAtTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreAtTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordAtTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyAtTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordAtTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreAtTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordAtTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateAtTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableAtTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheHttpComponentsProxyConfigurationTest() throws Exception {
        String proxyHost = null;
        String proxyHostAtTypeHint = null;
        Integer proxyPort = null;
        String proxyPortAtTypeHint = null;
        List<String> proxyExceptions = null;
        String proxyExceptionsAtTypeHint = null;
        Boolean proxyEnabled = null;
        String proxyEnabledAtTypeHint = null;
        String proxyUser = null;
        String proxyUserAtTypeHint = null;
        String proxyPassword = null;
        String proxyPasswordAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigApacheHttpComponentsProxyConfiguration(proxyHost, proxyHostAtTypeHint, proxyPort, proxyPortAtTypeHint, proxyExceptions, proxyExceptionsAtTypeHint, proxyEnabled, proxyEnabledAtTypeHint, proxyUser, proxyUserAtTypeHint, proxyPassword, proxyPasswordAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingDavExServletTest() throws Exception {
        String alias = null;
        String aliasAtTypeHint = null;
        Boolean davCreateAbsoluteUri = null;
        String davCreateAbsoluteUriAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigApacheSlingDavExServlet(alias, aliasAtTypeHint, davCreateAbsoluteUri, davCreateAbsoluteUriAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingGetServletTest() throws Exception {
        String jsonMaximumresults = null;
        String jsonMaximumresultsAtTypeHint = null;
        Boolean enableHtml = null;
        String enableHtmlAtTypeHint = null;
        Boolean enableTxt = null;
        String enableTxtAtTypeHint = null;
        Boolean enableXml = null;
        String enableXmlAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigApacheSlingGetServlet(jsonMaximumresults, jsonMaximumresultsAtTypeHint, enableHtml, enableHtmlAtTypeHint, enableTxt, enableTxtAtTypeHint, enableXml, enableXmlAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postConfigApacheSlingReferrerFilterTest() throws Exception {
        Boolean allowEmpty = null;
        String allowEmptyAtTypeHint = null;
        String allowHosts = null;
        String allowHostsAtTypeHint = null;
        String allowHostsRegexp = null;
        String allowHostsRegexpAtTypeHint = null;
        String filterMethods = null;
        String filterMethodsAtTypeHint = null;
    ResponseEntity<Void> response = api.postConfigApacheSlingReferrerFilter(allowEmpty, allowEmptyAtTypeHint, allowHosts, allowHostsAtTypeHint, allowHostsRegexp, allowHostsRegexpAtTypeHint, filterMethods, filterMethodsAtTypeHint , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNodeTest() throws Exception {
        String path = null;
        String name = null;
        String colonOperation = null;
        String deleteAuthorizable = null;
        MultipartFile file = null;
    ResponseEntity<Void> response = api.postNode(path, name, colonOperation, deleteAuthorizable, file , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postNodeRwTest() throws Exception {
        String path = null;
        String name = null;
        String addMembers = null;
    ResponseEntity<Void> response = api.postNodeRw(path, name, addMembers , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPathTest() throws Exception {
        String path = null;
        String jcrColonPrimaryType = null;
        String colonName = null;
    ResponseEntity<Void> response = api.postPath(path, jcrColonPrimaryType, colonName , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postQueryTest() throws Exception {
        String path = null;
        BigDecimal pLimit = null;
        String _1property = null;
        String _1propertyValue = null;
    ResponseEntity<String> response = api.postQuery(path, pLimit, _1property, _1propertyValue , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTreeActivationTest() throws Exception {
        Boolean ignoredeactivated = null;
        Boolean onlymodified = null;
        String path = null;
    ResponseEntity<Void> response = api.postTreeActivation(ignoredeactivated, onlymodified, path , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTruststoreTest() throws Exception {
        String colonOperation = null;
        String newPassword = null;
        String rePassword = null;
        String keyStoreType = null;
        String removeAlias = null;
        MultipartFile certificate = null;
    ResponseEntity<String> response = api.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificate , accept);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTruststorePKCS12Test() throws Exception {
        MultipartFile truststoreP12 = null;
    ResponseEntity<String> response = api.postTruststorePKCS12(truststoreP12 , accept);

        // TODO: test validations
    }
    
}