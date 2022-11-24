package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.MonsterCastle;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CastleLevelType extends LevelType {

    public CastleLevelType(){
        setSetMonster(addMonster(MonsterCastle.values()));
        setGreeting("Welcome to the Castle");
    }
    <T extends MonsterCastle> Set addMonster(T ... monsterArray){
        Set<T> setMonster = new HashSet<>();
        Collections.addAll(setMonster, monsterArray);
        return setMonster;
    }
}
