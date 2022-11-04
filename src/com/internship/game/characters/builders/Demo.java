package com.internship.game.characters.builders;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Director director = new Director();
        CharactersBuilder builder = new CharactersBuilder();

        // Rogue
        director.constructRogue(builder);
        Character character =  builder.getResult();
        System.out.println(character.getType());
        CharacterType characterType = CharacterType.ROGUE;
        CharactersManualBuilder manual = new CharactersManualBuilder();
        director.constructRogue(manual);
        Manual characterManual = manual.getResult();
        System.out.println("Info: \n" + characterManual.print());
        director.characterEditor();
        System.out.println(characterType.getGreeting());
        System.out.println("Do you want to select another character?");
        String selection = sc.nextLine();

        // Wizard
        director.constructWizard(builder);
        Character character1 = builder.getResult();
        System.out.println(character1.getType());
        CharacterType characterType1 = CharacterType.WIZARD;
        CharactersManualBuilder manual1 = new CharactersManualBuilder();
        director.constructWizard(manual1);
        Manual characterManual1 = manual1.getResult();
        System.out.printf("Info: \n" + characterManual1.print());
        director.characterEditor();
        System.out.println(characterType1.getGreeting());
        System.out.println("Do you want to select another character?");
        String selection1 = sc.nextLine();

        // Warrior
        director.constructWarrior(builder);
        Character character2 = builder.getResult();
        System.out.println(character2.getType());
        CharacterType characterType2 = CharacterType.WARRIOR;
        CharactersManualBuilder manual2 = new CharactersManualBuilder();
        director.constructWarrior(manual2);
        Manual characterManual2 = manual2.getResult();
        System.out.println("Info: \n" + characterManual2.print());
        director.characterEditor();
        System.out.println(characterType2.getGreeting());
        System.out.println("Do you want to select another character?");
        String selection2 = sc.nextLine();
    }
}

