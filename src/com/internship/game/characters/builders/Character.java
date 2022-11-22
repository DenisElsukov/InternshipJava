package com.internship.game.characters.builders;

import java.util.Scanner;

public class Character {
    private final CharacterType type;
    private final Companion companion;
    private final Weapon weapon;
    private final Equipment equipment;

    public Character (CharacterType type, Companion companion, Weapon weapon, Equipment equipment) {
        this.type=type;
        this.companion = companion;
        this.weapon = weapon;
        this.equipment = equipment;
    }

    public CharacterType getType() {
        return type;
    }

    public Companion getCompanion() {
        return companion;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Equipment getEquipment() {
        return equipment;
    }

}
