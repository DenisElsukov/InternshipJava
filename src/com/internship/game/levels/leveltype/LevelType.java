package com.internship.game.levels.leveltype;

import com.internship.game.characters.monsters.monster;

import java.util.HashSet;
import java.util.Set;

public class LevelType {

    private String greeting;
    private Set setMonster;




    <T extends monster> Set addMonster(T ... monsterArray){
//        Collections.addAll(setMonster, monsterArray);
        Set<T> setMonster = new HashSet<>();
        for (T o : monsterArray){
            setMonster.add(o);
        }
        return setMonster;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Set getSetMonster() {
        return setMonster;
    }

    public void setSetMonster(Set setMonster) {
        this.setMonster = setMonster;
    }


}
