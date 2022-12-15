package com.internship.game.characters.builders;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) throws IOException {
        EnviromentBuilder enviromentBuilder = new EnviromentBuilder();
        Scanner sc = new Scanner(System.in);
        Director director = new Director();
        CharactersManualBuilder builder = new CharactersManualBuilder();
        System.out.println("Hello, choose you character!");
        String yourCharacter;
        yourCharacter = sc.nextLine();
        switch (yourCharacter) {
            case "rogue":
                CharacterType characterType = CharacterType.ROGUE;
                System.out.println(characterType);
                CharactersManualBuilder manual = new CharactersManualBuilder();
                director.constructRogue(manual);
                Manual characterManual = manual.getResult();
                System.out.println("Info: \n" + characterManual.print());
                System.out.println(characterType.getGreeting());
                director.characterEditor();
                break;
            case "wizard":
                CharacterType characterType1 = CharacterType.WIZARD;
                System.out.println(characterType1);
                CharactersManualBuilder manual1 = new CharactersManualBuilder();
                director.constructWizard(manual1);
                Manual characterManual1 = manual1.getResult();
                System.out.printf("Info: \n" + characterManual1.print());
                System.out.println(characterType1.getGreeting());
                director.characterEditor();
                break;
            case "warrior":
                CharacterType characterType2 = CharacterType.WARRIOR;
                System.out.println(characterType2);
                CharactersManualBuilder manual2 = new CharactersManualBuilder();
                director.constructWarrior(manual2);
                Manual characterManual2 = manual2.getResult();
                System.out.println("Info: \n" + characterManual2.print());
                System.out.println(characterType2.getGreeting());
                director.characterEditor();
                break;
            default :
                System.out.println("Hmmm..");
        }
    }
}

