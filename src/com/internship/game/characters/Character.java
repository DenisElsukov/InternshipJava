package com.internship.game.characters;

import com.internship.game.characters.companion.Companion;
import com.internship.game.characters.specialization.Specialization;
import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;

public class Character {

    private final String name;
    private final String gender;
    private final String race;
    private final Specialization specialization;
    private Companion companion;
    private Equipment equipment;
    private Weapon weapon;


    Character(final CharacterBuilder characterBuilder) {
        this.name = characterBuilder.getName();
        this.gender = characterBuilder.getGender();
        this.race = characterBuilder.getRace();
        this.specialization = characterBuilder.getSpecialization();
    }

    public static void weaponChangeCharacteristics (Weapon weapon, Character character) {

        switch (weapon) {
            case FISTS, STAFF, SWORD, AXE, BOW, EXCALIBUR, HOOD_SPIRIT -> {
                Weapon.boostCharacteristics(weapon, character);
            }
        }
    }

    public static void equipmentChangeCharacteristics (Equipment equipment, Character character){

        switch (equipment) {
            case SKIN_ARMOR, CHAIN_ARMOR, ARMOR, WHITE_ROBE, MITHRIL, SHINOBI_SHADOW, GENDER_FUN -> {
                Equipment.boostCharacteristics(equipment, character);
            }
        }
    }

    public static void companionGivePower (Companion companion, Character character){

        switch (companion) {
            case SNAKE , BEAR , TIGER , RAVEN , DOG, EAGLE  -> {
                Companion.boostCharacteristics(companion, character);
            }
        }
    }

    public static void printCharacterSummary (Character character){
        character.greeting();
        System.out.println("Name :" + character.getName());
        System.out.println("Sex :" + character.getGender());
        System.out.println("Race :" + character.getRace());
        System.out.println();
        System.out.println("Agility :" + character.getSpecialization().getAgility());
        System.out.println("Intelligence :" + character.getSpecialization().getIntelligence());
        System.out.println("Energy :" + character.getSpecialization().getEnergy());
        System.out.println("Speed :" + character.getSpecialization().getSpeed());
        System.out.println("Weapon: " +character.getWeapon());
        System.out.println("Equipment: " +character.getEquipment());
        System.out.println("Companion: " +character.getCompanion());

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println(specialization.getTypeSpecialization().getAttack());
        System.out.println(specialization.getTypeSpecialization().name() + " attack enemy");
    }

    public void actions() {
        System.out.println(specialization.getTypeSpecialization().getActions());
        System.out.println(specialization.getTypeSpecialization().name() + " do what you order");
    }

    public void doStep() {
        System.out.println(specialization.getTypeSpecialization().getDoStep());
        System.out.println(specialization.getTypeSpecialization().name() + " do step");
    }

    public void greeting() {
        System.out.println("My name is " + getName());
        System.out.println(specialization.getTypeSpecialization().getGreeting());
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", companion=" + companion +
                ", equipment=" + equipment +
                ", weapon=" + weapon +
                ", specialization=" + specialization +
                '}';
    }
}

