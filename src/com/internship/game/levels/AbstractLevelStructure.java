package com.internship.game.levels;

import com.internship.game.characters.NPC.NPC;
import com.internship.game.characters.monsters.monster;
import com.internship.game.levels.leveltype.LevelType;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLevelStructure {
    private String levelName;
    private int size;
    private LevelType levelType;
    private NPC npc;


    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "New Level" + "\n" +
                "Location = " + getLevelName() + "\n" +
                "size = " + size + "\n" +
                "NPC = " + npc + "\n" +
                "Awaiting monsters=" + levelType.getSetMonster();
    }
}
