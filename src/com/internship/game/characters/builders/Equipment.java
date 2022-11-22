package com.internship.game.characters.builders;

public enum Equipment {
    //Armors
    SKIN_ARMOR(0,0,0,1),
    CHAIN_ARMOR(0,1,0,1),
    ARMOR(-1, 2, 0, 1),

    //LEGENDARY ARMOR
    WHITE_ROBE(0,6,5,0),
    MITHRIL(2,4,2,3),
    SHINOBI_SHADOW(4,2,0,5),
    GENDER_FUN(0,0,0,0);

    private int speedDifference;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;
    Equipment(int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
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

    public int getAgilityDifference() {
        return agilityDifference;
    }
}
