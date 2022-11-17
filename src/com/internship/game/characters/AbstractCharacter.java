package com.internship.game.characters;

public abstract class AbstractCharacter implements CharacterInterface {
    private double agility = 10;
    private double energy = 10;
    private double intelligence = 10;
    private double speed = 10;

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

//    public void updateCharacteristicsByClass(AbstractCharacter character) {
//        setIntelligence(character.getIntelligence());
//        setSpeed(character.getSpeed());
//        setAgility(character.getAgility());
//        setEnergy(character.getEnergy());
//    }

    public AbstractCharacter(String name, String gender, String race) {
    }
    public AbstractCharacter(){

    }

}