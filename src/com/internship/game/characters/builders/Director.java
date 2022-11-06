package com.internship.game.characters.builders;
import java.util.Scanner;

public class Director {
    public void constructRogue(Builder builder) {
        builder.setCharacterType(CharacterType.ROGUE);
        builder.setCompanion(Companion.EAGLE);
        builder.setWeapon(Weapon.FISTS);
        builder.setEquipment(Equipment.WHITE_ROBE);
    }
    public void constructWizard(Builder builder) {
        builder.setCharacterType(CharacterType.WIZARD);
        builder.setCompanion(Companion.DOG);
        builder.setWeapon(Weapon.STAFF);
        builder.setEquipment(Equipment.SKIN_ARMOR);
    }
    public void constructWarrior(Builder builder) {
        builder.setCharacterType(CharacterType.WARRIOR);
        builder.setCompanion(Companion.SNAKE);
        builder.setWeapon(Weapon.SWORD);
        builder.setEquipment(Equipment.MITHRIL);
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

