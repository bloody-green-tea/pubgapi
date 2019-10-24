/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogPhaseChange extends TelemetryEvent {

    @SerializedName("phase")
    private long phase;

    @SerializedName("elapsedTime")
    private long elapsedTime;

    public long getPhase() {
        return phase;
    }

    public void setPhase(long phase) {
        this.phase = phase;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
