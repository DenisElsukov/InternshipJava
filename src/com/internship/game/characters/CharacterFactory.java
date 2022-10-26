package com.internship.game.characters;

import com.internship.game.characters.Environment.TimesDay;
import com.internship.game.characters.Сompanion.Companion;

public class CharacterFactory {

    public CharacterFactory() {
    }

    public Character createCharacter(AbstractCharacter characterClass) {
        Character character = new Character();
        if (characterClass instanceof Wizard) {
            character.updateCharacteristicsByClass(characterClass);
        }

        if (characterClass instanceof Warrior) {
            character.updateCharacteristicsByClass(characterClass);
        }

        return character;
    }

    public void printCharacteristics(Character character) {
        System.out.println(character.getAgility());
        System.out.println(character.getIntelligence());
        System.out.println(character.getEnergy());
        System.out.println(character.getSpeed());
    }

    public void companionGivePower(Companion companion, Character character) {

        System.out.println(companion.getGreeting());

        switch (companion) {
            case EAGLE -> {
                character.setEnergy(character.getEnergy() + 2);
                character.setSpeed(character.getSpeed() + 1);
                System.out.println("Energy +2");
                System.out.println("Speed +1");
            }
            case SNAKE -> {
                character.setIntelligence(character.getIntelligence() + 2);
                character.setAgility(character.getAgility() + 1);
                System.out.println("Intelligence +2");
                System.out.println("Agility +1");
            }
            case BEAR -> {
                character.setEnergy(character.getEnergy() + 2);
                character.setIntelligence(character.getIntelligence() + 1);
                System.out.println("Energy +2");
                System.out.println("Intelligence +1");
            }
            case TIGER -> {
                character.setAgility(character.getAgility() + 2);
                character.setIntelligence(character.getIntelligence() + 1);
                System.out.println("Agility +2");
                System.out.println("Intelligence +1");
            }
            case RAVEN -> {
                character.setIntelligence(character.getIntelligence() + 2);
                character.setSpeed(character.getSpeed() + 1);
                System.out.println("Intelligence +2");
                System.out.println("Speed +1");
            }
        }
    }

    public void influenceDay(TimesDay timesDay, Character character) {

        System.out.println(timesDay.getAtmosphereAround());

        switch (timesDay) {
            case SUNRISE -> {
                if (character.getRace().equals("Elf")) {
                    character.setIntelligence(character.getIntelligence() + 1);
                    System.out.println("Intelligence +1");
                }
            }
            case MORNING -> {
                if (character instanceof Warrior) {
                    character.setEnergy(character.getEnergy() + 1);
                    System.out.println("Energy +1");
                }
            }
            case NOON -> {
                if (character.getRace().equals("Gnome")) {
                    character.setSpeed(character.getSpeed() + 1);
                    System.out.println("Speed +1");
                }
            }
            case EVENING -> {
                if (character instanceof Wizard) {
                    character.setAgility(character.getAgility() + 1);
                    System.out.println("Agility +1");
                }
                ;
            }
            case SUNSET -> {
                if (character.getRace().equals("Human")) {
                    character.setEnergy(character.getEnergy() + 1);
                    System.out.println("Energy +1");
                }
            }
            case NIGHT -> {
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

