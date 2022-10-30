package com.internship.game.characters;
import com.internship.game.inventory.Weapon;

public abstract class AbstractCharacter implements CharacterInterface {
    private double agility = 10;
    private double energy = 10;
    private double intelligence = 10;
    private int speed = 10;


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public int getSpeed() {
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

    @Override
    public void actions() {
        System.out.println("OK, will do it");
    }

    @Override
    public void greeting() {
        System.out.println("Hi!");
    }

    @Override
    public void doStep() {
        System.out.println("OK, stepping");
    }

    @Override
    public void attack() {
        System.out.println("OK, attacking");
    }

    public void updateCharacteristicsByClass(AbstractCharacter character) {
        setIntelligence(character.getIntelligence());
        setSpeed(character.getSpeed());
        setAgility(character.getAgility());
        setEnergy(character.getEnergy());
    }

    public void checkWeapon (Character character, Weapon weapon){
        if(weapon.equals(Weapon.EXCALIBUR)){
            switch (character.getRace()){
                case "human":
                    setEnergy(character.getEnergy() + 3);
                    break;
                case "elf":
                    setAgility(character.getAgility() + 3);
                    break;
            }
        }


    }

}