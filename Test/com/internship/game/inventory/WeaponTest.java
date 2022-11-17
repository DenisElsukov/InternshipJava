package com.internship.game.inventory;

import com.internship.game.characters.builder_by_evgen.Character;
import com.internship.game.characters.CharacterFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeaponTest {
    private final double EPS = 1e-9;
    double defaultSpeed;
    double defaultEnergy;
    double defaultIntelligence;
    double defaultAgility;

    Weapon firstWeapon;
    Weapon secondWeapon;
    Character hero;

    @Before
        public void createWizard(){
        hero = CharacterFactory.createWizardCharacter("Medivh", "male","human");
    }

    @Test
    public void weaponStaffNeedChangeCharacteristics() {
        defaultSpeed = hero.getSpeed();
        defaultEnergy = hero.getEnergy();
        defaultAgility = hero.getAgility();
        defaultIntelligence = hero.getIntelligence();

        hero.setWeapon(Weapon.STAFF);

        CharacterFactory.weaponChangeCharacteristics(hero.getWeapon(), hero);
        Assert.assertEquals(defaultSpeed, hero.getSpeed(), EPS);
        Assert.assertNotEquals(defaultEnergy, hero.getEnergy());
        Assert.assertNotEquals(defaultAgility, hero.getAgility());
        Assert.assertNotEquals(defaultIntelligence, hero.getIntelligence());
    }

    @Test
    public void needToTakeWeapon(){
        hero.setWeapon(Weapon.STAFF);
        Assert.assertNotEquals(firstWeapon, hero.getWeapon());
    }

    @Test
    public void cantHaveTwoWeapon(){
        hero.setWeapon(Weapon.STAFF);
        firstWeapon = hero.getWeapon();
        hero.setWeapon(Weapon.SWORD);
        secondWeapon = hero.getWeapon();
        Assert.assertNotEquals(firstWeapon, hero.getWeapon());
        Assert.assertEquals(secondWeapon, hero.getWeapon());
    }
}
