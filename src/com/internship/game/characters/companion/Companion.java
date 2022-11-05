package com.internship.game.characters.companion;

import com.internship.game.characters.Character;
import com.internship.game.characters.specialization.Specialization;

public enum Companion {

    EAGLE("I am Eagle! Rage and thirst for battle are in my blood!", 1,2,0,0),
    TIGER("I am Tiger! Patience and strength are my pluses!", 0,1,2,0),
    BEAR("I am Bear! I am loyal and ready to defend!", 0,2,0,1),
    SNAKE("I am Snake! Cunning and luck are on my side!", 0,0,2,1),
    RAVEN("I am Raven! Wisdom is needed now more than ever!", 2,0,0,1),
    DOG("I am Dog! I'm ready to defend and extremely smart!",1,0,2,0);

    private final String greeting;
    private int speedDifference;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;

    Companion(String greeting, int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference) {
        this.greeting = greeting;
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = intelligenceDifference;
        this.agilityDifference = agilityDifference;
    }

    public static void boostCharacteristics (Companion companion, Character character){
        Specialization specialization = character.getSpecialization();

        specialization.setEnergy(specialization.getEnergy() + companion.getEnergyDifference());
        specialization.setSpeed(specialization.getSpeed() + companion.getSpeedDifference());
        specialization.setIntelligence(specialization.getIntelligence() + companion.getIntelligenceDifference());
        specialization.setAgility(specialization.getAgility() + companion.getAgilityDifference());
    }

    public String getGreeting() {
        return greeting;
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
