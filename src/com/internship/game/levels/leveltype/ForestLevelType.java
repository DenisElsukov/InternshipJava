package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.monster;

public class ForestLevelType extends LevelType {

    public ForestLevelType(){
        setSetMonster(addMonster(monster.GRIFFIN, monster.WIGHT));
        setGreeting("Welcome to the Forest");
    }
}
