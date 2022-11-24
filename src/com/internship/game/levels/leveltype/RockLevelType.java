package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.MonsterRock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RockLevelType extends LevelType {

    public RockLevelType(){
        setSetMonster(addMonster(MonsterRock.values()));
        setGreeting("Welcome to the Rocks");
    }

    <T extends MonsterRock> Set addMonster(T... monsterArray) {
        Set<T> setMonster = new HashSet<>();
        Collections.addAll(setMonster, monsterArray);
        return setMonster;
    }
}
