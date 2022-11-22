package com.internship.game.characters.NPC;

public enum NPC {
    CERBERUS("Roarrr", "*echo*"), HERMIT ("God bless you!", "You shall not murder"), GREMLIN("Very well, my friend", "Excuse me"), DWARF ("Yep", "Such a day"), ELF ("I just like to smile", "They say it's going to rain tonight");
    private String speech1;
    private String speech2;
    NPC (String speech1, String speech2) {
        this.speech1 = speech1;
        this.speech2 = speech2;
    }
    public String getSpeech1() {
        return speech1;
    }
    public String getSpeech2() {
        return speech2;
    }

}
