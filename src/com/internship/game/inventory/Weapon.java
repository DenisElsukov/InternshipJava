package com.internship.game.inventory;

import com.internship.game.characters.AbstractCharacter;

public enum Weapon {

    //Standart weapon
    FISTS(0,0,0,0),
    STAFF(0,1,1,-1),
    SWORD(0,1,0,0),
    AXE(1,1,-1,0),
    BOW(1,0,-1,1),

    //Legendary weapon
    EXCALIBUR(2,5,0,3),
    HOOD_SPIRIT(3,2,1,5);

    private double speedDifference;
    private double energyDifference;
    private double intelligenceDifference;
    private double agilityDifference;

    public static void boostCharacteristics (Weapon weapon,AbstractCharacter character){
        character.setEnergy(character.getEnergy() + weapon.getEnergyDifference());
        character.setSpeed((int)(character.getSpeed() + weapon.getSpeedDifference()));
        character.setIntelligence(character.getIntelligence() + weapon.getIntelligenceDifference());
        character.setAgility(character.getAgility() + weapon.getAgilityDifference());
    }
        //to the future
//        public void checkWeapon (Character character, Weapon weapon){
//        if(weapon.equals(Weapon.EXCALIBUR)){
//            switch (character.getRace()){
//                case "human":
//                    character.setEnergy(character.getEnergy() + 3);
//                    break;
//                case "elf":
//                    character.setAgility(character.getAgility() + 3);
//                    break;
//            }
//        }
//    }

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

    private Weapon (double speedDifference, double energyDifference, double intelligenceDifference, double agilityDifference){
        this.speedDifference = speedDifference;
        this.energyDifference = energyDifference;
        this.intelligenceDifference = energyDifference;
        this.agilityDifference = agilityDifference;
    }
}
