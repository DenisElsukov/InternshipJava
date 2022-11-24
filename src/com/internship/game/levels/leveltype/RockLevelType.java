package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.monster;

public class RockLevelType extends LevelType {

    public RockLevelType(){
        setSetMonster(addMonster(monster.WILD_BOAR, monster.SKELETON, monster.GOG));
        setGreeting("Welcome to the Rocks");
    }
}
