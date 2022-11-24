package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.monster;

public class UnderworldLevelType extends LevelType {

    public UnderworldLevelType() {
        setSetMonster(addMonster(monster.HARPY, monster.MEDUSA, monster.NAGA));
        setGreeting("Welcome to the Underworld");
    }
}
