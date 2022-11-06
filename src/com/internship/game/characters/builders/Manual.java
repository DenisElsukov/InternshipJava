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
        info += type.getEnergy() + companion.getEnergy() + " your energy now" + "\n";
        info += "Weapon: " + weapon + "\n";
        info += (weapon.getSpeedDifference() + type.getSpeed()) + "\n";
        info += (weapon.getAgilityDifference() + type.getAgility()) + "\n";
        info += (weapon.getEnergyDifference() + type.getEnergy()) + companion.getEnergy() + "\n";
        info += (weapon.getIntelligenceDifference() + type.getIntelligence()) + "\n";
        info += "Equipment: " + equipment + "\n";
        info += (equipment.getSpeedDifference() + type.getSpeed()) + weapon.getSpeedDifference()  + "\n";
        info += (equipment.getAgilityDifference() + type.getAgility()) + weapon.getAgilityDifference() + "\n";
        info += (equipment.getEnergyDifference() + type.getEnergy() + weapon.getEnergyDifference() + companion.getEnergy()) + "\n";
        info += (equipment.getIntelligenceDifference() + type.getIntelligence()) + weapon.getIntelligenceDifference() + "\n";
        return info;
    }
}
