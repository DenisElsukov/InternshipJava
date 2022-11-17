package com.internship.game.characters;

import com.internship.game.characters.builder_by_evgen.Character;

public class Rogue extends Character {

    //Buff
    private final double AGILITY = 4.0;
    private final double ENERGY = 1.5;
    private final double INTELLIGENCE = 0.5;
    private final String NAME = "Mike";
    private final String GENDER = "Male";
    private final String RACE = "Human";

    public Rogue() {
        setSpeed(getSpeed());
        setAgility(getAgility()+ AGILITY);
        setEnergy(getEnergy() + ENERGY);
        setIntelligence(getIntelligence() + INTELLIGENCE);
        setName(NAME);
        setGender(GENDER);
        setRace(RACE);
    }

//    @Override
//    public void actions() {
//        System.out.println("I hop when you blink");
//    }
//
//    @Override
//    public void greeting() {
//        System.out.println("Hello. I stole an apple for you.");
//    }
//
//    @Override
//    public void doStep() {
//        System.out.println("Hop");
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("\'Slit!\' \'Crrrr!\'");
//    }
}
