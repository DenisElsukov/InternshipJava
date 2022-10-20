package com.internship.game.characters;
public class Rogue extends AbstractCharacter {

    //Buff
    private final double AGILITY = 4.0;
    private final double ENERGY = 1.5;
    private final double INTELLIGENCE = 0.2;

        @Override
    public void actions() {
        System.out.println("I hop on, you hope");
    }

    @Override
    public void greeting() {
        System.out.println("Hello. I stole an apple for you.");
    }

    @Override
    public void doStep() {
        System.out.println("Hop");
    }

    @Override
    public void attack() {
        System.out.println("\'Slit!\' \'Crrrr!\'");
    }

    /* public static void main(String[] args) {
        Rogue rogue = new Rogue();
        System.out.println(rogue.getSpeed());
        System.out.println(rogue.getSpeed() + rogue.AGILITY);
        System.out.println(rogue.getSpeed() + rogue.ENERGY);
        System.out.println(rogue.getSpeed() + rogue.INTELLIGENCE);
    } */
}
