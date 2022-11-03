package com.internship.game.characters.builders;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CharactersBuilder builder = new CharactersBuilder();
        director.constructRogue(builder);
        Character character =  builder.getResult();
        System.out.println(character.getType());
        CharactersManualBuilder manual = new CharactersManualBuilder();
        director.constructRogue(manual);
        Manual characterManual = manual.getResult();
        System.out.println("Сharacteristics: \n" + characterManual.print());
    }
}
