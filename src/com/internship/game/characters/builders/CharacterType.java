package com.internship.game.characters.builders;

public enum CharacterType {
    WIZARD ("I think, you done rightly choice", "'I'm too old for this shit", "A wizard is never late. He arrives precisely when he means to", "You shall not pass!",10, 9, 11,13), ROGUE("Hello. I stole an apple for you.", "I hop when you blink", "Hop!", "\\'Slit!\\' \\'Crrrr!\\'", 10, 13, 10.5, 10), WARRIOR("Greetings! I'm always ready to fight!", "I will do it!", "Only forward!" , "Attack now! I was born to win!",9,10,13,11);

    private String greeting;
    private String actions;
    private String doStep;
    private String attack;
    private int speed;
    private double agility;
    private double energy;
    private double intelligence;
    CharacterType (String greeting, String actions, String doStep, String attack,int speed, double agility, double energy, double intelligence) { this.greeting = greeting;
    this.actions = actions;
    this.doStep = doStep;
    this.attack = attack;
    this.speed = speed;
    this.agility = agility;
    this.energy = energy;
    this.intelligence = intelligence; }
    public String getGreeting() {
        return greeting;
    }
    public String getActions(){
        return actions;
    }
    public String getDoStep(){
        return doStep;
    }
    public String getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
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
}
