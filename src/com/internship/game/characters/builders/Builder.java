package com.internship.game.characters.builders;

public interface Builder {
    void setCharacterType(CharacterType type);
    void setSpeed(int speed);
    void setAgility(double agility);
    void setEnergy(double energy);
    void setIntelligence(double intelligence);
    void setName(String name);
    void setGender(String gender);
    void setRace(String race);
    void setCompanion (Companion companion);
    void setWeapon(Weapon weapon);
    void setEquipment(Equipment equipment);
}
