package com.internship.game.characters.builders;


public class CharactersBuilder implements Builder {
    private CharacterType type;
    private Companion companion;
    private Weapon weapon;
    private Equipment equipment;

    @Override
    public void setCharacterType(CharacterType type) {
        this.type = type;
    }

    @Override
    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Character getResult() {
        return new Character (type, companion, weapon, equipment);
 }

}
