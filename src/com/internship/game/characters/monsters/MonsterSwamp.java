package com.internship.game.characters.monsters;

public enum MonsterSwamp {


    HARPY("It looks like a dangerous bird! It's a harpy!", 0.1, 2,2),
    MEDUSA("The snakes on the head of the Medusa move.. She sees you!", 0.3, 3,3),
    HYDRA("The Hydra has three heads!",0.5, 5, 4 );

    private final String information;
    private final double damage;
    private final int energy;
    private final int experiencePoints;

    MonsterSwamp(String information, double damage, int energy, int experiencePoints) {
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
