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
    HOOD_SPIRIT(3,2,1,5);

    private int speedDifference;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;

    public static void boostCharacteristics (Weapon weapon,Character character){
        character.setEnergy(character.getEnergy() + weapon.getEnergyDifference());
        character.setSpeed(character.getSpeed() + weapon.getSpeedDifference());
        character.setIntelligence(character.getIntelligence() + weapon.getIntelligenceDifference());
        character.setAgility(character.getAgility() + weapon.getAgilityDifference());
    }

        public void checkWeapon (Character character, Weapon weapon){
        if(weapon.equals(Weapon.EXCALIBUR)){
            switch (character.getRace()){
                case "human":
                    character.setEnergy(character.getEnergy() + 3);
                    break;
                case "elf":
                    character.setAgility(character.getAgility() + 3);
                    break;
            }
        }
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

    private Weapon (int speedDifference, int energyDifference, int intelligenceDifference, int agilityDifference){
    }
}
