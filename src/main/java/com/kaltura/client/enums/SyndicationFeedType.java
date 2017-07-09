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
package com.kaltura.client.enums;

import com.google.gson.annotations.SerializedName;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum SyndicationFeedType implements EnumAsInt {
    GOOGLE_VIDEO(1),
    YAHOO(2),
    ITUNES(3),
    TUBE_MOGUL(4),
    KALTURA(5),
    KALTURA_XSLT(6),
    ROKU_DIRECT_PUBLISHER(7),
    OPERA_TV_SNAP(8);

    private int value;

    SyndicationFeedType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static SyndicationFeedType get(Integer value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over SyndicationFeedType defined values and compare the inner value with the given one:
        for(SyndicationFeedType item: values()) {
            if(item.getValue() == value) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return SyndicationFeedType.values().length > 0 ? SyndicationFeedType.values()[0]: null;
   }
}