package com.internship.game.characters;

public class Wizard extends AbstractCharacter {

    // Buffs by Hero's class
    int speedDifference = 0;
    double energyDifference = 1;
    double intelligenceDifference = 2;
    double agilityDifference = -1;

    private String name;
    int speed = getSpeed() + speedDifference;
    double energy = getEnergy() + energyDifference;
    double intelligence = getIntelligence() + intelligenceDifference;
    double agility = getAgility() + agilityDifference;
    String race;
    String gender;

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
