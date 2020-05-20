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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import java.io.File
import io.swagger.client.model.KeystoreInfo
import io.swagger.client.model.Number
import io.swagger.client.model.TruststoreInfo

trait SlingApi extends Service {


  final override def descriptor = {
    import Service._
    named("SlingApi").withCalls(
      restCall(Method.DELETE, "/etc/replication/agents.:runmode/:name", deleteAgent _), 
      restCall(Method.DELETE, "/:path/:name", deleteNode _), 
      restCall(Method.GET, "/etc/replication/agents.:runmode/:name", getAgent _), 
      restCall(Method.GET, "/etc/replication/agents.:runmode.-1.json", getAgents _), 
      restCall(Method.GET, "/:intermediatePath/:authorizableId.ks.json", getAuthorizableKeystore _), 
      restCall(Method.GET, "/:intermediatePath/:authorizableId/keystore/store.p12", getKeystore _), 
      restCall(Method.GET, "/:path/:name", getNode _), 
      restCall(Method.GET, "/etc/packages/:group/:name-:version.zip", getPackage _), 
      restCall(Method.GET, "/etc/packages/:group/:name-:version.zip/jcr:content/vlt:definition/filter.tidy.2.json", getPackageFilter _), 
      restCall(Method.GET, "/bin/querybuilder.json?`path`&pLimit&`1property`&`1propertyValue`", getQuery _), 
      restCall(Method.GET, "/etc/truststore/truststore.p12", getTruststore _), 
      restCall(Method.GET, "/libs/granite/security/truststore.json", getTruststoreInfo _), 
      restCall(Method.POST, "/etc/replication/agents.:runmode/:name?jcrcontentcqdistribute&jcrcontentcqdistributeTypeHint&jcrcontentcqname&jcrcontentcqtemplate&jcrcontentenabled&jcrcontentjcrdescription&jcrcontentjcrlastModified&jcrcontentjcrlastModifiedBy&jcrcontentjcrmixinTypes&jcrcontentjcrtitle&jcrcontentlogLevel&jcrcontentnoStatusUpdate&jcrcontentnoVersioning&jcrcontentprotocolConnectTimeout&jcrcontentprotocolHTTPConnectionClosed&jcrcontentprotocolHTTPExpired&jcrcontentprotocolHTTPHeaders&jcrcontentprotocolHTTPHeadersTypeHint&jcrcontentprotocolHTTPMethod&jcrcontentprotocolHTTPSRelaxed&jcrcontentprotocolInterface&jcrcontentprotocolSocketTimeout&jcrcontentprotocolVersion&jcrcontentproxyNTLMDomain&jcrcontentproxyNTLMHost&jcrcontentproxyHost&jcrcontentproxyPassword&jcrcontentproxyPort&jcrcontentproxyUser&jcrcontentqueueBatchMaxSize&jcrcontentqueueBatchMode&jcrcontentqueueBatchWaitTime&jcrcontentretryDelay&jcrcontentreverseReplication&jcrcontentserializationType&jcrcontentslingresourceType&jcrcontentssl&jcrcontenttransportNTLMDomain&jcrcontenttransportNTLMHost&jcrcontenttransportPassword&jcrcontenttransportUri&jcrcontenttransportUser&jcrcontenttriggerDistribute&jcrcontenttriggerModified&jcrcontenttriggerOnOffTime&jcrcontenttriggerReceive&jcrcontenttriggerSpecific&jcrcontentuserId&jcrprimaryType&operation", postAgent _), 
      restCall(Method.POST, "/:intermediatePath/:authorizableId.ks.html?operation&currentPassword&newPassword&rePassword&keyPassword&keyStorePass&alias&newAlias&removeAlias", postAuthorizableKeystore _), 
      restCall(Method.POST, "/libs/granite/security/post/authorizables?authorizableId&intermediatePath&createUser&createGroup&reppassword&profilegivenName", postAuthorizables _), 
      restCall(Method.POST, "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config?keyStorePassword&keyStorePasswordTypeHint&serviceRanking&serviceRankingTypeHint&idpHttpRedirect&idpHttpRedirectTypeHint&createUser&createUserTypeHint&defaultRedirectUrl&defaultRedirectUrlTypeHint&userIDAttribute&userIDAttributeTypeHint&defaultGroups&defaultGroupsTypeHint&idpCertAlias&idpCertAliasTypeHint&addGroupMemberships&addGroupMembershipsTypeHint&`path`&pathTypeHint&synchronizeAttributes&synchronizeAttributesTypeHint&clockTolerance&clockToleranceTypeHint&groupMembershipAttribute&groupMembershipAttributeTypeHint&idpUrl&idpUrlTypeHint&logoutUrl&logoutUrlTypeHint&serviceProviderEntityId&serviceProviderEntityIdTypeHint&assertionConsumerServiceURL&assertionConsumerServiceURLTypeHint&handleLogout&handleLogoutTypeHint&spPrivateKeyAlias&spPrivateKeyAliasTypeHint&useEncryption&useEncryptionTypeHint&nameIdFormat&nameIdFormatTypeHint&digestMethod&digestMethodTypeHint&signatureMethod&signatureMethodTypeHint&userIntermediatePath&userIntermediatePathTypeHint", postConfigAdobeGraniteSamlAuthenticationHandler _), 
      restCall(Method.POST, "/apps/system/config/org.apache.felix.http?orgApacheFelixHttpsNio&orgApacheFelixHttpsNioTypeHint&orgApacheFelixHttpsKeystore&orgApacheFelixHttpsKeystoreTypeHint&orgApacheFelixHttpsKeystorePassword&orgApacheFelixHttpsKeystorePasswordTypeHint&orgApacheFelixHttpsKeystoreKey&orgApacheFelixHttpsKeystoreKeyTypeHint&orgApacheFelixHttpsKeystoreKeyPassword&orgApacheFelixHttpsKeystoreKeyPasswordTypeHint&orgApacheFelixHttpsTruststore&orgApacheFelixHttpsTruststoreTypeHint&orgApacheFelixHttpsTruststorePassword&orgApacheFelixHttpsTruststorePasswordTypeHint&orgApacheFelixHttpsClientcertificate&orgApacheFelixHttpsClientcertificateTypeHint&orgApacheFelixHttpsEnable&orgApacheFelixHttpsEnableTypeHint&orgOsgiServiceHttpPortSecure&orgOsgiServiceHttpPortSecureTypeHint", postConfigApacheFelixJettyBasedHttpService _), 
      restCall(Method.POST, "/apps/system/config/org.apache.http.proxyconfigurator.config?proxyHost&proxyHostTypeHint&proxyPort&proxyPortTypeHint&proxyExceptions&proxyExceptionsTypeHint&proxyEnabled&proxyEnabledTypeHint&proxyUser&proxyUserTypeHint&proxyPassword&proxyPasswordTypeHint", postConfigApacheHttpComponentsProxyConfiguration _), 
      restCall(Method.POST, "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet?alias&aliasTypeHint&davCreateAbsoluteUri&davCreateAbsoluteUriTypeHint", postConfigApacheSlingDavExServlet _), 
      restCall(Method.POST, "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet?jsonMaximumresults&jsonMaximumresultsTypeHint&enableHtml&enableHtmlTypeHint&enableTxt&enableTxtTypeHint&enableXml&enableXmlTypeHint", postConfigApacheSlingGetServlet _), 
      restCall(Method.POST, "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter?allowEmpty&allowEmptyTypeHint&allowHosts&allowHostsTypeHint&allowHostsRegexp&allowHostsRegexpTypeHint&filterMethods&filterMethodsTypeHint", postConfigApacheSlingReferrerFilter _), 
      restCall(Method.POST, "/:path/:name?operation&deleteAuthorizable", postNode _), 
      restCall(Method.POST, "/:path/:name.rw.html?addMembers", postNodeRw _), 
      restCall(Method.POST, "/:path/?jcrprimaryType&name", postPath _), 
      restCall(Method.POST, "/bin/querybuilder.json?`path`&pLimit&`1property`&`1propertyValue`", postQuery _), 
      restCall(Method.POST, "/etc/replication/treeactivation.html?ignoredeactivated&onlymodified&`path`", postTreeActivation _), 
      restCall(Method.POST, "/libs/granite/security/post/truststore?operation&newPassword&rePassword&keyStoreType&removeAlias", postTruststore _), 
      restCall(Method.POST, "/etc/truststore", postTruststorePKCS12 _)
    ).withAutoAcl(true)
  }


  /**
    * 
    * 
    *  
    * @param runmode   
    * @param name  
    * @return void
    */
  def deleteAgent(runmode: String, name: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param name  
    * @return void
    */
  def deleteNode(`path`: String, name: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * 
    *  
    * @param runmode   
    * @param name  
    * @return void
    */
  def getAgent(runmode: String, name: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * 
    *  
    * @param runmode  
    * @return String
    */
  def getAgents(runmode: String): ServiceCall[NotUsed ,String]
  
  /**
    * 
    * 
    *  
    * @param intermediatePath   
    * @param authorizableId  
    * @return KeystoreInfo
    */
  def getAuthorizableKeystore(intermediatePath: String, authorizableId: String): ServiceCall[NotUsed ,KeystoreInfo]
  
  /**
    * 
    * 
    *  
    * @param intermediatePath   
    * @param authorizableId  
    * @return File
    */
  def getKeystore(intermediatePath: String, authorizableId: String): ServiceCall[NotUsed ,File]
  
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param name  
    * @return void
    */
  def getNode(`path`: String, name: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * 
    *  
    * @param group   
    * @param name   
    * @param version  
    * @return File
    */
  def getPackage(group: String, name: String, version: String): ServiceCall[NotUsed ,File]
  
  /**
    * 
    * 
    *  
    * @param group   
    * @param name   
    * @param version  
    * @return String
    */
  def getPackageFilter(group: String, name: String, version: String): ServiceCall[NotUsed ,String]
        
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param pLimit   
    * @param `1property`   
    * @param `1propertyValue`  
    * @return String
    */
  def getQuery(`path`:String          ,pLimit:Number          ,`1property`:String          ,`1propertyValue`:String          ): ServiceCall[NotUsed ,String]
  
  /**
    * 
    * 
    * 
    * @return File
    */
  def getTruststore(): ServiceCall[NotUsed ,File]
  
  /**
    * 
    * 
    * 
    * @return TruststoreInfo
    */
  def getTruststoreInfo(): ServiceCall[NotUsed ,TruststoreInfo]
        
  // jcrcontentprotocolHTTPHeaders:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * 
    * 
    *  
    * @param runmode   
    * @param name   
    * @param jcrcontentcqdistribute  (optional) 
    * @param jcrcontentcqdistributeTypeHint  (optional) 
    * @param jcrcontentcqname  (optional) 
    * @param jcrcontentcqtemplate  (optional) 
    * @param jcrcontentenabled  (optional) 
    * @param jcrcontentjcrdescription  (optional) 
    * @param jcrcontentjcrlastModified  (optional) 
    * @param jcrcontentjcrlastModifiedBy  (optional) 
    * @param jcrcontentjcrmixinTypes  (optional) 
    * @param jcrcontentjcrtitle  (optional) 
    * @param jcrcontentlogLevel  (optional) 
    * @param jcrcontentnoStatusUpdate  (optional) 
    * @param jcrcontentnoVersioning  (optional) 
    * @param jcrcontentprotocolConnectTimeout  (optional) 
    * @param jcrcontentprotocolHTTPConnectionClosed  (optional) 
    * @param jcrcontentprotocolHTTPExpired  (optional) 
    * @param jcrcontentprotocolHTTPHeaders  (optional) 
    * @param jcrcontentprotocolHTTPHeadersTypeHint  (optional) 
    * @param jcrcontentprotocolHTTPMethod  (optional) 
    * @param jcrcontentprotocolHTTPSRelaxed  (optional) 
    * @param jcrcontentprotocolInterface  (optional) 
    * @param jcrcontentprotocolSocketTimeout  (optional) 
    * @param jcrcontentprotocolVersion  (optional) 
    * @param jcrcontentproxyNTLMDomain  (optional) 
    * @param jcrcontentproxyNTLMHost  (optional) 
    * @param jcrcontentproxyHost  (optional) 
    * @param jcrcontentproxyPassword  (optional) 
    * @param jcrcontentproxyPort  (optional) 
    * @param jcrcontentproxyUser  (optional) 
    * @param jcrcontentqueueBatchMaxSize  (optional) 
    * @param jcrcontentqueueBatchMode  (optional) 
    * @param jcrcontentqueueBatchWaitTime  (optional) 
    * @param jcrcontentretryDelay  (optional) 
    * @param jcrcontentreverseReplication  (optional) 
    * @param jcrcontentserializationType  (optional) 
    * @param jcrcontentslingresourceType  (optional) 
    * @param jcrcontentssl  (optional) 
    * @param jcrcontenttransportNTLMDomain  (optional) 
    * @param jcrcontenttransportNTLMHost  (optional) 
    * @param jcrcontenttransportPassword  (optional) 
    * @param jcrcontenttransportUri  (optional) 
    * @param jcrcontenttransportUser  (optional) 
    * @param jcrcontenttriggerDistribute  (optional) 
    * @param jcrcontenttriggerModified  (optional) 
    * @param jcrcontenttriggerOnOffTime  (optional) 
    * @param jcrcontenttriggerReceive  (optional) 
    * @param jcrcontenttriggerSpecific  (optional) 
    * @param jcrcontentuserId  (optional) 
    * @param jcrprimaryType  (optional) 
    * @param operation  (optional)
    * @return void
    */
  def postAgent(jcrcontentcqdistribute:           Option[Boolean] = None,jcrcontentcqdistributeTypeHint:           Option[String] = None,jcrcontentcqname:           Option[String] = None,jcrcontentcqtemplate:           Option[String] = None,jcrcontentenabled:           Option[Boolean] = None,jcrcontentjcrdescription:           Option[String] = None,jcrcontentjcrlastModified:           Option[String] = None,jcrcontentjcrlastModifiedBy:           Option[String] = None,jcrcontentjcrmixinTypes:           Option[String] = None,jcrcontentjcrtitle:           Option[String] = None,jcrcontentlogLevel:           Option[String] = None,jcrcontentnoStatusUpdate:           Option[Boolean] = None,jcrcontentnoVersioning:           Option[Boolean] = None,jcrcontentprotocolConnectTimeout:           Option[Number] = None,jcrcontentprotocolHTTPConnectionClosed:           Option[Boolean] = None,jcrcontentprotocolHTTPExpired:           Option[String] = None,jcrcontentprotocolHTTPHeadersTypeHint:           Option[String] = None,jcrcontentprotocolHTTPMethod:           Option[String] = None,jcrcontentprotocolHTTPSRelaxed:           Option[Boolean] = None,jcrcontentprotocolInterface:           Option[String] = None,jcrcontentprotocolSocketTimeout:           Option[Number] = None,jcrcontentprotocolVersion:           Option[String] = None,jcrcontentproxyNTLMDomain:           Option[String] = None,jcrcontentproxyNTLMHost:           Option[String] = None,jcrcontentproxyHost:           Option[String] = None,jcrcontentproxyPassword:           Option[String] = None,jcrcontentproxyPort:           Option[Number] = None,jcrcontentproxyUser:           Option[String] = None,jcrcontentqueueBatchMaxSize:           Option[Number] = None,jcrcontentqueueBatchMode:           Option[String] = None,jcrcontentqueueBatchWaitTime:           Option[Number] = None,jcrcontentretryDelay:           Option[String] = None,jcrcontentreverseReplication:           Option[Boolean] = None,jcrcontentserializationType:           Option[String] = None,jcrcontentslingresourceType:           Option[String] = None,jcrcontentssl:           Option[String] = None,jcrcontenttransportNTLMDomain:           Option[String] = None,jcrcontenttransportNTLMHost:           Option[String] = None,jcrcontenttransportPassword:           Option[String] = None,jcrcontenttransportUri:           Option[String] = None,jcrcontenttransportUser:           Option[String] = None,jcrcontenttriggerDistribute:           Option[Boolean] = None,jcrcontenttriggerModified:           Option[Boolean] = None,jcrcontenttriggerOnOffTime:           Option[Boolean] = None,jcrcontenttriggerReceive:           Option[Boolean] = None,jcrcontenttriggerSpecific:           Option[Boolean] = None,jcrcontentuserId:           Option[String] = None,jcrprimaryType:           Option[String] = None,operation:           Option[String] = Nonerunmode: String, name: String): ServiceCall[NotUsed ,Done]
        











  // certChain:File  -- not yet supported x-www-form-urlencoded
  // pk:File  -- not yet supported x-www-form-urlencoded
  // keyStore:File  -- not yet supported x-www-form-urlencoded
  /**
    * 
    * 
    *  
    * @param intermediatePath   
    * @param authorizableId   
    * @param operation  (optional) 
    * @param currentPassword  (optional) 
    * @param newPassword  (optional) 
    * @param rePassword  (optional) 
    * @param keyPassword  (optional) 
    * @param keyStorePass  (optional) 
    * @param alias  (optional) 
    * @param newAlias  (optional) 
    * @param removeAlias  (optional) 
    * @param certChain  (optional) 
    * @param pk  (optional) 
    * @param keyStore  (optional)
    * @return KeystoreInfo
    */
  def postAuthorizableKeystore(operation:           Option[String] = None,currentPassword:           Option[String] = None,newPassword:           Option[String] = None,rePassword:           Option[String] = None,keyPassword:           Option[String] = None,keyStorePass:           Option[String] = None,alias:           Option[String] = None,newAlias:           Option[String] = None,removeAlias:           Option[String] = NoneintermediatePath: String, authorizableId: String): ServiceCall[NotUsed ,KeystoreInfo]
        
  /**
    * 
    * 
    *  
    * @param authorizableId   
    * @param intermediatePath   
    * @param createUser  (optional) 
    * @param createGroup  (optional) 
    * @param reppassword  (optional) 
    * @param profilegivenName  (optional)
    * @return String
    */
  def postAuthorizables(authorizableId:String          ,intermediatePath:String          ,createUser:           Option[String] = None,createGroup:           Option[String] = None,reppassword:           Option[String] = None,profilegivenName:           Option[String] = None): ServiceCall[NotUsed ,String]
        
  // defaultGroups:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // `path`:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  // synchronizeAttributes:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * 
    * 
    *  
    * @param keyStorePassword  (optional) 
    * @param keyStorePasswordTypeHint  (optional) 
    * @param serviceRanking  (optional) 
    * @param serviceRankingTypeHint  (optional) 
    * @param idpHttpRedirect  (optional) 
    * @param idpHttpRedirectTypeHint  (optional) 
    * @param createUser  (optional) 
    * @param createUserTypeHint  (optional) 
    * @param defaultRedirectUrl  (optional) 
    * @param defaultRedirectUrlTypeHint  (optional) 
    * @param userIDAttribute  (optional) 
    * @param userIDAttributeTypeHint  (optional) 
    * @param defaultGroups  (optional) 
    * @param defaultGroupsTypeHint  (optional) 
    * @param idpCertAlias  (optional) 
    * @param idpCertAliasTypeHint  (optional) 
    * @param addGroupMemberships  (optional) 
    * @param addGroupMembershipsTypeHint  (optional) 
    * @param `path`  (optional) 
    * @param pathTypeHint  (optional) 
    * @param synchronizeAttributes  (optional) 
    * @param synchronizeAttributesTypeHint  (optional) 
    * @param clockTolerance  (optional) 
    * @param clockToleranceTypeHint  (optional) 
    * @param groupMembershipAttribute  (optional) 
    * @param groupMembershipAttributeTypeHint  (optional) 
    * @param idpUrl  (optional) 
    * @param idpUrlTypeHint  (optional) 
    * @param logoutUrl  (optional) 
    * @param logoutUrlTypeHint  (optional) 
    * @param serviceProviderEntityId  (optional) 
    * @param serviceProviderEntityIdTypeHint  (optional) 
    * @param assertionConsumerServiceURL  (optional) 
    * @param assertionConsumerServiceURLTypeHint  (optional) 
    * @param handleLogout  (optional) 
    * @param handleLogoutTypeHint  (optional) 
    * @param spPrivateKeyAlias  (optional) 
    * @param spPrivateKeyAliasTypeHint  (optional) 
    * @param useEncryption  (optional) 
    * @param useEncryptionTypeHint  (optional) 
    * @param nameIdFormat  (optional) 
    * @param nameIdFormatTypeHint  (optional) 
    * @param digestMethod  (optional) 
    * @param digestMethodTypeHint  (optional) 
    * @param signatureMethod  (optional) 
    * @param signatureMethodTypeHint  (optional) 
    * @param userIntermediatePath  (optional) 
    * @param userIntermediatePathTypeHint  (optional)
    * @return void
    */
  def postConfigAdobeGraniteSamlAuthenticationHandler(keyStorePassword:           Option[String] = None,keyStorePasswordTypeHint:           Option[String] = None,serviceRanking:           Option[Int] = None,serviceRankingTypeHint:           Option[String] = None,idpHttpRedirect:           Option[Boolean] = None,idpHttpRedirectTypeHint:           Option[String] = None,createUser:           Option[Boolean] = None,createUserTypeHint:           Option[String] = None,defaultRedirectUrl:           Option[String] = None,defaultRedirectUrlTypeHint:           Option[String] = None,userIDAttribute:           Option[String] = None,userIDAttributeTypeHint:           Option[String] = None,defaultGroupsTypeHint:           Option[String] = None,idpCertAlias:           Option[String] = None,idpCertAliasTypeHint:           Option[String] = None,addGroupMemberships:           Option[Boolean] = None,addGroupMembershipsTypeHint:           Option[String] = None,pathTypeHint:           Option[String] = None,synchronizeAttributesTypeHint:           Option[String] = None,clockTolerance:           Option[Int] = None,clockToleranceTypeHint:           Option[String] = None,groupMembershipAttribute:           Option[String] = None,groupMembershipAttributeTypeHint:           Option[String] = None,idpUrl:           Option[String] = None,idpUrlTypeHint:           Option[String] = None,logoutUrl:           Option[String] = None,logoutUrlTypeHint:           Option[String] = None,serviceProviderEntityId:           Option[String] = None,serviceProviderEntityIdTypeHint:           Option[String] = None,assertionConsumerServiceURL:           Option[String] = None,assertionConsumerServiceURLTypeHint:           Option[String] = None,handleLogout:           Option[Boolean] = None,handleLogoutTypeHint:           Option[String] = None,spPrivateKeyAlias:           Option[String] = None,spPrivateKeyAliasTypeHint:           Option[String] = None,useEncryption:           Option[Boolean] = None,useEncryptionTypeHint:           Option[String] = None,nameIdFormat:           Option[String] = None,nameIdFormatTypeHint:           Option[String] = None,digestMethod:           Option[String] = None,digestMethodTypeHint:           Option[String] = None,signatureMethod:           Option[String] = None,signatureMethodTypeHint:           Option[String] = None,userIntermediatePath:           Option[String] = None,userIntermediatePathTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param orgApacheFelixHttpsNio  (optional) 
    * @param orgApacheFelixHttpsNioTypeHint  (optional) 
    * @param orgApacheFelixHttpsKeystore  (optional) 
    * @param orgApacheFelixHttpsKeystoreTypeHint  (optional) 
    * @param orgApacheFelixHttpsKeystorePassword  (optional) 
    * @param orgApacheFelixHttpsKeystorePasswordTypeHint  (optional) 
    * @param orgApacheFelixHttpsKeystoreKey  (optional) 
    * @param orgApacheFelixHttpsKeystoreKeyTypeHint  (optional) 
    * @param orgApacheFelixHttpsKeystoreKeyPassword  (optional) 
    * @param orgApacheFelixHttpsKeystoreKeyPasswordTypeHint  (optional) 
    * @param orgApacheFelixHttpsTruststore  (optional) 
    * @param orgApacheFelixHttpsTruststoreTypeHint  (optional) 
    * @param orgApacheFelixHttpsTruststorePassword  (optional) 
    * @param orgApacheFelixHttpsTruststorePasswordTypeHint  (optional) 
    * @param orgApacheFelixHttpsClientcertificate  (optional) 
    * @param orgApacheFelixHttpsClientcertificateTypeHint  (optional) 
    * @param orgApacheFelixHttpsEnable  (optional) 
    * @param orgApacheFelixHttpsEnableTypeHint  (optional) 
    * @param orgOsgiServiceHttpPortSecure  (optional) 
    * @param orgOsgiServiceHttpPortSecureTypeHint  (optional)
    * @return void
    */
  def postConfigApacheFelixJettyBasedHttpService(orgApacheFelixHttpsNio:           Option[Boolean] = None,orgApacheFelixHttpsNioTypeHint:           Option[String] = None,orgApacheFelixHttpsKeystore:           Option[String] = None,orgApacheFelixHttpsKeystoreTypeHint:           Option[String] = None,orgApacheFelixHttpsKeystorePassword:           Option[String] = None,orgApacheFelixHttpsKeystorePasswordTypeHint:           Option[String] = None,orgApacheFelixHttpsKeystoreKey:           Option[String] = None,orgApacheFelixHttpsKeystoreKeyTypeHint:           Option[String] = None,orgApacheFelixHttpsKeystoreKeyPassword:           Option[String] = None,orgApacheFelixHttpsKeystoreKeyPasswordTypeHint:           Option[String] = None,orgApacheFelixHttpsTruststore:           Option[String] = None,orgApacheFelixHttpsTruststoreTypeHint:           Option[String] = None,orgApacheFelixHttpsTruststorePassword:           Option[String] = None,orgApacheFelixHttpsTruststorePasswordTypeHint:           Option[String] = None,orgApacheFelixHttpsClientcertificate:           Option[String] = None,orgApacheFelixHttpsClientcertificateTypeHint:           Option[String] = None,orgApacheFelixHttpsEnable:           Option[Boolean] = None,orgApacheFelixHttpsEnableTypeHint:           Option[String] = None,orgOsgiServiceHttpPortSecure:           Option[String] = None,orgOsgiServiceHttpPortSecureTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        
  // proxyExceptions:Seq[String]  -- not yet supported Seq PathParamSerializers for multi value query parameters https://github.com/lagom/lagom/issues/643
      
  /**
    * 
    * 
    *  
    * @param proxyHost  (optional) 
    * @param proxyHostTypeHint  (optional) 
    * @param proxyPort  (optional) 
    * @param proxyPortTypeHint  (optional) 
    * @param proxyExceptions  (optional) 
    * @param proxyExceptionsTypeHint  (optional) 
    * @param proxyEnabled  (optional) 
    * @param proxyEnabledTypeHint  (optional) 
    * @param proxyUser  (optional) 
    * @param proxyUserTypeHint  (optional) 
    * @param proxyPassword  (optional) 
    * @param proxyPasswordTypeHint  (optional)
    * @return void
    */
  def postConfigApacheHttpComponentsProxyConfiguration(proxyHost:           Option[String] = None,proxyHostTypeHint:           Option[String] = None,proxyPort:           Option[Int] = None,proxyPortTypeHint:           Option[String] = None,proxyExceptionsTypeHint:           Option[String] = None,proxyEnabled:           Option[Boolean] = None,proxyEnabledTypeHint:           Option[String] = None,proxyUser:           Option[String] = None,proxyUserTypeHint:           Option[String] = None,proxyPassword:           Option[String] = None,proxyPasswordTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param alias  (optional) 
    * @param aliasTypeHint  (optional) 
    * @param davCreateAbsoluteUri  (optional) 
    * @param davCreateAbsoluteUriTypeHint  (optional)
    * @return void
    */
  def postConfigApacheSlingDavExServlet(alias:           Option[String] = None,aliasTypeHint:           Option[String] = None,davCreateAbsoluteUri:           Option[Boolean] = None,davCreateAbsoluteUriTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param jsonMaximumresults  (optional) 
    * @param jsonMaximumresultsTypeHint  (optional) 
    * @param enableHtml  (optional) 
    * @param enableHtmlTypeHint  (optional) 
    * @param enableTxt  (optional) 
    * @param enableTxtTypeHint  (optional) 
    * @param enableXml  (optional) 
    * @param enableXmlTypeHint  (optional)
    * @return void
    */
  def postConfigApacheSlingGetServlet(jsonMaximumresults:           Option[String] = None,jsonMaximumresultsTypeHint:           Option[String] = None,enableHtml:           Option[Boolean] = None,enableHtmlTypeHint:           Option[String] = None,enableTxt:           Option[Boolean] = None,enableTxtTypeHint:           Option[String] = None,enableXml:           Option[Boolean] = None,enableXmlTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param allowEmpty  (optional) 
    * @param allowEmptyTypeHint  (optional) 
    * @param allowHosts  (optional) 
    * @param allowHostsTypeHint  (optional) 
    * @param allowHostsRegexp  (optional) 
    * @param allowHostsRegexpTypeHint  (optional) 
    * @param filterMethods  (optional) 
    * @param filterMethodsTypeHint  (optional)
    * @return void
    */
  def postConfigApacheSlingReferrerFilter(allowEmpty:           Option[Boolean] = None,allowEmptyTypeHint:           Option[String] = None,allowHosts:           Option[String] = None,allowHostsTypeHint:           Option[String] = None,allowHostsRegexp:           Option[String] = None,allowHostsRegexpTypeHint:           Option[String] = None,filterMethods:           Option[String] = None,filterMethodsTypeHint:           Option[String] = None): ServiceCall[NotUsed ,Done]
        




  // file:File  -- not yet supported x-www-form-urlencoded
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param name   
    * @param operation  (optional) 
    * @param deleteAuthorizable  (optional) 
    * @param file  (optional)
    * @return void
    */
  def postNode(operation:           Option[String] = None,deleteAuthorizable:           Option[String] = None`path`: String, name: String): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param name   
    * @param addMembers  (optional)
    * @return void
    */
  def postNodeRw(addMembers:           Option[String] = None`path`: String, name: String): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param jcrprimaryType   
    * @param name  
    * @return void
    */
  def postPath(jcrprimaryType:String          ,name:String          `path`: String): ServiceCall[NotUsed ,Done]
        
  /**
    * 
    * 
    *  
    * @param `path`   
    * @param pLimit   
    * @param `1property`   
    * @param `1propertyValue`  
    * @return String
    */
  def postQuery(`path`:String          ,pLimit:Number          ,`1property`:String          ,`1propertyValue`:String          ): ServiceCall[NotUsed ,String]
        
  /**
    * 
    * 
    *  
    * @param ignoredeactivated   
    * @param onlymodified   
    * @param `path`  
    * @return void
    */
  def postTreeActivation(ignoredeactivated:Boolean          ,onlymodified:Boolean          ,`path`:String          ): ServiceCall[NotUsed ,Done]
        





  // certificate:File  -- not yet supported x-www-form-urlencoded
  /**
    * 
    * 
    *  
    * @param operation  (optional) 
    * @param newPassword  (optional) 
    * @param rePassword  (optional) 
    * @param keyStoreType  (optional) 
    * @param removeAlias  (optional) 
    * @param certificate  (optional)
    * @return String
    */
  def postTruststore(operation:           Option[String] = None,newPassword:           Option[String] = None,rePassword:           Option[String] = None,keyStoreType:           Option[String] = None,removeAlias:           Option[String] = None): ServiceCall[NotUsed ,String]
  
  // truststoreP12:File  -- not yet supported x-www-form-urlencoded
  /**
    * 
    * 
    *  
    * @param truststoreP12  (optional)
    * @return String
    */
  def postTruststorePKCS12(): ServiceCall[NotUsed ,String]
  

  }
