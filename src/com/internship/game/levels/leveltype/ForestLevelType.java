package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.MonsterForest;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ForestLevelType extends LevelType {

    public ForestLevelType(){
        setSetMonster(addMonster(MonsterForest.values()));
        setGreeting("Welcome to the Forest");
    }
    <T extends MonsterForest> Set addMonster(T... monsterArray) {
        Set<T> setMonster = new HashSet<>();
        Collections.addAll(setMonster, monsterArray);
        return setMonster;
    }
}
