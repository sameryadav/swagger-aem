# Adobe Experience Manager (AEM) API
#
# Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
#
# OpenAPI spec version: 3.2.0-pre.0
# Contact: opensource@shinesolutions.com
# Generated by: https://openapi-generator.tech


#' InstallStatus Class
#'
#' @field status 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InstallStatus <- R6::R6Class(
  'InstallStatus',
  public = list(
    `status` = NULL,
    initialize = function(`status`){
      if (!missing(`status`)) {
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    toJSON = function() {
      InstallStatusObject <- list()
      if (!is.null(self$`status`)) {
        InstallStatusObject[['status']] <- self$`status`$toJSON()
      }

      InstallStatusObject
    },
    fromJSON = function(InstallStatusJson) {
      InstallStatusObject <- jsonlite::fromJSON(InstallStatusJson)
      if (!is.null(InstallStatusObject$`status`)) {
        statusObject <- InstallStatusStatus$new()
        statusObject$fromJSON(jsonlite::toJSON(InstallStatusObject$status, auto_unbox = TRUE))
        self$`status` <- statusObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "status": %s
        }',
        self$`status`$toJSON()
      )
    },
    fromJSONString = function(InstallStatusJson) {
      InstallStatusObject <- jsonlite::fromJSON(InstallStatusJson)
      InstallStatusStatusObject <- InstallStatusStatus$new()
      self$`status` <- InstallStatusStatusObject$fromJSON(jsonlite::toJSON(InstallStatusObject$status, auto_unbox = TRUE))
    }
  )
)
