package com.internship.game.characters.specialization;

public enum TypeSpecialization {
    WIZARD(10,11,12,9,
            "You shall not pass!",
            "'I'm too old for this shit'",
            "Wizard do step",
            "you done rightly choice"),
    ROGUE(10,11.5,10.5,14,
            "\\'Slit!\\' \\'Crrrr!\\'",
            "I hop when you blink",
            "Hop",
            "Hello. I stole an apple for you."),
    WARRIOR(9,12,11,10,
            "Attack now! I was born to win!",
            "I will do it!",
            "Only forward!",
            "I'm always ready to fight!");

    private final int speed_basic;
    private final double energy_basic;
    private final double intelligence_basic;
    private final double agility_basic;

    private final String attack;
    private final String actions;
    private final String doStep;
    private final String greeting;


    TypeSpecialization(int speed_basic, double energy_basic, double intelligence_basic, double agility_basic, String attack, String actions, String doStep, String greeting) {
        this.speed_basic = speed_basic;
        this.energy_basic = energy_basic;
        this.intelligence_basic = intelligence_basic;
        this.agility_basic = agility_basic;
        this.attack = attack;
        this.actions = actions;
        this.doStep = doStep;
        this.greeting = greeting;
    }

    public int getSpeed_basic() {
        return speed_basic;
    }

    public double getEnergy_basic() {
        return energy_basic;
    }

    public double getIntelligence_basic() {
        return intelligence_basic;
    }

    public double getAgility_basic() {
        return agility_basic;
    }

    public String getAttack() {
        return attack;
    }

    public String getActions() {
        return actions;
    }

    public String getDoStep() {
        return doStep;
    }

    public String getGreeting() {
        return greeting;
    }
}
