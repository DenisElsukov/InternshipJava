package com.internship.game.characters;
public class Rogue extends AbstractCharacter {

    public void setAgility(double agility) {
        setAgility(9.88);
    }
    public void setName(String name) {
        setName("Jack");
    }
    public void setSpeed(int movement) {
        setSpeed(7);
    }
    public void setEnergy(double energy) {
        setEnergy(6.45);
    }
    public void setRace(String race) {
        setRace("human");
    }
    public void setGender(String gender) {
        setGender("male") ;
    }
    public void setIntelligence(double intelligence) {
        setIntelligence(3.54);
    }
        @Override
    public void actions() {
        System.out.println("I hop on, you hope");
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I am Jack. I stole an apple for you.");
    }

    @Override
    public void doStep() {
        System.out.println("Hop");
    }

    @Override
    public void attack() {
        System.out.println("\'Slit!\' \'Crrrr!\'");
    }
}
