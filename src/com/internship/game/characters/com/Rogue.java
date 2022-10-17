package com.internship.game.characters;
public class Rogue extends AbstractCharacter{
    @Override
    public double getAgility() {
        return super.getAgility();
    }

    @Override
    public double getEnergy() {
        return super.getEnergy();
    }

    @Override
    public double getIntelligence() {
        return super.getIntelligence();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getRace() {
        return super.getRace();
    }

    @Override
    public void actions() {
        System.out.println("I hop on, you hope");
    }

    @Override
    public void greeting() {
        System.out.println("Hello, i am Jack. I stole an apple for you!");
    }

    @Override
    public void doStep() {
        System.out.println("Hop");
    }

    @Override
    public void attack() {
        System.out.println("\\'Slit!\\' \\'Crrrr!\\'");
    }
}
