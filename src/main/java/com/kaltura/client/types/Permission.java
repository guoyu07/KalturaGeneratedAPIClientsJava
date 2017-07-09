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
import com.kaltura.client.enums.PermissionType;
import com.kaltura.client.enums.PermissionStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Permission extends ObjectBase {

    private Integer id;
    private PermissionType type;
    private String name;
    private String friendlyName;
    private String description;
    private PermissionStatus status;
    private Integer partnerId;
    private String dependsOnPermissionNames;
    private String tags;
    private String permissionItemsIds;
    private Integer createdAt;
    private Integer updatedAt;
    private String partnerGroup;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // type:
    public PermissionType getType(){
        return this.type;
    }
    public void setType(PermissionType type){
        this.type = type;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // friendlyName:
    public String getFriendlyName(){
        return this.friendlyName;
    }
    public void setFriendlyName(String friendlyName){
        this.friendlyName = friendlyName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // status:
    public PermissionStatus getStatus(){
        return this.status;
    }
    public void setStatus(PermissionStatus status){
        this.status = status;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // dependsOnPermissionNames:
    public String getDependsOnPermissionNames(){
        return this.dependsOnPermissionNames;
    }
    public void setDependsOnPermissionNames(String dependsOnPermissionNames){
        this.dependsOnPermissionNames = dependsOnPermissionNames;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // permissionItemsIds:
    public String getPermissionItemsIds(){
        return this.permissionItemsIds;
    }
    public void setPermissionItemsIds(String permissionItemsIds){
        this.permissionItemsIds = permissionItemsIds;
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

    // partnerGroup:
    public String getPartnerGroup(){
        return this.partnerGroup;
    }
    public void setPartnerGroup(String partnerGroup){
        this.partnerGroup = partnerGroup;
    }


    public Permission() {
       super();
    }

    public Permission(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        type = PermissionType.get(GsonParser.parseInt(jsonObject.get("type")));
        name = GsonParser.parseString(jsonObject.get("name"));
        friendlyName = GsonParser.parseString(jsonObject.get("friendlyName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        status = PermissionStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        dependsOnPermissionNames = GsonParser.parseString(jsonObject.get("dependsOnPermissionNames"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        permissionItemsIds = GsonParser.parseString(jsonObject.get("permissionItemsIds"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        partnerGroup = GsonParser.parseString(jsonObject.get("partnerGroup"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPermission");
        kparams.add("name", this.name);
        kparams.add("friendlyName", this.friendlyName);
        kparams.add("description", this.description);
        kparams.add("status", this.status);
        kparams.add("dependsOnPermissionNames", this.dependsOnPermissionNames);
        kparams.add("tags", this.tags);
        kparams.add("permissionItemsIds", this.permissionItemsIds);
        kparams.add("partnerGroup", this.partnerGroup);
        return kparams;
    }

}
