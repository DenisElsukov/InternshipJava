package com.internship.game.levels;

import com.internship.game.characters.NPC.NPC;
import com.internship.game.levels.leveltype.CastleLevelType;
import com.internship.game.levels.leveltype.LevelType;
import com.internship.game.levels.leveltype.RockLevelType;

public class DraculaClub extends AbstractLevelStructure {
    public DraculaClub(){
        setLevelName("Club of Dracula");
        setLevelType(new CastleLevelType());
        setSize(100);
        setNpc(NPC.CERBERUS);
    }

    @Override
    public LevelType getLevelType() {
        return super.getLevelType();
    }

    @Override
    public void setLevelType(LevelType levelType) {
        super.setLevelType(levelType);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public NPC getNpc() {
        return super.getNpc();
    }

    @Override
    public void setNpc(NPC npc) {
        super.setNpc(npc);
    }
}
