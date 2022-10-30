package com.internship.game.inventory;

import com.internship.game.characters.Character;
public enum Weapon {

    //Standart weapon
    FISTS(0,0,0,0),
    STAFF(0,1,1,-1),
    SWORD(0,1,0,0),
    AXE(1,1,-1,0),
    BOW(1,0,-1,1),

    //Legendary weapon
    EXCALIBUR(2,5,0,3),
    HOODSPIRIT(3,2,1,5);

    private int speedDifferense;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;

    private Weapon (int speedDifferense, int energyDifference, int intelligenceDifference, int agilityDifference){
    }

    static void boostCharacteristics (Weapon weapon,Character myHero){
        if (weapon.equals(EXCALIBUR) & myHero.getRace().equals("human")){
            EXCALIBUR.setEnergyDifference(7);
        }
    }

    public int getSpeedDifferense() {
        return speedDifferense;
    }

    public void setSpeedDifferense(int speedDifferense) {
        this.speedDifferense = speedDifferense;
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
}
