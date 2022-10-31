package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.Rogue;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character rogue = factory.characterRogue();
        rogue.greeting();
        factory.printStrings(rogue);
        factory.printCharacteristics(rogue);



        // TODO: create fully initialized characters of all classes
    }
}
