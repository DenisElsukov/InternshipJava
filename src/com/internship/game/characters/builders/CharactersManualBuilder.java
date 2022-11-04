package com.internship.game.characters.builders;

public class CharactersManualBuilder implements Builder {
    private CharacterType type;
    private int speed;
    private double agility;
    private double energy;
    private double intelligence;
    private String name;
    private String gender;
    private String race;
    private Companion companion;
    private Weapon weapon;
    private Equipment equipment;

    @Override
    public void setCharacterType(CharacterType type) {
        this.type = type;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setAgility(double agility) {
        this.agility = agility;
    }

    @Override
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Manual getResult() {
        return new Manual (type ,speed ,agility,energy,intelligence,name,gender,race, companion, weapon, equipment);
    }
}
