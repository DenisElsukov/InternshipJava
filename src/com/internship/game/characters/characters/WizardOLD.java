package com.internship.game.characters.characters;

public class WizardOLD {

    // Buffs by Hero's class
    private final int SPEED_DIFFERENCE = 0;
    private final double ENERGY_DIFFERENCE = 1;
    private final double INTELLIGENCE_DIFFERENCE = 2;
    private final double AGILITY_DIFFERENCE = -1;

//    public Wizard() {
//        setIntelligence(getIntelligence() + INTELLIGENCE_DIFFERENCE);
//        setAgility(getAgility() + AGILITY_DIFFERENCE);
//        setEnergy(getEnergy() + ENERGY_DIFFERENCE);
//        setSpeed(getSpeed() + SPEED_DIFFERENCE);
//    }
//
//    @Override
//    public void greeting() {
//        System.out.println("'My name is " + getName() + ", you done rightly choice'");
//    }
//
//    @Override
//    public void doStep() {
//        System.out.println("'A wizard is never late. He arrives precisely when he means to'");
//        System.out.println("Wizard do step");
//    }
//
//    @Override
//    public void actions() {
//        System.out.println("'I'm too old for this shit'");
//        System.out.println("Wizard do what you order");
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("'You shall not pass!'");
//        System.out.println("Wizard attack enemy");
//    }

    public void attackByStaff() {
        System.out.println("Wizard attack by staff");
    }

    public void attackByMagick(String magicElement) {
        System.out.println("Wizard attack by " + magicElement);
    }



}
