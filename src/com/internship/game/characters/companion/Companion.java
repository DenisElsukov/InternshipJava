package com.internship.game.characters.companion;

public enum Companion {

    EAGLE("Rage and thirst for battle are in my blood!", 10),
    TIGER("Patience and strength are my pluses!", 10),
    BEAR("I am loyal and ready to defend!", 10),
    SNAKE("Cunning and luck are on my side!", 10),
    RAVEN("Wisdom is needed now more than ever!", 10);

    private final String greeting;
    private final int energy;

    Companion(String greeting, int energy) {
        this.greeting = greeting;
        this.energy = energy;
    }

    public String getGreeting() {
        return greeting;
    }

    public int getEnergy() {
        return energy;
    }

}
