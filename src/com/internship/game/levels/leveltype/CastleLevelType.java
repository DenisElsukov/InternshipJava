package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.monster;

public class CastleLevelType extends LevelType {

    public CastleLevelType(){
        setSetMonster(addMonster(monster.KOBOLD, monster.FALLEN_ANGEL, monster.STONE_GARGOYLE));
        setGreeting("Welcome to the Castle");
    }
}
