package com.internship.game.characters.characters.specialization;

public class Specialization {
    private  final TypeSpecialization typeSpecialization;
    private  double agility;
    private  double energy;
    private  double intelligence;
    private  double speed;

    public Specialization(TypeSpecialization typeSpecialization, double agility, double energy, double intelligence, double speed) {
        this.typeSpecialization = typeSpecialization;
        this.agility = agility;
        this.energy = energy;
        this.intelligence = intelligence;
        this.speed = speed;
    }

    public TypeSpecialization getTypeSpecialization() {
        return typeSpecialization;
    }

    public double getAgility() {
        return agility;
    }

    public double getEnergy() {
        return energy;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public double getSpeed() {
        return speed;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "typeSpecialization=" + typeSpecialization +
                ", agility=" + agility +
                ", energy=" + energy +
                ", intelligence=" + intelligence +
                ", speed=" + speed +
                '}';
    }
}
