package com.internship.game.characters.monsters;

import java.text.StringCharacterIterator;

public enum monsterCountry {

    FAIRY("Fairy - beautiful and dangerous!", 0.1, 1, 1),
    KOBOLD("Kobold near to you!", 0.2, 2,2),
    DRAGONFLY("It looks like these dragonflies are from the Jurassic period!", 0.3, 3, 3),
    SCARECROWS("This scarecrow is alive!", 0.3, 3, 3);

    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    monsterCountry(String information, double damage, int energy, int experiencePoints) {
        this.information = information;
        this.damage = damage;
        this.energy = energy;
        this.experiencePoints = experiencePoints;
    }


    public String getInformation() {
        return information;
    }

    public double getDamage() {
        return damage;
    }

    public int getEnergy() {
        return energy;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

}
