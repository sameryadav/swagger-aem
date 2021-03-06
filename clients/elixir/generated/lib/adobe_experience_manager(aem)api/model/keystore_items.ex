# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule AdobeExperienceManager(AEM)API.Model.KeystoreItems do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"alias",
    :"entryType",
    :"algorithm",
    :"format",
    :"chain"
  ]

  @type t :: %__MODULE__{
    :"alias" => String.t,
    :"entryType" => String.t,
    :"algorithm" => String.t,
    :"format" => String.t,
    :"chain" => [KeystoreChainItems]
  }
end

defimpl Poison.Decoder, for: AdobeExperienceManager(AEM)API.Model.KeystoreItems do
  import AdobeExperienceManager(AEM)API.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"chain", :list, AdobeExperienceManager(AEM)API.Model.KeystoreChainItems, options)
  end
end

