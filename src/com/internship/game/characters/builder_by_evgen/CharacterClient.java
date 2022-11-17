package com.internship.game.characters.builder_by_evgen;

import static com.internship.game.characters.builder_by_evgen.Character.printCharacterSummary;

public class CharacterClient {
    public static void main(String[] args) {


        CharactersDirector director = new CharactersDirector();

        director.setBuilder(new CreateCustomHero());
        Character character = director.buildCharacter();
        printCharacterSummary(character);


    }
}
