package com.internship.game.characters.builders;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CharactersBuilder builder = new CharactersBuilder();

        director.constructRogue(builder);
        Character character =  builder.getResult();
        System.out.println(character.getType());
        CharacterType characterType = CharacterType.ROGUE;
        System.out.println(characterType.getGreeting());
        CharactersManualBuilder manual = new CharactersManualBuilder();
        director.constructRogue(manual);
        Manual characterManual = manual.getResult();
        System.out.println("Сharacteristics: \n" + characterManual.print());

        director.constructWizard(builder);
        Character character1 = builder.getResult();
        System.out.println(character1.getType());
        CharacterType characterType1 = CharacterType.WIZARD;
        System.out.println(characterType1.getGreeting());
        CharactersManualBuilder manual1 = new CharactersManualBuilder();
        director.constructWizard(manual1);
        Manual characterManual1 = manual1.getResult();
        System.out.printf("Сharacteristics: \n" + characterManual1.print());
        
        director.constructWarrior(builder);
        Character character2 = builder.getResult();
        System.out.println(character2.getType());
        CharacterType characterType2 = CharacterType.WARRIOR;
        System.out.println(characterType2.getGreeting());
        CharactersManualBuilder manual2 = new CharactersManualBuilder();
        director.constructWarrior(manual2);
        Manual characterManual2 = manual2.getResult();
        System.out.println("Сharacteristics: \n" + characterManual2.print());
    }
}
