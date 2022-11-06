package com.internship.game.characters.builders;

public interface Builder {
    void setCharacterType(CharacterType type);
    void setCompanion (Companion companion);
    void setWeapon(Weapon weapon);
    void setEquipment(Equipment equipment);
}
