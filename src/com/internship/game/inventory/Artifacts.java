package com.internship.game.inventory;

import com.internship.game.characters.AbstractCharacter;

public enum Artifacts {

    RING_OF_POWER(5,5,5,5);

    private double speedDifference;
    private double energyDifference;
    private double intelligenceDifference;
    private double agilityDifference;

    public void boostCharacteristics (Equipment equipment, AbstractCharacter character){
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

    public void setEnergyDifference(int energyDifference) {
        this.energyDifference = energyDifference;
    }

    public double getIntelligenceDifference() {
        return intelligenceDifference;
    }

    public void setIntelligenceDifference(int intelligenceDifference) {
        this.intelligenceDifference = intelligenceDifference;
    }

    public double getAgilityDifference() {
        return agilityDifference;
    }

    public void setAgilityDifference(int agilityDifference) {
        this.agilityDifference = agilityDifference;
    }

    private Artifacts (int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
    }

}
