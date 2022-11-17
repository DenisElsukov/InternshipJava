package com.internship.game.characters;

import com.internship.game.characters.companion.Companion;
import com.internship.game.characters.specialization.Director;
import com.internship.game.characters.specialization.SpecializationBuilder;
import com.internship.game.characters.specialization.Specialization;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterTest {

    Character wizard;
    Director director = new Director();

    SpecializationBuilder builder = new SpecializationBuilder();
    Specialization specialization;


    @Before
    public void forWarrior() {

        director.createWizard(builder);
        specialization = builder.getResult();

        wizard = new CharacterBuilder()
                .name("Aragorn")
                .gender("male")
                .race("human")
                .specialization(specialization)
                .build();

    }

    @Test
    public void afterCreationWarriorNotNull() {
        Assert.assertNotNull(wizard);
    }

    @Test
    public void assertFieldsOfWizard() {
        Assert.assertEquals(9, wizard.getSpecialization().getAgility(),0);
        Assert.assertEquals(11, wizard.getSpecialization().getEnergy(),0);
        Assert.assertEquals(12, wizard.getSpecialization().getIntelligence(),0);
        Assert.assertEquals(10, wizard.getSpecialization().getSpeed(),0);


        Assert.assertNull(wizard.getCompanion());
        Assert.assertNull(wizard.getEquipment());

        wizard.setCompanion(Companion.TIGER);
        Character.companionGivePower(wizard.getCompanion(), wizard);

        Assert.assertEquals(Companion.TIGER, wizard.getCompanion());
        Assert.assertNotNull(wizard.getCompanion());
        Assert.assertEquals(12, wizard.getSpecialization().getEnergy(),0);
//
//        wizard.setEquipment(Equipment.SHINOBI_SHADOW);
//        CharacterFactory.equipmentChangeCharacteristics(wizard.getEquipment(), wizard);
//
//        Assert.assertEquals(Equipment.SHINOBI_SHADOW, wizard.getEquipment());
//        Assert.assertNotNull(wizard.getEquipment());
//        Assert.assertEquals(13, wizard.getSpeed(),0);

    }
}
