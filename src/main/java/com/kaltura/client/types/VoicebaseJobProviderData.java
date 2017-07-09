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
import com.kaltura.client.enums.Language;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class VoicebaseJobProviderData extends IntegrationJobProviderData {

	/**  Entry ID  */
    private String entryId;
	/**  Flavor ID  */
    private String flavorAssetId;
	/**  input Transcript-asset ID  */
    private String transcriptId;
	/**  Caption formats  */
    private String captionAssetFormats;
	/**  Api key for service provider  */
    private String apiKey;
	/**  Api key for service provider  */
    private String apiPassword;
	/**  Transcript content language  */
    private Language spokenLanguage;
	/**  Transcript Content location  */
    private String fileLocation;
	/**  should replace remote media content  */
    private Boolean replaceMediaContent;

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // flavorAssetId:
    public String getFlavorAssetId(){
        return this.flavorAssetId;
    }
    public void setFlavorAssetId(String flavorAssetId){
        this.flavorAssetId = flavorAssetId;
    }

    // transcriptId:
    public String getTranscriptId(){
        return this.transcriptId;
    }
    public void setTranscriptId(String transcriptId){
        this.transcriptId = transcriptId;
    }

    // captionAssetFormats:
    public String getCaptionAssetFormats(){
        return this.captionAssetFormats;
    }
    public void setCaptionAssetFormats(String captionAssetFormats){
        this.captionAssetFormats = captionAssetFormats;
    }

    // apiKey:
    public String getApiKey(){
        return this.apiKey;
    }
    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    // apiPassword:
    public String getApiPassword(){
        return this.apiPassword;
    }
    public void setApiPassword(String apiPassword){
        this.apiPassword = apiPassword;
    }

    // spokenLanguage:
    public Language getSpokenLanguage(){
        return this.spokenLanguage;
    }
    public void setSpokenLanguage(Language spokenLanguage){
        this.spokenLanguage = spokenLanguage;
    }

    // fileLocation:
    public String getFileLocation(){
        return this.fileLocation;
    }
    public void setFileLocation(String fileLocation){
        this.fileLocation = fileLocation;
    }

    // replaceMediaContent:
    public Boolean getReplaceMediaContent(){
        return this.replaceMediaContent;
    }
    public void setReplaceMediaContent(Boolean replaceMediaContent){
        this.replaceMediaContent = replaceMediaContent;
    }


    public VoicebaseJobProviderData() {
       super();
    }

    public VoicebaseJobProviderData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
        transcriptId = GsonParser.parseString(jsonObject.get("transcriptId"));
        captionAssetFormats = GsonParser.parseString(jsonObject.get("captionAssetFormats"));
        apiKey = GsonParser.parseString(jsonObject.get("apiKey"));
        apiPassword = GsonParser.parseString(jsonObject.get("apiPassword"));
        spokenLanguage = Language.get(GsonParser.parseString(jsonObject.get("spokenLanguage")));
        fileLocation = GsonParser.parseString(jsonObject.get("fileLocation"));
        replaceMediaContent = GsonParser.parseBoolean(jsonObject.get("replaceMediaContent"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaVoicebaseJobProviderData");
        kparams.add("entryId", this.entryId);
        kparams.add("flavorAssetId", this.flavorAssetId);
        kparams.add("transcriptId", this.transcriptId);
        kparams.add("captionAssetFormats", this.captionAssetFormats);
        kparams.add("spokenLanguage", this.spokenLanguage);
        kparams.add("replaceMediaContent", this.replaceMediaContent);
        return kparams;
    }

}
