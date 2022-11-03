package com.internship.game.characters.builders;

public class Director {
    public void constructRogue(Builder builder) {
        builder.setCharacterType(CharacterType.ROGUE);
        builder.setAgility(14.0);
        builder.setEnergy(11.0);
        builder.setSpeed(10);
        builder.setIntelligence(10.0);
        builder.setName("Mike");
        builder.setGender("Male");
        builder.setRace("Human");
    }
    public void constructWizard(Builder builder) {
        builder.setCharacterType(CharacterType.WIZARD);
        builder.setAgility(10.0);
        builder.setEnergy(11.0);
        builder.setSpeed(10);
        builder.setIntelligence(14.0);
        builder.setName("Merlin");
        builder.setGender("Male");
        builder.setRace("Human");
    }
    public void constructWarrior(Builder builder) {
        builder.setCharacterType(CharacterType.WARRIOR);
        builder.setAgility(12.0);
        builder.setEnergy(14.0);
        builder.setSpeed(10);
        builder.setIntelligence(12.0);
        builder.setName("Arthur");
        builder.setGender("Male");
        builder.setRace("Human");
    }
}
