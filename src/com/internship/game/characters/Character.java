package com.internship.game.characters;

import com.internship.game.characters.companion.Companion;

public class Character extends AbstractCharacter {
    private String name;
    private String gender;
    private String race;
    private Companion companion;

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

    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
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
                "name='" + getName() + '\'' +
                '}' + "\n" + "Character{" + "gender='" + getGender() + '\'' + '}';
    }
}
