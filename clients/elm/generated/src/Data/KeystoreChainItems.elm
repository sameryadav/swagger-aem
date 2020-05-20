{-
   Adobe Experience Manager (AEM) API
   Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API

   OpenAPI spec version: 3.2.0-pre.0
   Contact: opensource@shinesolutions.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Data.KeystoreChainItems exposing (KeystoreChainItems, keystoreChainItemsDecoder, keystoreChainItemsEncoder)

import Json.Decode as Decode exposing (Decoder)
import Json.Decode.Pipeline exposing (decode, optional, required)
import Json.Encode as Encode
import Maybe exposing (map, withDefault)


type alias KeystoreChainItems =
    { subject : Maybe String
    , issuer : Maybe String
    , notBefore : Maybe String
    , notAfter : Maybe String
    , serialNumber : Maybe Int
    }


keystoreChainItemsDecoder : Decoder KeystoreChainItems
keystoreChainItemsDecoder =
    decode KeystoreChainItems
        |> optional "subject" (Decode.nullable Decode.string) Nothing
        |> optional "issuer" (Decode.nullable Decode.string) Nothing
        |> optional "notBefore" (Decode.nullable Decode.string) Nothing
        |> optional "notAfter" (Decode.nullable Decode.string) Nothing
        |> optional "serialNumber" (Decode.nullable Decode.int) Nothing



keystoreChainItemsEncoder : KeystoreChainItems -> Encode.Value
keystoreChainItemsEncoder model =
    Encode.object
        [ ( "subject", withDefault Encode.null (map Encode.string model.subject) )
        , ( "issuer", withDefault Encode.null (map Encode.string model.issuer) )
        , ( "notBefore", withDefault Encode.null (map Encode.string model.notBefore) )
        , ( "notAfter", withDefault Encode.null (map Encode.string model.notAfter) )
        , ( "serialNumber", withDefault Encode.null (map Encode.int model.serialNumber) )
        ]

