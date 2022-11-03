package com.internship.game.characters.builders;

public class Manual {
    private final CharacterType type;
    private final int speed;
    private final double agility;
    private final double energy;
    private final double intelligence;
    private final String name;
    private final String gender;
    private final String race;

    public Manual (CharacterType type,int speed,double agility, double energy,double intelligence,String name,String gender, String race) {
        this.type=type;
        this.speed = speed;
        this.agility = agility;
        this.energy = energy;
        this.intelligence = intelligence;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }
    public String print() {
        String info = "";
        info += "Character: " + type + "\n";
        info += "Speed: " + speed + "\n";
        info += "Agility: " +agility + "\n";
        info += "Energy: " + energy + "\n";
        info += "Intelligence: " + intelligence + "\n";
        info += "Name: " + name + "\n";
        info += "Gender: " + gender + "\n";
        info += "Race: " + race + "\n";
        return info;
    }
}
