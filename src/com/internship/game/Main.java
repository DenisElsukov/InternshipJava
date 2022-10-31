package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

public class Main {

    public static void main(String[] args) {
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
