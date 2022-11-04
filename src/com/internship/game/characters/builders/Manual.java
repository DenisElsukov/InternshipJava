package com.internship.game.characters.builders;

public class Manual {
    private final CharacterType type;
    private final int speed;
    private final double agility;
    private final double energy;
    private final double intelligence;
    private final Companion companion;
    private final Weapon weapon;
    private final Equipment equipment;

    public Manual (CharacterType type,int speed,double agility, double energy,double intelligence, Companion companion, Weapon weapon, Equipment equipment) {
        this.type=type;
        this.speed = speed;
        this.agility = agility;
        this.energy = energy;
        this.intelligence = intelligence;
        this.companion = companion;
        this.weapon = weapon;
        this.equipment = equipment;
    }
    public String print() {
        String info = "";
        info += "Speed: " + speed + "\n";
        info += "Agility: " +agility + "\n";
        info += "Energy: " + energy + "\n";
        info += "Intelligence: " + intelligence + "\n";
        info += "Companion: " + companion + "\n";
        info += "+" + companion.getEnergy() + " energy" + "\n";
        info += "Weapon: " + weapon + "\n";
        info += "Equipment: " + equipment + "\n";
        return info;
    }
}
