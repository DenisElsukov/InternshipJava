package com.internship.game.characters.characters.specialization;

public class SpecializationBuilder implements Builder {

    private TypeSpecialization typeSpecialization;
    private  double agility;
    private  double energy;
    private  double intelligence;
    private  double speed;

    @Override
    public void setTypeSpecialization(TypeSpecialization typeSpecialization) {
        this.typeSpecialization = typeSpecialization;
    }

    @Override
    public void setAgility(double agility) {
        this.agility = agility;
    }

    @Override
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;

    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Specialization getResult() {
        return new Specialization(typeSpecialization, agility, energy,intelligence, speed);
    }
}
