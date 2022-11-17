package com.internship.game.characters;

import com.internship.game.characters.builder_by_evgen.Character;
import com.internship.game.characters.companion.Companion;
import com.internship.game.inventory.Equipment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterFactoryTest {

    Character warrior;

    @Before
    public void forWarrior() {
        warrior = CharacterFactory.createWarriorCharacter("Torin","male", "dwarf");
    }
    @Test
    public void afterCreationWarriorNotNull() {
        Assert.assertNotNull(warrior);
    }

    @Test
    public void assertFieldsOfWarrior() {
        Assert.assertEquals(9, warrior.getSpeed());
        Assert.assertEquals(12, warrior.getEnergy(),0);
        Assert.assertEquals(10, warrior.getAgility(),0);
        Assert.assertEquals(11, warrior.getIntelligence(),0);

        Assert.assertNull(warrior.getCompanion());
        Assert.assertNull(warrior.getEquipment());

        warrior.setCompanion(Companion.TIGER);
        CharacterFactory.companionGivePower(warrior.getCompanion(), warrior);

        Assert.assertEquals(Companion.TIGER, warrior.getCompanion());
        Assert.assertNotNull(warrior.getCompanion());
        Assert.assertEquals(12, warrior.getIntelligence(),0);

        warrior.setEquipment(Equipment.SHINOBI_SHADOW);
        CharacterFactory.equipmentChangeCharacteristics(warrior.getEquipment(), warrior);

        Assert.assertEquals(Equipment.SHINOBI_SHADOW, warrior.getEquipment());
        Assert.assertNotNull(warrior.getEquipment());
        Assert.assertEquals(13, warrior.getSpeed(),0);

    }
}
