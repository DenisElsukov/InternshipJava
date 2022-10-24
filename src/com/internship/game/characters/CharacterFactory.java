package com.internship.game.characters;

public class CharacterFactory {

    public CharacterFactory() {
    }

    public Character createCharacter(AbstractCharacter characterClass) {
        Character character = new Character();
        if (characterClass instanceof Wizard) {
            character.updateCharacteristicsByClass(characterClass);
        }

        return character;
    }

    private void printCharacteristics(Character character) {
        System.out.println(character.getAgility());
        System.out.println(character.getIntelligence());
        System.out.println(character.getEnergy());
        System.out.println(character.getSpeed());
    }
}
