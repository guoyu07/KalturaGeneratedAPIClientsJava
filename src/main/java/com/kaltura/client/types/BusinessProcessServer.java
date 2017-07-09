// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.BusinessProcessServerStatus;
import com.kaltura.client.enums.BusinessProcessProvider;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class BusinessProcessServer extends ObjectBase {

	/**  Auto generated identifier  */
    private Integer id;
	/**  Server creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Server update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private Integer partnerId;
    private String name;
    private String systemName;
    private String description;
    private BusinessProcessServerStatus status;
	/**  The type of the server, this is auto filled by the derived server object  */
    private BusinessProcessProvider type;
	/**  The dc of the server  */
    private Integer dc;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // status:
    public BusinessProcessServerStatus getStatus(){
        return this.status;
    }
    public void setStatus(BusinessProcessServerStatus status){
        this.status = status;
    }

    // type:
    public BusinessProcessProvider getType(){
        return this.type;
    }
    public void setType(BusinessProcessProvider type){
        this.type = type;
    }

    // dc:
    public Integer getDc(){
        return this.dc;
    }
    public void setDc(Integer dc){
        this.dc = dc;
    }


    public BusinessProcessServer() {
       super();
    }

    public BusinessProcessServer(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        status = BusinessProcessServerStatus.get(GsonParser.parseString(jsonObject.get("status")));
        type = BusinessProcessProvider.get(GsonParser.parseString(jsonObject.get("type")));
        dc = GsonParser.parseInt(jsonObject.get("dc"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBusinessProcessServer");
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("dc", this.dc);
        return kparams;
    }

}
