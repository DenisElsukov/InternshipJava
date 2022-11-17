package com.internship.game.inventory;

import com.internship.game.characters.AbstractCharacter;

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

    private double speedDifference;
    private double energyDifference;
    private double intelligenceDifference;
    private double agilityDifference;


   public static void boostCharacteristics (Equipment equipment, AbstractCharacter character){
        character.setEnergy(character.getEnergy() + equipment.getEnergyDifference());
        character.setSpeed((int)(character.getSpeed() + equipment.getSpeedDifference()));
        character.setIntelligence(character.getIntelligence() + equipment.getIntelligenceDifference());
        character.setAgility(character.getAgility() + equipment.getAgilityDifference());
    }


    public double getSpeedDifference() {
        return speedDifference;
    }

    public void setSpeedDifference(double speedDifference) {
        this.speedDifference = speedDifference;
    }

    public double getEnergyDifference() {
        return energyDifference;
    }

    public void setEnergyDifference(double energyDifference) {
        this.energyDifference = energyDifference;
    }

    public double getIntelligenceDifference() {
        return intelligenceDifference;
    }

    public void setIntelligenceDifference(double intelligenceDifference) {
        this.intelligenceDifference = intelligenceDifference;
    }

    public double getAgilityDifference() {
        return agilityDifference;
    }

    public void setAgilityDifference(double agilityDifference) {
        this.agilityDifference = agilityDifference;
    }

    private Equipment(double speedDifference, double energyDifference, double intelligenceDifference, double agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
    }
}
