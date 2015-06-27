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
// Copyright (C) 2006-2015  Kaltura Inc.
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
package com.kaltura.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 27 Jun 15 00:21:40 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaAccessControlActionType implements KalturaEnumAsString {
    BLOCK ("1"),
    PREVIEW ("2"),
    LIMIT_FLAVORS ("3"),
    ADD_TO_STORAGE ("4"),
    LIMIT_DELIVERY_PROFILES ("5"),
    SERVE_FROM_REMOTE_SERVER ("6");

    public String hashCode;

    KalturaAccessControlActionType(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaAccessControlActionType get(String hashCode) {
        if (hashCode.equals("1"))
        {
           return BLOCK;
        }
        else 
        if (hashCode.equals("2"))
        {
           return PREVIEW;
        }
        else 
        if (hashCode.equals("3"))
        {
           return LIMIT_FLAVORS;
        }
        else 
        if (hashCode.equals("4"))
        {
           return ADD_TO_STORAGE;
        }
        else 
        if (hashCode.equals("5"))
        {
           return LIMIT_DELIVERY_PROFILES;
        }
        else 
        if (hashCode.equals("6"))
        {
           return SERVE_FROM_REMOTE_SERVER;
        }
        else 
        {
           return BLOCK;
        }
    }
}