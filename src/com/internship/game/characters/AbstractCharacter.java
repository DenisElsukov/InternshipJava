package com.internship.game.characters;

public abstract class AbstractCharacter implements CharacterInterface {
    private double agility = 10;
    private double energy = 10;
    private double intelligence = 10;
    private int speed = 10;
    private String race;
    private String gender;

    protected AbstractCharacter(String name, String race, String gender, int speed, double energy, double intelligence, double agility) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.speed = speed;
        this.energy = energy;
        this.intelligence = intelligence;
        this.agility = agility;
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

}