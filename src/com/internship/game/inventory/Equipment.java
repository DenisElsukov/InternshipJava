package com.internship.game.inventory;

public enum Equipment {
    //Armors
    SKINARMOR(0,0,0,1),
    CHAINARMOR(0,1,0,1),
    ARMOR(-1, 2, 0, 1),


    //LEGENDARY ARMOR
    WHITEROBE(0,6,5,0),
    MITHRIL(2,4,2,3),
    SHINOBYSHADOW(4,2,0,5),
    GENDER_FUN(0,0,0,0),

    //Artifacts
    RING_OF_POWER(5,5,5,5);

    private int speedDifferense;
    private int energyDifference;
    private int intelligenceDifference;
    private int agilityDifference;

    private Equipment(int speedDifferense, int energyDifference, int intelligenceDifference, int agilityDifference){

    }
}
