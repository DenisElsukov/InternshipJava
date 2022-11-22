package com.internship.game.characters.builders;
import java.io.IOException;
import java.util.Scanner;

public class Director {

    public void constructRogue(Builder builder) throws IOException {
        builder.setCharacterType(CharacterType.ROGUE);
        builder.buildCompanion();
        builder.buildWeapon();
        builder.buildEquipment();
    }
    public void constructWizard(Builder builder) throws IOException {
        builder.setCharacterType(CharacterType.WIZARD);
        builder.buildCompanion();
        builder.buildWeapon();
        builder.buildEquipment();
    }
    public void constructWarrior(Builder builder) throws IOException {
        builder.setCharacterType(CharacterType.WARRIOR);
        builder.buildCompanion();
        builder.buildWeapon();
        builder.buildEquipment();
    }
    public void characterEditor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new name: ");
        String characterName = sc.nextLine();
        System.out.println("Choose your gender:");
        String characterGender = sc.nextLine();
        System.out.println("Choose your race:");
        String characterRace = sc.nextLine();
    }
}

