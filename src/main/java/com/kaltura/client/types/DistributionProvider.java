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
import com.kaltura.client.enums.DistributionProviderType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class DistributionProvider extends ObjectBase {

    private DistributionProviderType type;
    private String name;
    private Boolean scheduleUpdateEnabled;
    private Boolean availabilityUpdateEnabled;
    private Boolean deleteInsteadUpdate;
    private Integer intervalBeforeSunrise;
    private Integer intervalBeforeSunset;
    private String updateRequiredEntryFields;
    private String updateRequiredMetadataXPaths;

    // type:
    public DistributionProviderType getType(){
        return this.type;
    }
    public void setType(DistributionProviderType type){
        this.type = type;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // scheduleUpdateEnabled:
    public Boolean getScheduleUpdateEnabled(){
        return this.scheduleUpdateEnabled;
    }
    public void setScheduleUpdateEnabled(Boolean scheduleUpdateEnabled){
        this.scheduleUpdateEnabled = scheduleUpdateEnabled;
    }

    // availabilityUpdateEnabled:
    public Boolean getAvailabilityUpdateEnabled(){
        return this.availabilityUpdateEnabled;
    }
    public void setAvailabilityUpdateEnabled(Boolean availabilityUpdateEnabled){
        this.availabilityUpdateEnabled = availabilityUpdateEnabled;
    }

    // deleteInsteadUpdate:
    public Boolean getDeleteInsteadUpdate(){
        return this.deleteInsteadUpdate;
    }
    public void setDeleteInsteadUpdate(Boolean deleteInsteadUpdate){
        this.deleteInsteadUpdate = deleteInsteadUpdate;
    }

    // intervalBeforeSunrise:
    public Integer getIntervalBeforeSunrise(){
        return this.intervalBeforeSunrise;
    }
    public void setIntervalBeforeSunrise(Integer intervalBeforeSunrise){
        this.intervalBeforeSunrise = intervalBeforeSunrise;
    }

    // intervalBeforeSunset:
    public Integer getIntervalBeforeSunset(){
        return this.intervalBeforeSunset;
    }
    public void setIntervalBeforeSunset(Integer intervalBeforeSunset){
        this.intervalBeforeSunset = intervalBeforeSunset;
    }

    // updateRequiredEntryFields:
    public String getUpdateRequiredEntryFields(){
        return this.updateRequiredEntryFields;
    }
    public void setUpdateRequiredEntryFields(String updateRequiredEntryFields){
        this.updateRequiredEntryFields = updateRequiredEntryFields;
    }

    // updateRequiredMetadataXPaths:
    public String getUpdateRequiredMetadataXPaths(){
        return this.updateRequiredMetadataXPaths;
    }
    public void setUpdateRequiredMetadataXPaths(String updateRequiredMetadataXPaths){
        this.updateRequiredMetadataXPaths = updateRequiredMetadataXPaths;
    }


    public DistributionProvider() {
       super();
    }

    public DistributionProvider(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        type = DistributionProviderType.get(GsonParser.parseString(jsonObject.get("type")));
        name = GsonParser.parseString(jsonObject.get("name"));
        scheduleUpdateEnabled = GsonParser.parseBoolean(jsonObject.get("scheduleUpdateEnabled"));
        availabilityUpdateEnabled = GsonParser.parseBoolean(jsonObject.get("availabilityUpdateEnabled"));
        deleteInsteadUpdate = GsonParser.parseBoolean(jsonObject.get("deleteInsteadUpdate"));
        intervalBeforeSunrise = GsonParser.parseInt(jsonObject.get("intervalBeforeSunrise"));
        intervalBeforeSunset = GsonParser.parseInt(jsonObject.get("intervalBeforeSunset"));
        updateRequiredEntryFields = GsonParser.parseString(jsonObject.get("updateRequiredEntryFields"));
        updateRequiredMetadataXPaths = GsonParser.parseString(jsonObject.get("updateRequiredMetadataXPaths"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaDistributionProvider");
        kparams.add("name", this.name);
        kparams.add("scheduleUpdateEnabled", this.scheduleUpdateEnabled);
        kparams.add("availabilityUpdateEnabled", this.availabilityUpdateEnabled);
        kparams.add("deleteInsteadUpdate", this.deleteInsteadUpdate);
        kparams.add("intervalBeforeSunrise", this.intervalBeforeSunrise);
        kparams.add("intervalBeforeSunset", this.intervalBeforeSunset);
        kparams.add("updateRequiredEntryFields", this.updateRequiredEntryFields);
        kparams.add("updateRequiredMetadataXPaths", this.updateRequiredMetadataXPaths);
        return kparams;
    }

}
