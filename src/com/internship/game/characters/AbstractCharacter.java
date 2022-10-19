package com.internship.game.characters;

public abstract class AbstractCharacter implements CharacterInterface{
    private String name;
    private int speed = 10;
    private double energy = 10;
    private double intelligence = 10;
    private String race;
    private String gender;
    private double agility = 10;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

}