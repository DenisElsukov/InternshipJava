package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.Wizard;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character character = factory.createCharacter(new Wizard());
    }
}
