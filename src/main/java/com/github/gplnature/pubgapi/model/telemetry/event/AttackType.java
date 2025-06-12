package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttackType {
    @JsonProperty("BlackZone") BLACK_ZONE("BlackZone"),
    @JsonProperty("RedZone") RED_ZONE("RedZone"),
    @JsonProperty("Weapon") WEAPON("Weapon");

    private final String text;

    AttackType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}