package com.internship.game.Inventory;

import com.internship.game.characters.Character;

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


    public static void boostCharacteristics (Equipment equipment, Character character){
        character.setEnergy(character.getEnergy() + equipment.getEnergyDifference());
        character.setSpeed(character.getSpeed() + equipment.getSpeedDifference());
        character.setIntelligence(character.getIntelligence() + equipment.getIntelligenceDifference());
        character.setAgility(character.getAgility() + equipment.getAgilityDifference());
    }

    public int getSpeedDifference() {
        return speedDifference;
    }

    public void setSpeedDifference(int speedDifference) {
        this.speedDifference = speedDifference;
    }

    public int getEnergyDifference() {
        return energyDifference;
    }

    public void setEnergyDifference(int energyDifference) {
        this.energyDifference = energyDifference;
    }

    public int getIntelligenceDifference() {
        return intelligenceDifference;
    }

    public void setIntelligenceDifference(int intelligenceDifference) {
        this.intelligenceDifference = intelligenceDifference;
    }

    public int getAgilityDifference() {
        return agilityDifference;
    }

    public void setAgilityDifference(int agilityDifference) {
        this.agilityDifference = agilityDifference;
    }

    private Equipment(int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
    }
}
