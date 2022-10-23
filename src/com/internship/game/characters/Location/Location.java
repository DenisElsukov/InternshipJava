package com.internship.game.characters.Location;

public enum Location {
    INFERNO ("Lasciate ogne speranza, voi ch'entrate."), TOWER ("If it had been possible to build the Tower of Babel without climbing it, it would have been permitted."),DUNGEON ("Though the dungeon, the scourge, and the executioner be absent, the guilty mind can apply the goad and scorch with blows."), FORTRESS ("A mighty fortress is our God, a bulwark never failing: our helper He amid the flood of mortal ills prevailing.") ;
    private String greetings;
    Location (String greetings) {
this.greetings = greetings;
    }
    public String getGreetings() {
        return greetings;
    }
}
