package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Drivers extends Character {

    @SerializedName("isInBlueZone")
    boolean isInBlueZone;

    @SerializedName("isInRedZone")
    boolean isInRedZone;

    public boolean isInBlueZone() {
        return isInBlueZone;
    }

    public void setInBlueZone(boolean inBlueZone) {
        isInBlueZone = inBlueZone;
    }

    public boolean isInRedZone() {
        return isInRedZone;
    }

    public void setInRedZone(boolean inRedZone) {
        isInRedZone = inRedZone;
    }

}
