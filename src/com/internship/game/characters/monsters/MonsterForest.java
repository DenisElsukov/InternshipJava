package com.internship.game.characters.monsters;

public enum MonsterForest {

    CENTAUR("Centaurs are more dangerous than they seem!", 0.1, 1, 1),
    WILD_BOAR("Wild boar on the way.", 0.2, 2, 2),
    DRAGON("The dragon is angry!", 0.5, 6,4);

    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    MonsterForest(String information, double damage, int energy, int experiencePoints) {
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
