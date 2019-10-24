package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

public class LogPlayerUseThrowable extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("fireWeaponStackCount")
    private Integer fireWeaponStackCount;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("attackType")
    private AttackType attackType;

    @SerializedName("weapon")
    private Item weapon;

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Integer getFireWeaponStackCount() {
        return fireWeaponStackCount;
    }

    public void setFireWeaponStackCount(Integer fireWeaponStackCount) {
        this.fireWeaponStackCount = fireWeaponStackCount;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
}
