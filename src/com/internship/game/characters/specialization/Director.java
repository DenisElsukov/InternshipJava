package com.internship.game.characters.specialization;

public class Director {

    public void createWarrior(Builder builder) {
        builder.setTypeSpecialization(TypeSpecialization.WARRIOR);
        builder.setAgility(TypeSpecialization.WARRIOR.getAgility_basic());
        builder.setIntelligence(TypeSpecialization.WARRIOR.getIntelligence_basic());
        builder.setSpeed(TypeSpecialization.WARRIOR.getSpeed_basic());
        builder.setEnergy(TypeSpecialization.WARRIOR.getEnergy_basic());
    }

    public void createWizard(Builder builder) {
        builder.setTypeSpecialization(TypeSpecialization.WIZARD);
        builder.setAgility(TypeSpecialization.WIZARD.getAgility_basic());
        builder.setIntelligence(TypeSpecialization.WIZARD.getIntelligence_basic());
        builder.setSpeed(TypeSpecialization.WIZARD.getSpeed_basic());
        builder.setEnergy(TypeSpecialization.WIZARD.getEnergy_basic());
    }

    public void createRogue(Builder builder) {
        builder.setTypeSpecialization(TypeSpecialization.ROGUE);
        builder.setAgility(TypeSpecialization.ROGUE.getAgility_basic());
        builder.setIntelligence(TypeSpecialization.ROGUE.getIntelligence_basic());
        builder.setSpeed(TypeSpecialization.ROGUE.getSpeed_basic());
        builder.setEnergy(TypeSpecialization.ROGUE.getEnergy_basic());
    }

}
