#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TruststoreInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TruststoreInfo::TruststoreInfo()
{
	//__init();
}

TruststoreInfo::~TruststoreInfo()
{
	//__cleanup();
}

void
TruststoreInfo::__init()
{
	//new std::list()std::list> aliases;
	//exists = bool(false);
}

void
TruststoreInfo::__cleanup()
{
	//if(aliases != NULL) {
	//aliases.RemoveAll(true);
	//delete aliases;
	//aliases = NULL;
	//}
	//if(exists != NULL) {
	//
	//delete exists;
	//exists = NULL;
	//}
	//
}

void
TruststoreInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aliasesKey = "aliases";
	node = json_object_get_member(pJsonObject, aliasesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TruststoreItems> new_list;
			TruststoreItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TruststoreItems")) {
					jsonToValue(&inst, temp_json, "TruststoreItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			aliases = new_list;
		}
		
	}
	const gchar *existsKey = "exists";
	node = json_object_get_member(pJsonObject, existsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&exists, node, "bool", "");
		} else {
			
		}
	}
}

TruststoreInfo::TruststoreInfo(char* json)
{
	this->fromJson(json);
}

char*
TruststoreInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TruststoreItems")) {
		list<TruststoreItems> new_list = static_cast<list <TruststoreItems> > (getAliases());
		node = converttoJson(&new_list, "TruststoreItems", "array");
	} else {
		node = json_node_alloc();
		list<TruststoreItems> new_list = static_cast<list <TruststoreItems> > (getAliases());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TruststoreItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TruststoreItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *aliasesKey = "aliases";
	json_object_set_member(pJsonObject, aliasesKey, node);
	if (isprimitive("bool")) {
		bool obj = getExists();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *existsKey = "exists";
	json_object_set_member(pJsonObject, existsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<TruststoreItems>
TruststoreInfo::getAliases()
{
	return aliases;
}

void
TruststoreInfo::setAliases(std::list <TruststoreItems> aliases)
{
	this->aliases = aliases;
}

bool
TruststoreInfo::getExists()
{
	return exists;
}

void
TruststoreInfo::setExists(bool  exists)
{
	this->exists = exists;
}


