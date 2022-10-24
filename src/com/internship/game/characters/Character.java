package com.internship.game.characters;

public class Character extends AbstractCharacter {
    private String name;
    private String gender;


    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}' + "\n" + "Character{" + "gender='" + gender + '\'' + '}' ;
    }


}
