package com.internship.game.characters.monsters;

public enum monster {
    /**пока что все значения взяты рандомно*/

    WILD_BOAR("Wild boar on the way.", 0.2, 1),
    KOBOLD("Kobold near to you!", 0.2, 2),
    SKELETON("The skeleton is coming!", 0.1, 3),
    GOG("Gog lights a fire.", 0.3, 2),
    FALLEN_ANGEL("Fallen angel can crush you!", 0.4, 5),
    NAGA("Naga crawls faster than all snakes...", 0.4, 4),
    GRIFFIN("Griffin flies", 0.3, 4),
    STONE_GARGOYLE("It seems to be alive! It's a stone gargoyle!", 0.2, 4),
    WIGHT("They are almost invisible! But they are... they are wights!", 0.3, 4),
    HARPY("It looks like a dangerous bird! It's a harpy!", 0.1, 4),
    MEDUSA("The snakes on the head of the Medusa move.. She sees you!", 0.5, 5);

    private final String information;
    private final double damage;
    private final int energy;

    monster(String information, double damage, int energy) {
        this.information = information;
        this.damage = damage;
        this.energy = energy;
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
}
