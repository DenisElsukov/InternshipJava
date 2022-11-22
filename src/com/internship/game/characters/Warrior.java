package com.internship.game.characters;

public class Warrior extends Character {

    // Buffs by Hero's class
    private final int SPEED_DIFFERENCE = -1;
    private final double ENERGY_DIFFERENCE = 2;
    private final double INTELLIGENCE_DIFFERENCE = 1;
    private final double AGILITY_DIFFERENCE = 0;

    public Warrior(String name, String gender, String race) {
        super(name, gender, race);
        setIntelligence(getIntelligence() + INTELLIGENCE_DIFFERENCE);
        setAgility(getAgility() + AGILITY_DIFFERENCE);
        setEnergy(getEnergy() + ENERGY_DIFFERENCE);
        setSpeed(getSpeed() + SPEED_DIFFERENCE);
    }

    @Override
    public void actions() {
        System.out.println("I will do it!");
    }

    @Override
    public void greeting() {
        System.out.println("Greetings! I am " + getName() + "!");
        System.out.println("I'm always ready to fight!");
    }

    @Override
    public void doStep() {
        System.out.println("Only forward!");
    }

    @Override
    public void attack() {
        System.out.println("Attack now! I was born to win!");
    }

}
