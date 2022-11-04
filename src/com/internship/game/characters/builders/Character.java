package com.internship.game.characters.builders;

public class Character {
    private final CharacterType type;
    private final int speed;
    private final double agility;
    private final double energy;
    private final double intelligence;
    private final String name;
    private final String gender;
    private final String race;
    private final Companion companion;
    private final Weapon weapon;
    private final Equipment equipment;

    public Character (CharacterType type,int speed,double agility, double energy,double intelligence,String name,String gender, String race, Companion companion, Weapon weapon, Equipment equipment) {
        this.type=type;
        this.speed = speed;
        this.agility = agility;
        this.energy = energy;
        this.intelligence = intelligence;
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.companion = companion;
        this.weapon = weapon;
        this.equipment = equipment;
    }

    public CharacterType getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public double getAgility() {
        return agility;
    }

    public double getEnergy() {
        return energy;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public Companion getCompanion() {
        return companion;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
