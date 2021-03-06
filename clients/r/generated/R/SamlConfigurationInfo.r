# Adobe Experience Manager (AEM) API
#
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
#
# OpenAPI spec version: 3.2.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' SamlConfigurationInfo Class
#'
#' @field pid 
#' @field title 
#' @field description 
#' @field bundle_location 
#' @field service_location 
#' @field properties 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SamlConfigurationInfo <- R6::R6Class(
  'SamlConfigurationInfo',
  public = list(
    `pid` = NULL,
    `title` = NULL,
    `description` = NULL,
    `bundle_location` = NULL,
    `service_location` = NULL,
    `properties` = NULL,
    initialize = function(`pid`, `title`, `description`, `bundle_location`, `service_location`, `properties`){
      if (!missing(`pid`)) {
        stopifnot(is.character(`pid`), length(`pid`) == 1)
        self$`pid` <- `pid`
      }
      if (!missing(`title`)) {
        stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`bundle_location`)) {
        stopifnot(is.character(`bundle_location`), length(`bundle_location`) == 1)
        self$`bundle_location` <- `bundle_location`
      }
      if (!missing(`service_location`)) {
        stopifnot(is.character(`service_location`), length(`service_location`) == 1)
        self$`service_location` <- `service_location`
      }
      if (!missing(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
      }
    },
    toJSON = function() {
      SamlConfigurationInfoObject <- list()
      if (!is.null(self$`pid`)) {
        SamlConfigurationInfoObject[['pid']] <- self$`pid`
      }
      if (!is.null(self$`title`)) {
        SamlConfigurationInfoObject[['title']] <- self$`title`
      }
      if (!is.null(self$`description`)) {
        SamlConfigurationInfoObject[['description']] <- self$`description`
      }
      if (!is.null(self$`bundle_location`)) {
        SamlConfigurationInfoObject[['bundle_location']] <- self$`bundle_location`
      }
      if (!is.null(self$`service_location`)) {
        SamlConfigurationInfoObject[['service_location']] <- self$`service_location`
      }
      if (!is.null(self$`properties`)) {
        SamlConfigurationInfoObject[['properties']] <- self$`properties`$toJSON()
      }

      SamlConfigurationInfoObject
    },
    fromJSON = function(SamlConfigurationInfoJson) {
      SamlConfigurationInfoObject <- jsonlite::fromJSON(SamlConfigurationInfoJson)
      if (!is.null(SamlConfigurationInfoObject$`pid`)) {
        self$`pid` <- SamlConfigurationInfoObject$`pid`
      }
      if (!is.null(SamlConfigurationInfoObject$`title`)) {
        self$`title` <- SamlConfigurationInfoObject$`title`
      }
      if (!is.null(SamlConfigurationInfoObject$`description`)) {
        self$`description` <- SamlConfigurationInfoObject$`description`
      }
      if (!is.null(SamlConfigurationInfoObject$`bundle_location`)) {
        self$`bundle_location` <- SamlConfigurationInfoObject$`bundle_location`
      }
      if (!is.null(SamlConfigurationInfoObject$`service_location`)) {
        self$`service_location` <- SamlConfigurationInfoObject$`service_location`
      }
      if (!is.null(SamlConfigurationInfoObject$`properties`)) {
        propertiesObject <- SamlConfigurationProperties$new()
        propertiesObject$fromJSON(jsonlite::toJSON(SamlConfigurationInfoObject$properties, auto_unbox = TRUE))
        self$`properties` <- propertiesObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "pid": %s,
           "title": %s,
           "description": %s,
           "bundle_location": %s,
           "service_location": %s,
           "properties": %s
        }',
        self$`pid`,
        self$`title`,
        self$`description`,
        self$`bundle_location`,
        self$`service_location`,
        self$`properties`$toJSON()
      )
    },
    fromJSONString = function(SamlConfigurationInfoJson) {
      SamlConfigurationInfoObject <- jsonlite::fromJSON(SamlConfigurationInfoJson)
      self$`pid` <- SamlConfigurationInfoObject$`pid`
      self$`title` <- SamlConfigurationInfoObject$`title`
      self$`description` <- SamlConfigurationInfoObject$`description`
      self$`bundle_location` <- SamlConfigurationInfoObject$`bundle_location`
      self$`service_location` <- SamlConfigurationInfoObject$`service_location`
      SamlConfigurationPropertiesObject <- SamlConfigurationProperties$new()
      self$`properties` <- SamlConfigurationPropertiesObject$fromJSON(jsonlite::toJSON(SamlConfigurationInfoObject$properties, auto_unbox = TRUE))
    }
  )
)
