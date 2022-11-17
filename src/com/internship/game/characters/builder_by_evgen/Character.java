package com.internship.game.characters.builder_by_evgen;

import com.internship.game.characters.AbstractCharacter;
import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

public class Character extends AbstractCharacter {
    private String name;
    private String gender;
    private String race;
    private Companion companion;
    private Weapon weapon;
    private Equipment equipment;

    private double agility = 10;
    private double energy = 10;
    private double intelligence = 10;
    private double speed = 10;

    public Character() {
    }

    public Character(String name, String gender, String race) {
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", companion=" + companion +
                ", weapon=" + weapon +
                ", equipment=" + equipment +
                '}';
    }

    public static void printCharacterSummary (Character character){
        System.out.println("Hi, Adventure!");
        System.out.println("Name :" + character.getName());
        System.out.println("Sex :" + character.getGender());
        System.out.println("Race :" + character.getRace());
        System.out.println();
        System.out.println("Agility :" + character.getAgility());
        System.out.println("Intelligence :" + character.getIntelligence());
        System.out.println("Energy :" + character.getEnergy());
        System.out.println("Speed :" + character.getSpeed());
        System.out.println("Weapon: " +character.getWeapon());
        System.out.println("Equipment: " +character.getEquipment());
        System.out.println("Companion: " +character.getCompanion());

    }
}

