package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.Rogue;
import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactory();
        Character warrior = CharacterFactory.createWarriorCharacter("Artur", "male", "Human");

        System.out.println("\nStarting characteristics warrior:");
        CharacterFactory.printCharacterSummary(warrior);

        warrior.setWeapon(Weapon.SWORD);
        CharacterFactory.weaponChangeCharacteristics(warrior.getWeapon(), warrior);
        warrior.attack();

        warrior.setCompanion(Companion.SNAKE);
        CharacterFactory.companionGivePower(warrior.getCompanion(), warrior);

        warrior.setEquipment(Equipment.MITHRIL);
        CharacterFactory.equipmentChangeCharacteristics(warrior.getEquipment(), warrior);
        System.out.println("\nCharacteristics warrior with mithril, sword and mithril:");
        CharacterFactory.printCharacterSummary(warrior);


        Character rogue = factory.characterRogue();
        rogue.greeting();
        factory.printCharacteristics(rogue);

        Character wizard = CharacterFactory.createWizardCharacter("Gandalf", "male", "human");

        wizard.setWeapon(Weapon.STAFF);
        wizard.setEquipment(Equipment.SKIN_ARMOR);
        wizard.setCompanion(Companion.BEAR);

        CharacterFactory.weaponChangeCharacteristics(wizard.getWeapon(), wizard);
        CharacterFactory.equipmentChangeCharacteristics(wizard.getEquipment(), wizard);
        CharacterFactory.companionGivePower(wizard.getCompanion(), wizard);

        CharacterFactory.printCharacterSummary(wizard);

    }
}

