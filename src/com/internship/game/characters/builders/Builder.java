package com.internship.game.characters.builders;

import java.io.IOException;

public interface Builder {
    void setCharacterType(CharacterType type);
    void setCompanion (Companion companion);
    void setWeapon(Weapon weapon);
    void setEquipment(Equipment equipment);
    abstract void buildCompanion() throws IOException;
    abstract void buildWeapon() throws IOException;
    abstract void buildEquipment() throws IOException;
}
