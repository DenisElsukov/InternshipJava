package com.internship.game.characters;

import com.internship.game.characters.characters.Character;
import com.internship.game.characters.characters.CharacterBuilder;
import com.internship.game.characters.characters.companion.Companion;
import com.internship.game.characters.inventory.Equipment;
import com.internship.game.characters.inventory.Weapon;
import com.internship.game.characters.characters.specialization.Director;
import com.internship.game.characters.characters.specialization.Specialization;
import com.internship.game.characters.characters.specialization.SpecializationBuilder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        SpecializationBuilder builder = new SpecializationBuilder();
        director.createWarrior(builder);

        Specialization specialization = builder.getResult();
        //System.out.println("Specialization create:\n" + specialization.getTypeSpecialization());
        //System.out.println(specialization.getIntelligence());

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
        System.out.println(warrior.toString());

        Character.equipmentChangeCharacteristics(warrior.getEquipment(), warrior);
        System.out.println(warrior.toString());

        Character.companionGivePower(warrior.getCompanion(), warrior);
        System.out.println(warrior.toString());
        Character.printCharacterSummary(warrior);


    }
}

