package com.internship.game.characters.monsters;

public enum MonsterCastle {

    MONK("Monk's holy spells are dangerous!", 0.2, 2, 1 ),
    GRIFFIN("Griffin flies", 0.3, 4, 3),
    FALLEN_ANGEL("Fallen angel can crush you!", 0.4, 5, 5);

    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    MonsterCastle(String information, double damage, int energy, int experiencePoints) {
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
