package com.internship.game.characters;
public class Rogue extends AbstractCharacter {
    private final double buffForRogueAgility = 4.0;
    private final double buffForRogueEnergy = 1.5;
    private final double buffForRogueIntelligence = 0.2;

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
        System.out.println(rogue.getSpeed() + rogue.buffForRogueAgility);
        System.out.println(rogue.getSpeed() + rogue.buffForRogueEnergy);
        System.out.println(rogue.getSpeed() + rogue.buffForRogueIntelligence);
    } */
}
