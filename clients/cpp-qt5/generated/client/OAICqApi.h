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

#ifndef _OAI_OAICqApi_H_
#define _OAI_OAICqApi_H_

#include "OAIHttpRequest.h"

#include <QString>

#include <QObject>

namespace OpenAPI {

class OAICqApi: public QObject {
    Q_OBJECT

public:
    OAICqApi();
    OAICqApi(QString host, QString basePath);
    ~OAICqApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void getLoginPage();
    void postCqActions(QString* authorizable_id, QString* changelog);
    
private:
    void getLoginPageCallback (OAIHttpRequestWorker * worker);
    void postCqActionsCallback (OAIHttpRequestWorker * worker);
    
signals:
    void getLoginPageSignal(QString* summary);
    void postCqActionsSignal();
    
    void getLoginPageSignalE(QString* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void postCqActionsSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void getLoginPageSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void postCqActionsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif
