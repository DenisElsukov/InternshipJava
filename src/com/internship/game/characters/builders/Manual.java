package com.internship.game.characters.builders;

import java.util.Scanner;

public class Manual {
    private final CharacterType type;
    private final Companion companion;
    private final Weapon weapon;
    private final Equipment equipment;

    public Manual (CharacterType type, Companion companion, Weapon weapon, Equipment equipment) {
        this.type=type;
        this.companion = companion;
        this.weapon = weapon;
        this.equipment = equipment;
    }
    public String print() {
        String info = "";
        info += "Speed: " + type.getSpeed() + "\n";
        info += "Agility: " + type.getAgility() + "\n";
        info += "Energy: " + type.getEnergy() + "\n";
        info += "Intelligence: " + type.getIntelligence() + "\n";
        info += "Companion: " + companion + "\n";
        info += "Weapon: " + weapon + "\n";
        info += "Equipment: " + equipment + "\n";
        return info;
    }
}
