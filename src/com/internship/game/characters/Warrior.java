package com.internship.game.characters;

public class Warrior extends AbstractCharacter {

    //  Warrior characteristics:
    private final static double ENEGRY = 14;
    private final static int SPEED = 10;
    private final static double INTELLIGENCE = 12;
    private final static double AGILITY = 11;

    /*CONSTRUCTOR*/

    public Warrior(String name, String race, String gender) {
        super(name, race, gender, SPEED, ENEGRY, INTELLIGENCE, AGILITY);
    }
    
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getRace() {
        return super.getRace();
    }

    @Override
    public void setRace(String race) {
        super.setRace(race);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public double getAgility() {
        return super.getAgility();
    }

    @Override
    public void setAgility(double agility) {
        super.setAgility(agility);
    }


    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public double getEnergy() {
        return super.getEnergy();
    }

    @Override
    public void setEnergy(double energy) {
        super.setEnergy(energy);
    }

    @Override
    public double getIntelligence() {
        return super.getIntelligence();
    }

    @Override
    public void setIntelligence(double intelligence) {
        super.setIntelligence(intelligence);
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
