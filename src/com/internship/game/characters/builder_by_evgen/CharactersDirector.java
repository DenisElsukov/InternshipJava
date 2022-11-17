package com.internship.game.characters.builder_by_evgen;

public class CharactersDirector {
    CharactersBuilder builder;

    public void setBuilder(CharactersBuilder builder){
        this.builder = builder;
    }

    Character buildCharacter(){
        builder.createCharacter();
        builder.buildName();
        builder.buildGender();
        builder.buildRace();
        builder.buildCompanion();
        builder.buildWeapon();
        builder.buildEquipment();

        Character character = builder.getCharacter();
        return character;
    }
}
