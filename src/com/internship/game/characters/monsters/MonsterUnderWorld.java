package com.internship.game.characters.monsters;

public enum MonsterUnderWorld {

    SKELETON("The skeleton is coming!", 0.1, 2, 1),
    GOG("Gog lights a fire.", 0.2, 3, 2),
    WIGHT("They are almost invisible! But they are... they are wights!", 0.3, 4, 3),
    EFREET("Efreet's eyes make me want to cry!", 0.4, 5, 5);

    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    MonsterUnderWorld(String information, double damage, int energy, int experiencePoints) {
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
