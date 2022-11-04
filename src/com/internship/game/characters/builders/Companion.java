package com.internship.game.characters.builders;

public enum Companion {
    EAGLE("I am Eagle! Rage and thirst for battle are in my blood!", 10),
    TIGER("I am Tiger! Patience and strength are my pluses!", 10),
    BEAR("I am Bear! I am loyal and ready to defend!", 10),
    SNAKE("I am Snake! Cunning and luck are on my side!", 10),
    RAVEN("I am Raven! Wisdom is needed now more than ever!", 10),
    DOG("I am Dog! I'm ready to defend and extremely smart!",10);

    private final String greeting;
    private final double energy;

    Companion(String greeting, double energy) {
        this.greeting = greeting;
        this.energy = energy;
    }

    public String getGreeting() {
        return greeting;
    }

    public double getEnergy() {
        return energy;
    }
}
