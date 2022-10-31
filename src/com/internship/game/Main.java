package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.Rogue;
import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

public class Main {

    public static void main(String[] args) {

        CharacterFactory factory = new CharacterFactory();
        Character warrior = factory.createWarriorCharacter("Artur", "male", "Human");
        warrior.greeting();

        System.out.println("\nStarting characteristics warrior:");
        factory.printCharacteristics(warrior);

        Weapon sword = Weapon.SWORD;
        factory.weaponChangeCharacteristics(sword, warrior);
        System.out.println("\nCharacteristics warrior with sword:");
        factory.printCharacteristics(warrior);
        warrior.attack();

        Companion snake = Companion.SNAKE;
        factory.companionGivePower(snake, warrior);
        System.out.println("\nCharacteristics warrior with snake:");
        factory.printCharacteristics(warrior);

        Equipment mithril = Equipment.MITHRIL;
        factory.equipmentChangeCharacteristics(mithril, warrior);
        System.out.println("\nCharacteristics warrior with mithril:");
        factory.printCharacteristics(warrior);


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

