/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Location;
import com.google.gson.annotations.SerializedName;

public class LogObjectInteraction extends TelemetryEventCharacter {

    @SerializedName("objectType")
    private String objectType;

    @SerializedName("objectTypeStatus")
    private String objectTypeStatus;

    @SerializedName("objectTypeCount")
    private long objectTypeCount;

    public LogObjectInteraction() {
        super();
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectTypeStatus() {
        return objectTypeStatus;
    }

    public void setObjectTypeStatus(String objectTypeStatus) {
        this.objectTypeStatus = objectTypeStatus;
    }

    public long getObjectTypeCount() {
        return objectTypeCount;
    }

    public void setObjectTypeCount(long objectTypeCount) {
        this.objectTypeCount = objectTypeCount;
    }
}
