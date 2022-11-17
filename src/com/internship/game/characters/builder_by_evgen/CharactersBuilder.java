package com.internship.game.characters.builder_by_evgen;

public abstract class CharactersBuilder {

    Character character;

    void createCharacter(){
        character = new Character();
    }

    abstract void buildName();
    abstract void buildGender();
    abstract void buildRace();
    abstract void buildCompanion();
    abstract void buildWeapon();
    abstract void buildEquipment();

    abstract void buildAgility();
    abstract void buildEnergy();
    abstract void buildIntelligence();
    abstract void buildSpeed();

    Character getCharacter(){
        return character;
    }

}
