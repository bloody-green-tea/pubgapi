/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Drivers;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LogRedZoneEnded extends TelemetryEvent {

    @SerializedName("drivers")
    private List<Drivers> drivers;

    public List<Drivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Drivers> drivers) {
        this.drivers = drivers;
    }
}
