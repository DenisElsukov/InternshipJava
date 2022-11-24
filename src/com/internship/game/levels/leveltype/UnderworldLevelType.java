package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.MonsterUnderWorld;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnderworldLevelType extends LevelType {

    public UnderworldLevelType() {
        setSetMonster(addMonster(MonsterUnderWorld.values()));
        setGreeting("Welcome to the Underworld");
    }

    <T extends MonsterUnderWorld> Set addMonster(T... monsterArray) {
        Set<T> setMonster = new HashSet<>();
        Collections.addAll(setMonster, monsterArray);
        return setMonster;
    }
}
