package com.internship.game;

import com.internship.game.characters.Character;
import com.internship.game.characters.CharacterFactory;
import com.internship.game.characters.Environment.TimesDay;
import com.internship.game.characters.Warrior;
import com.internship.game.characters.Wizard;
import com.internship.game.characters.Сompanion.Companion;

public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        Character character = factory.createCharacter(new Wizard());

        Character characterWarrior = factory.createCharacter(new Warrior());
        characterWarrior.setName("Aragorn");
        characterWarrior.setRace("Human");

        factory.printCharacteristics(characterWarrior);

        Companion companionTiger = Companion.TIGER;

        factory.companionGivePower(companionTiger, characterWarrior);
        factory.printCharacteristics(characterWarrior);

        TimesDay timesDaySunset = TimesDay.SUNSET;

        factory.influenceDay(timesDaySunset,characterWarrior);
        factory.printCharacteristics(characterWarrior);

        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();

        System.out.println(warrior1.equals(warrior2));

    }
}
