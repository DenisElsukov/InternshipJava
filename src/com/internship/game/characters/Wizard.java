package com.internship.game.characters;

public class Wizard extends AbstractCharacter {
//    public static void main(String[] args) {
//        Wizard wizard = new Wizard();
//        System.out.println(wizard.intelligence);
//    }

    // Buffs by Hero's class
    private final int SPEEDDIFFERENCE = 0;
    private final double ENERGYDIFFERENCE = 1;
    private final double INTELLIGENCEDIFFERENCE = 2;
    private final double AGILITYDIFFERENCE = -1;

    private int speed = getSpeed() + SPEEDDIFFERENCE;
    private double energy = getEnergy() + ENERGYDIFFERENCE;
    private double intelligence = getIntelligence() + INTELLIGENCEDIFFERENCE;
    private double agility = getAgility() + AGILITYDIFFERENCE;


    @Override
    public void greeting(){
        System.out.println("'My name is " + getAgility() + "you done rightly choice'");
    }
    @Override
    public void doStep(){
        System.out.println("'A wizard is never late. He arrives precisely when he means to'");
        System.out.println("Wizard do step");
    }
    @Override
    public void actions(){
        System.out.println("'I'm too old for this shit'");
        System.out.println("Wizard do what you order");
    }

    @Override
    public void attack(){
        System.out.println("'You shall not pass!'");
        System.out.println("Wizard attack enemy");
    }
    public void attackByStaff(){
        System.out.println("Wizard attack by staff");
    }
    public void attackByMagick(String magicElement){
        System.out.println("Wizard attack by " + magicElement);
    }


}
