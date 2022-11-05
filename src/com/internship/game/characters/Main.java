package com.internship.game.characters;

import com.internship.game.characters.characters.Character;
import com.internship.game.characters.characters.CharacterBuilder;
import com.internship.game.characters.characters.companion.Companion;
import com.internship.game.characters.inventory.Equipment;
import com.internship.game.characters.inventory.Weapon;
import com.internship.game.characters.characters.specialization.Director;
import com.internship.game.characters.characters.specialization.Specialization;
import com.internship.game.characters.characters.specialization.SpecializationBuilder;

import java.lang.ref.SoftReference;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        SpecializationBuilder builder = new SpecializationBuilder();

        System.out.println("\nCreate Warrior\n");
        director.createWarrior(builder);

        Specialization specialization = builder.getResult();

        Character warrior = new CharacterBuilder()
                .name("Aragorn")
                .gender("male")
                .race("human")
                .specialization(specialization)
                .build();

        System.out.println(warrior.toString());

        warrior.attack();

        warrior.setCompanion(Companion.EAGLE);
        warrior.setEquipment(Equipment.SKIN_ARMOR);
        warrior.setWeapon(Weapon.SWORD);

        Character.weaponChangeCharacteristics(warrior.getWeapon(), warrior);
        Character.equipmentChangeCharacteristics(warrior.getEquipment(), warrior);
        Character.companionGivePower(warrior.getCompanion(), warrior);

        Character.printCharacterSummary(warrior);

        System.out.println("\nCreate Wizard\n");

        director.createWizard(builder);
        Specialization specialization1 = builder.getResult();

        Character wizard = new CharacterBuilder()
                .name("Gendalf")
                .race("spirit")
                .gender("male")
                .specialization(specialization1)
                .build();

        wizard.setCompanion(Companion.DOG);
        wizard.setEquipment(Equipment.WHITE_ROBE);
        wizard.setWeapon(Weapon.HOOD_SPIRIT);

        Character.weaponChangeCharacteristics(wizard.getWeapon(), wizard);
        Character.equipmentChangeCharacteristics(wizard.getEquipment(), wizard);
        Character.companionGivePower(wizard.getCompanion(), wizard);

        Character.printCharacterSummary(wizard);

        System.out.println("\nCreate Rogue\n");

        director.createRogue(builder);
        Specialization specialization2 = builder.getResult();

        Character rogue = new CharacterBuilder()
                .name("Jack")
                .race("elf")
                .gender("male")
                .specialization(specialization2)
                .build();

        rogue.setCompanion(Companion.RAVEN);
        rogue.setEquipment(Equipment.GENDER_FUN);
        rogue.setWeapon(Weapon.BOW);

        Character.weaponChangeCharacteristics(rogue.getWeapon(), rogue);
        Character.equipmentChangeCharacteristics(rogue.getEquipment(), rogue);
        Character.companionGivePower(rogue.getCompanion(), rogue);

        Character.printCharacterSummary(rogue);

    }
}

