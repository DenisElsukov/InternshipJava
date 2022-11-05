package com.internship.game.characters.builders;

public enum Weapon {
    FISTS(0,0,0,0),
    STAFF(0,1,1,-1),
    SWORD(0,1,0,0),
    AXE(1,1,-1,0),
    BOW(1,0,-1,1),

    //Legendary weapon
    EXCALIBUR(2,5,0,3),
    HOOD_SPIRIT(3,2,1,5);

    private int speedDifference;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;
    Weapon (int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
    }
    public int getAgilityDifference() {
        return agilityDifference;
    }

    public int getSpeedDifference() {
        return speedDifference;
    }

    public int getEnergyDifference() {
        return energyDifference;
    }

    public int getIntelligenceDifference() {
        return intelligenceDifference;
    }
}
