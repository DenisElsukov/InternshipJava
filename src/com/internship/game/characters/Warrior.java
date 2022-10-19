package com.internship.game.characters;

public class Warrior extends AbstractCharacter {

    private final static double ENERGY = 14;
    private final static int SPEED = 10;
    private final static double INTELLIGENCE = 12;
    private final static double AGILITY = 11;

    public Warrior(String name, String race, String gender) {
        super(name, race, gender, SPEED, ENERGY, INTELLIGENCE, AGILITY);
    }

    @Override
    public void actions() {
        System.out.println("I will do it!");
    }

    @Override
    public void greeting() {
        System.out.println("Greetings! I'm always ready to fight!");
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
