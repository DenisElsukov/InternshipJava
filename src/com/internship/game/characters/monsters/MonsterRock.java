package com.internship.game.characters.monsters;

public enum MonsterRock {

    STONE_GARGOYLE("It seems to be alive! It's a stone gargoyle!", 0.2, 3,1),
    GENIE("Genie can bewitch you!", 0.3, 4,3),
    NAGA("Naga crawls faster than all snakes...", 0.4, 5,4);


    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    MonsterRock(String information, double damage, int energy, int experiencePoints) {
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
