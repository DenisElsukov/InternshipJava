package com.internship.game.inventory;

import com.internship.game.characters.Character;
import com.internship.game.characters.specialization.Specialization;

public enum Artifacts {

    RING_OF_POWER(5,5,5,5);

    private int speedDifference;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;

    public static void boostCharacteristics (Artifacts artifacts, Character character){
        Specialization specialization = character.getSpecialization();

        specialization.setEnergy(specialization.getEnergy() + artifacts.getEnergyDifference());
        specialization.setSpeed(specialization.getSpeed() + artifacts.getSpeedDifference());
        specialization.setIntelligence(specialization.getIntelligence() + artifacts.getIntelligenceDifference());
        specialization.setAgility(specialization.getAgility() + artifacts.getAgilityDifference());
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

    private Artifacts (int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
    }

}
