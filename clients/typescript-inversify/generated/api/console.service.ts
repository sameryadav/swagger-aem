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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import IHttpClient from "../IHttpClient";
import { inject, injectable } from "inversify";
import { IAPIConfiguration } from "../IAPIConfiguration";
import { Headers } from "../Headers";
import HttpResponse from "../HttpResponse";

import { SamlConfigurationInfo } from '../model/samlConfigurationInfo';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class ConsoleService {
    private basePath: string = 'http://localhost';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * 
     * 
     
     */
    public getAemProductInfo(observe?: 'body', headers?: Headers): Observable<Array<string>>;
    public getAemProductInfo(observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<string>>>;
    public getAemProductInfo(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<string>>> = this.httpClient.get(`${this.basePath}/system/console/status-productinfo.json`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Array<string>>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     
     */
    public getConfigMgr(observe?: 'body', headers?: Headers): Observable<string>;
    public getConfigMgr(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public getConfigMgr(observe: any = 'body', headers: Headers = {}): Observable<any> {
        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'text/xml';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/system/console/configMgr`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <string>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param name 
     * @param action 
     
     */
    public postBundle(name: string, action: string, observe?: 'body', headers?: Headers): Observable<any>;
    public postBundle(name: string, action: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public postBundle(name: string, action: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!name){
            throw new Error('Required parameter name was null or undefined when calling postBundle.');
        }

        if (!action){
            throw new Error('Required parameter action was null or undefined when calling postBundle.');
        }

        let queryParameters: string[] = [];
        if (action !== undefined) {
            queryParameters.push("action="+encodeURIComponent(String(action)));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/system/console/bundles/${encodeURIComponent(String(name))}?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param action 
     
     */
    public postJmxRepository(action: string, observe?: 'body', headers?: Headers): Observable<any>;
    public postJmxRepository(action: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public postJmxRepository(action: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!action){
            throw new Error('Required parameter action was null or undefined when calling postJmxRepository.');
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/system/console/jmx/com.adobe.granite:type=Repository/op/${encodeURIComponent(String(action))}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param post 
     * @param apply 
     * @param _delete 
     * @param action 
     * @param $location 
     * @param path 
     * @param serviceRanking 
     * @param idpUrl 
     * @param idpCertAlias 
     * @param idpHttpRedirect 
     * @param serviceProviderEntityId 
     * @param assertionConsumerServiceURL 
     * @param spPrivateKeyAlias 
     * @param keyStorePassword 
     * @param defaultRedirectUrl 
     * @param userIDAttribute 
     * @param useEncryption 
     * @param createUser 
     * @param addGroupMemberships 
     * @param groupMembershipAttribute 
     * @param defaultGroups 
     * @param nameIdFormat 
     * @param synchronizeAttributes 
     * @param handleLogout 
     * @param logoutUrl 
     * @param clockTolerance 
     * @param digestMethod 
     * @param signatureMethod 
     * @param userIntermediatePath 
     * @param propertylist 
     
     */
    public postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, $location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, observe?: 'body', headers?: Headers): Observable<SamlConfigurationInfo>;
    public postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, $location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, observe?: 'response', headers?: Headers): Observable<HttpResponse<SamlConfigurationInfo>>;
    public postSamlConfiguration(post?: boolean, apply?: boolean, _delete?: boolean, action?: string, $location?: string, path?: Array<string>, serviceRanking?: number, idpUrl?: string, idpCertAlias?: string, idpHttpRedirect?: boolean, serviceProviderEntityId?: string, assertionConsumerServiceURL?: string, spPrivateKeyAlias?: string, keyStorePassword?: string, defaultRedirectUrl?: string, userIDAttribute?: string, useEncryption?: boolean, createUser?: boolean, addGroupMemberships?: boolean, groupMembershipAttribute?: string, defaultGroups?: Array<string>, nameIdFormat?: string, synchronizeAttributes?: Array<string>, handleLogout?: boolean, logoutUrl?: string, clockTolerance?: number, digestMethod?: string, signatureMethod?: string, userIntermediatePath?: string, propertylist?: Array<string>, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (post !== undefined) {
            queryParameters.push("post="+encodeURIComponent(String(post)));
        }
        if (apply !== undefined) {
            queryParameters.push("apply="+encodeURIComponent(String(apply)));
        }
        if (_delete !== undefined) {
            queryParameters.push("_delete="+encodeURIComponent(String(_delete)));
        }
        if (action !== undefined) {
            queryParameters.push("action="+encodeURIComponent(String(action)));
        }
        if ($location !== undefined) {
            queryParameters.push("$location="+encodeURIComponent(String($location)));
        }
        if (path) {
            path.forEach((element) => {
                queryParameters.push("path="+encodeURIComponent(String(path)));
            })
        }
        if (serviceRanking !== undefined) {
            queryParameters.push("serviceRanking="+encodeURIComponent(String(serviceRanking)));
        }
        if (idpUrl !== undefined) {
            queryParameters.push("idpUrl="+encodeURIComponent(String(idpUrl)));
        }
        if (idpCertAlias !== undefined) {
            queryParameters.push("idpCertAlias="+encodeURIComponent(String(idpCertAlias)));
        }
        if (idpHttpRedirect !== undefined) {
            queryParameters.push("idpHttpRedirect="+encodeURIComponent(String(idpHttpRedirect)));
        }
        if (serviceProviderEntityId !== undefined) {
            queryParameters.push("serviceProviderEntityId="+encodeURIComponent(String(serviceProviderEntityId)));
        }
        if (assertionConsumerServiceURL !== undefined) {
            queryParameters.push("assertionConsumerServiceURL="+encodeURIComponent(String(assertionConsumerServiceURL)));
        }
        if (spPrivateKeyAlias !== undefined) {
            queryParameters.push("spPrivateKeyAlias="+encodeURIComponent(String(spPrivateKeyAlias)));
        }
        if (keyStorePassword !== undefined) {
            queryParameters.push("keyStorePassword="+encodeURIComponent(String(keyStorePassword)));
        }
        if (defaultRedirectUrl !== undefined) {
            queryParameters.push("defaultRedirectUrl="+encodeURIComponent(String(defaultRedirectUrl)));
        }
        if (userIDAttribute !== undefined) {
            queryParameters.push("userIDAttribute="+encodeURIComponent(String(userIDAttribute)));
        }
        if (useEncryption !== undefined) {
            queryParameters.push("useEncryption="+encodeURIComponent(String(useEncryption)));
        }
        if (createUser !== undefined) {
            queryParameters.push("createUser="+encodeURIComponent(String(createUser)));
        }
        if (addGroupMemberships !== undefined) {
            queryParameters.push("addGroupMemberships="+encodeURIComponent(String(addGroupMemberships)));
        }
        if (groupMembershipAttribute !== undefined) {
            queryParameters.push("groupMembershipAttribute="+encodeURIComponent(String(groupMembershipAttribute)));
        }
        if (defaultGroups) {
            defaultGroups.forEach((element) => {
                queryParameters.push("defaultGroups="+encodeURIComponent(String(defaultGroups)));
            })
        }
        if (nameIdFormat !== undefined) {
            queryParameters.push("nameIdFormat="+encodeURIComponent(String(nameIdFormat)));
        }
        if (synchronizeAttributes) {
            synchronizeAttributes.forEach((element) => {
                queryParameters.push("synchronizeAttributes="+encodeURIComponent(String(synchronizeAttributes)));
            })
        }
        if (handleLogout !== undefined) {
            queryParameters.push("handleLogout="+encodeURIComponent(String(handleLogout)));
        }
        if (logoutUrl !== undefined) {
            queryParameters.push("logoutUrl="+encodeURIComponent(String(logoutUrl)));
        }
        if (clockTolerance !== undefined) {
            queryParameters.push("clockTolerance="+encodeURIComponent(String(clockTolerance)));
        }
        if (digestMethod !== undefined) {
            queryParameters.push("digestMethod="+encodeURIComponent(String(digestMethod)));
        }
        if (signatureMethod !== undefined) {
            queryParameters.push("signatureMethod="+encodeURIComponent(String(signatureMethod)));
        }
        if (userIntermediatePath !== undefined) {
            queryParameters.push("userIntermediatePath="+encodeURIComponent(String(userIntermediatePath)));
        }
        if (propertylist) {
            queryParameters.push("propertylist="+encodeURIComponent(propertylist.join(COLLECTION_FORMATS['csv'])));
        }

        // authentication (aemAuth) required
        if (this.APIConfiguration.username || this.APIConfiguration.password) {
            headers['Authorization'] = btoa(this.APIConfiguration.username + ':' + this.APIConfiguration.password);
        }
        headers['Accept'] = 'text/plain';

        const response: Observable<HttpResponse<SamlConfigurationInfo>> = this.httpClient.post(`${this.basePath}/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler?${queryParameters.join('&')}`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <SamlConfigurationInfo>(httpResponse.response));
        }
        return response;
    }

}