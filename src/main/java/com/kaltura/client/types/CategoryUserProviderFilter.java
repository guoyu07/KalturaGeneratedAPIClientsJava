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
import com.kaltura.client.enums.CategoryUserStatus;
import com.kaltura.client.enums.UpdateMethodType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CategoryUserProviderFilter extends Filter {

    private String userIdEqual;
    private String userIdIn;
    private CategoryUserStatus statusEqual;
    private String statusIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private UpdateMethodType updateMethodEqual;
    private String updateMethodIn;
    private String permissionNamesMatchAnd;
    private String permissionNamesMatchOr;

    // userIdEqual:
    public String getUserIdEqual(){
        return this.userIdEqual;
    }
    public void setUserIdEqual(String userIdEqual){
        this.userIdEqual = userIdEqual;
    }

    // userIdIn:
    public String getUserIdIn(){
        return this.userIdIn;
    }
    public void setUserIdIn(String userIdIn){
        this.userIdIn = userIdIn;
    }

    // statusEqual:
    public CategoryUserStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(CategoryUserStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // updatedAtGreaterThanOrEqual:
    public Integer getUpdatedAtGreaterThanOrEqual(){
        return this.updatedAtGreaterThanOrEqual;
    }
    public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
        this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
    }

    // updatedAtLessThanOrEqual:
    public Integer getUpdatedAtLessThanOrEqual(){
        return this.updatedAtLessThanOrEqual;
    }
    public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
        this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
    }

    // updateMethodEqual:
    public UpdateMethodType getUpdateMethodEqual(){
        return this.updateMethodEqual;
    }
    public void setUpdateMethodEqual(UpdateMethodType updateMethodEqual){
        this.updateMethodEqual = updateMethodEqual;
    }

    // updateMethodIn:
    public String getUpdateMethodIn(){
        return this.updateMethodIn;
    }
    public void setUpdateMethodIn(String updateMethodIn){
        this.updateMethodIn = updateMethodIn;
    }

    // permissionNamesMatchAnd:
    public String getPermissionNamesMatchAnd(){
        return this.permissionNamesMatchAnd;
    }
    public void setPermissionNamesMatchAnd(String permissionNamesMatchAnd){
        this.permissionNamesMatchAnd = permissionNamesMatchAnd;
    }

    // permissionNamesMatchOr:
    public String getPermissionNamesMatchOr(){
        return this.permissionNamesMatchOr;
    }
    public void setPermissionNamesMatchOr(String permissionNamesMatchOr){
        this.permissionNamesMatchOr = permissionNamesMatchOr;
    }


    public CategoryUserProviderFilter() {
       super();
    }

    public CategoryUserProviderFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
        userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
        statusEqual = CategoryUserStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        updateMethodEqual = UpdateMethodType.get(GsonParser.parseInt(jsonObject.get("updateMethodEqual")));
        updateMethodIn = GsonParser.parseString(jsonObject.get("updateMethodIn"));
        permissionNamesMatchAnd = GsonParser.parseString(jsonObject.get("permissionNamesMatchAnd"));
        permissionNamesMatchOr = GsonParser.parseString(jsonObject.get("permissionNamesMatchOr"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCategoryUserProviderFilter");
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("userIdIn", this.userIdIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("updateMethodEqual", this.updateMethodEqual);
        kparams.add("updateMethodIn", this.updateMethodIn);
        kparams.add("permissionNamesMatchAnd", this.permissionNamesMatchAnd);
        kparams.add("permissionNamesMatchOr", this.permissionNamesMatchOr);
        return kparams;
    }

}
