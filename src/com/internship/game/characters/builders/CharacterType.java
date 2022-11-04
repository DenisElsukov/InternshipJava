package com.internship.game.characters.builders;

public enum CharacterType {
    WIZARD ("My name is Merlin, you done rightly choice", "'I'm too old for this shit", "A wizard is never late. He arrives precisely when he means to", "You shall not pass!"), ROGUE("Hello. I stole an apple for you.", "I hop when you blink", "Hop!", "\\'Slit!\\' \\'Crrrr!\\'"), WARRIOR("Greetings! I am Arthur! I'm always ready to fight!", "I will do it!", "Only forward!" , "Attack now! I was born to win!");

    private String greeting;
    private String actions;
    private String doStep;
    private String attack;
    CharacterType (String greeting, String actions, String doStep, String attack) { this.greeting = greeting;
    this.actions = actions;
    this.doStep = doStep;
    this.attack = attack; }
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
}
