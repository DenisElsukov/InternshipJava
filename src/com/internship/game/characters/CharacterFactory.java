package com.internship.game.characters;

import com.internship.game.inventory.Equipment;
import com.internship.game.inventory.Weapon;
import com.internship.game.characters.environment.TimesDay;
import com.internship.game.characters.companion.Companion;

public class CharacterFactory {

    public CharacterFactory() {
    }

    // TODO: implement methods to instantiate characters
    // something like that:
    // public Character create<Class>Character(...) { ... }

    public void printCharacteristics(Character character) {
        System.out.println(character.getAgility());
        System.out.println(character.getIntelligence());
        System.out.println(character.getEnergy());
        System.out.println(character.getSpeed());
    }



    public void weaponChangeCharacteristics (Weapon weapon, Character character){

        System.out.println("I choose " + weapon.name());

        switch (weapon.name()) {
            case "FISTS", "STAFF", "SWORD", "AXE", "BOW", "EXCALIBUR", "HOOD_SPIRIT" -> {
                Weapon.boostCharacteristics(weapon, character);
            }
        }
    }

    public void armorChangeCharacteristics (Equipment equipment, Character character){

        System.out.println("I choose " + equipment.name());

        switch (equipment.name()) {
            case "SKIN_ARMOR", "CHAIN_ARMOR", "ARMOR", "WHITE_ROBE", "MITHRIL", "SHINOBI_SHADOW", "GENDER_FUN" -> {
                Equipment.boostCharacteristics(equipment, character);
            }
        }
    }

    public void companionGivePower(Companion companion, Character character) {

        System.out.println(companion.getGreeting());

        switch (companion.name()) {
            case "EAGLE" -> {
                character.setEnergy(character.getEnergy() + 2);
                character.setSpeed(character.getSpeed() + 1);
                System.out.println("Energy +2");
                System.out.println("Speed +1");
            }
            case "SNAKE" -> {
                character.setIntelligence(character.getIntelligence() + 2);
                character.setAgility(character.getAgility() + 1);
                System.out.println("Intelligence +2");
                System.out.println("Agility +1");
            }
            case "BEAR" -> {
                character.setEnergy(character.getEnergy() + 2);
                character.setIntelligence(character.getIntelligence() + 1);
                System.out.println("Energy +2");
                System.out.println("Intelligence +1");
            }
            case "TIGER" -> {
                character.setAgility(character.getAgility() + 2);
                character.setIntelligence(character.getIntelligence() + 1);
                System.out.println("Agility +2");
                System.out.println("Intelligence +1");
            }
            case "RAVEN" -> {
                character.setIntelligence(character.getIntelligence() + 2);
                character.setSpeed(character.getSpeed() + 1);
                System.out.println("Intelligence +2");
                System.out.println("Speed +1");
            }
        }
    }

    public void influenceDay(TimesDay timesDay, Character character) {

        System.out.println(timesDay.getAtmosphereAround());

        switch (timesDay.name()) {
            case "SUNRISE" -> {
                if (character.getRace().equals("Elf")) {
                    character.setIntelligence(character.getIntelligence() + 1);
                    System.out.println("Intelligence +1");
                }
            }
            case "MORNING" -> {
                if (character instanceof Warrior) {
                    character.setEnergy(character.getEnergy() + 1);
                    System.out.println("Energy +1");
                }
            }
            case "NOON" -> {
                if (character.getRace().equals("Gnome")) {
                    character.setSpeed(character.getSpeed() + 1);
                    System.out.println("Speed +1");
                }
            }
            case "EVENING" -> {
                if (character instanceof Wizard) {
                    character.setAgility(character.getAgility() + 1);
                    System.out.println("Agility +1");
                }
                ;
            }
            case "SUNSET" -> {
                if (character.getRace().equals("Human")) {
                    character.setEnergy(character.getEnergy() + 1);
                    System.out.println("Energy +1");
                }
            }
            case "NIGHT" -> {
                if (character.getRace().equals("Orc")) {
                    character.setSpeed(character.getSpeed() + 1);
                    System.out.println("Speed +1");
                }
            }

//            case "FULL_MOON" -> {
//                if (character instanceof Rogue) {
//                    character.setSpeed(character.getSpeed() + 1);
//                    System.out.println("Speed +1")
//                }
//            }
        }
    }
}

