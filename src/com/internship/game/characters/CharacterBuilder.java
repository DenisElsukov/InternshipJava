package com.internship.game.characters;

import com.internship.game.characters.specialization.Specialization;
import com.internship.game.characters.companion.Companion;

public class CharacterBuilder {

    private String name;
    private String gender;
    private String race;
    private Specialization specialization;
    private Companion companion;

    public CharacterBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder gender(final String gender) {
        this.gender = gender;
        return this;
    }

    public CharacterBuilder race(final String race) {
        this.race = race;
        return this;
    }

    public CharacterBuilder specialization(final Specialization specialization) {
        this.specialization = specialization;
        return this;
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

    public Character build() {
        return new Character(this);
    }
}
