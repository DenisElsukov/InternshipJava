package com.internship.game.characters.NPC;

public enum NPC {
    CERBERUS("Roarrr"),HERMIT ("God bless you!"), GREMLIN("Very well, my friend"), DWARF ("Yep"); //ребят, у кого есть другие идеи/варианты, добавляйте)
    private String sounds;
    NPC (String sounds) {
        this.sounds = sounds;
    }
    public String getSounds() {
        return sounds;
    }

}
