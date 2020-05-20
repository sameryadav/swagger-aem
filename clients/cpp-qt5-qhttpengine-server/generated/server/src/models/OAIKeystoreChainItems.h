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

/*
 * OAIKeystoreChainItems.h
 *
 * 
 */

#ifndef OAIKeystoreChainItems_H
#define OAIKeystoreChainItems_H

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIKeystoreChainItems: public OAIObject {
public:
    OAIKeystoreChainItems();
    OAIKeystoreChainItems(QString json);
    ~OAIKeystoreChainItems() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getSubject() const;
    void setSubject(const QString &subject);

    QString getIssuer() const;
    void setIssuer(const QString &issuer);

    QString getNotBefore() const;
    void setNotBefore(const QString &not_before);

    QString getNotAfter() const;
    void setNotAfter(const QString &not_after);

    qint32 getSerialNumber() const;
    void setSerialNumber(const qint32 &serial_number);

    virtual bool isSet() const override;

private:
    QString subject;
    bool m_subject_isSet;

    QString issuer;
    bool m_issuer_isSet;

    QString not_before;
    bool m_not_before_isSet;

    QString not_after;
    bool m_not_after_isSet;

    qint32 serial_number;
    bool m_serial_number_isSet;

};

}

#endif // OAIKeystoreChainItems_H