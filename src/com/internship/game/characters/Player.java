package com.internship.game.characters;

public class Player extends AbstractCharacter {

    public static void main(String[] args) {


        Player player = new Player();
        player.getAgility();
        player.getEnergy();
        player.getIntelligence();
        player.getSpeed();

        player.setRace("human");
        player.setGender("Male");

    }


}
