#import <Foundation/Foundation.h>
#import "OAISamlConfigurationInfo.h"
#import "OAIApi.h"

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



@interface OAIConsoleApi: NSObject <OAIApi>

extern NSString* kOAIConsoleApiErrorDomain;
extern NSInteger kOAIConsoleApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// 
///  code:0 message:"Default response"
///
/// @return NSArray<NSString*>*
-(NSURLSessionTask*) getAemProductInfoWithCompletionHandler: 
    (void (^)(NSArray<NSString*>* output, NSError* error)) handler;


/// 
/// 
///
/// 
///  code:200 message:"OK",
///  code:5XX message:"Unexpected error."
///
/// @return NSString*
-(NSURLSessionTask*) getConfigMgrWithCompletionHandler: 
    (void (^)(NSString* output, NSError* error)) handler;


/// 
/// 
///
/// @param name 
/// @param action 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postBundleWithName: (NSString*) name
    action: (NSString*) action
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param action 
/// 
///  code:0 message:"Default response"
///
/// @return void
-(NSURLSessionTask*) postJmxRepositoryWithAction: (NSString*) action
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param post  (optional)
/// @param apply  (optional)
/// @param delete  (optional)
/// @param action  (optional)
/// @param location  (optional)
/// @param path  (optional)
/// @param serviceRanking  (optional)
/// @param idpUrl  (optional)
/// @param idpCertAlias  (optional)
/// @param idpHttpRedirect  (optional)
/// @param serviceProviderEntityId  (optional)
/// @param assertionConsumerServiceURL  (optional)
/// @param spPrivateKeyAlias  (optional)
/// @param keyStorePassword  (optional)
/// @param defaultRedirectUrl  (optional)
/// @param userIDAttribute  (optional)
/// @param useEncryption  (optional)
/// @param createUser  (optional)
/// @param addGroupMemberships  (optional)
/// @param groupMembershipAttribute  (optional)
/// @param defaultGroups  (optional)
/// @param nameIdFormat  (optional)
/// @param synchronizeAttributes  (optional)
/// @param handleLogout  (optional)
/// @param logoutUrl  (optional)
/// @param clockTolerance  (optional)
/// @param digestMethod  (optional)
/// @param signatureMethod  (optional)
/// @param userIntermediatePath  (optional)
/// @param propertylist  (optional)
/// 
///  code:200 message:"Retrieved AEM SAML Configuration",
///  code:302 message:"Default response",
///  code:0 message:"Default response"
///
/// @return OAISamlConfigurationInfo*
-(NSURLSessionTask*) postSamlConfigurationWithPost: (NSNumber*) post
    apply: (NSNumber*) apply
    delete: (NSNumber*) delete
    action: (NSString*) action
    location: (NSString*) location
    path: (NSArray<NSString*>*) path
    serviceRanking: (NSNumber*) serviceRanking
    idpUrl: (NSString*) idpUrl
    idpCertAlias: (NSString*) idpCertAlias
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    keyStorePassword: (NSString*) keyStorePassword
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    userIDAttribute: (NSString*) userIDAttribute
    useEncryption: (NSNumber*) useEncryption
    createUser: (NSNumber*) createUser
    addGroupMemberships: (NSNumber*) addGroupMemberships
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    nameIdFormat: (NSString*) nameIdFormat
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    handleLogout: (NSNumber*) handleLogout
    logoutUrl: (NSString*) logoutUrl
    clockTolerance: (NSNumber*) clockTolerance
    digestMethod: (NSString*) digestMethod
    signatureMethod: (NSString*) signatureMethod
    userIntermediatePath: (NSString*) userIntermediatePath
    propertylist: (NSArray<NSString*>*) propertylist
    completionHandler: (void (^)(OAISamlConfigurationInfo* output, NSError* error)) handler;



@end