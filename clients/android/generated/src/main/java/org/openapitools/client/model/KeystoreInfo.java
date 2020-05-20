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

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.KeystoreItems;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class KeystoreInfo {
  
  @SerializedName("aliases")
  private List<KeystoreItems> aliases = null;
  @SerializedName("exists")
  private Boolean exists = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<KeystoreItems> getAliases() {
    return aliases;
  }
  public void setAliases(List<KeystoreItems> aliases) {
    this.aliases = aliases;
  }

  /**
   * False if truststore don't exist
   **/
  @ApiModelProperty(value = "False if truststore don't exist")
  public Boolean getExists() {
    return exists;
  }
  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreInfo keystoreInfo = (KeystoreInfo) o;
    return (this.aliases == null ? keystoreInfo.aliases == null : this.aliases.equals(keystoreInfo.aliases)) &&
        (this.exists == null ? keystoreInfo.exists == null : this.exists.equals(keystoreInfo.exists));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aliases == null ? 0: this.aliases.hashCode());
    result = 31 * result + (this.exists == null ? 0: this.exists.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreInfo {\n");
    
    sb.append("  aliases: ").append(aliases).append("\n");
    sb.append("  exists: ").append(exists).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}