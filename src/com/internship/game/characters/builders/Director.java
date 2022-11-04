package com.internship.game.characters.builders;
import java.util.Scanner;

public class Director {
    public void constructRogue(Builder builder) {
        builder.setCharacterType(CharacterType.ROGUE);
        builder.setAgility(14);
        builder.setSpeed(10);
        builder.setEnergy(11);
        builder.setIntelligence(10);
        builder.setCompanion(Companion.EAGLE);
        builder.setWeapon(Weapon.FISTS);
        builder.setEquipment(Equipment.WHITE_ROBE);
    }
    public void constructWizard(Builder builder) {
        builder.setCharacterType(CharacterType.WIZARD);
        builder.setAgility(10.0);
        builder.setEnergy(11.0);
        builder.setSpeed(10);
        builder.setIntelligence(14.0);
        builder.setCompanion(Companion.DOG);
        builder.setWeapon(Weapon.STAFF);
        builder.setEquipment(Equipment.SKIN_ARMOR);
    }
    public void constructWarrior(Builder builder) {
        builder.setCharacterType(CharacterType.WARRIOR);
        builder.setAgility(12.0);
        builder.setEnergy(14.0);
        builder.setSpeed(10);
        builder.setIntelligence(12.0);
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

