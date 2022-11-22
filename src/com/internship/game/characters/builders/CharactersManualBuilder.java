package com.internship.game.characters.builders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharactersManualBuilder implements Builder {
    private CharacterType type;
    private Companion companion;
    private Weapon weapon;
    private Equipment equipment;

    @Override
    public void setCharacterType(CharacterType type) {
        this.type = type;
    }

    @Override
    public void setCompanion(Companion companion) {
     this.companion = companion;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void buildCompanion() throws IOException {
        System.out.println("Choose your companion: \n" + " 1.snake  2.tiger  3.bear  4.dog  5.eagle  6.raven");
        setCompanion(chooseCompanion());
    }

    @Override
    public void buildWeapon() throws IOException {
        System.out.println("Choose your weapon: \n" + "1.sword  2.bow  3.axe  4.staff  5.fists ");
        setWeapon(chooseWeapon());
    }

    @Override
    public void buildEquipment() throws IOException {
        System.out.println("Choose your equipment: \n" + "1.skin armor  2.chain armor  3.armor");
        setEquipment(chooseEquipment());
    }
    Companion chooseCompanion() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "snake": setCompanion(Companion.SNAKE);
                break;
            case "tiger": setCompanion(Companion.TIGER);
                break;
            case "bear": setCompanion(Companion.BEAR);
                break;
            case "dog": setCompanion(Companion.DOG);
                break;
            case "eagle": setCompanion(Companion.EAGLE);
                break;
            case "raven": setCompanion(Companion.RAVEN);;
                break;
        }
        return companion;
    }

    Weapon chooseWeapon() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "sword": setWeapon(Weapon.SWORD);
                break;
            case "bow": setWeapon(Weapon.BOW);
                break;
            case "axe": setWeapon(Weapon.AXE);
                break;
            case "staff": setWeapon(Weapon.STAFF);
                break;
            case "fists": setWeapon(Weapon.FISTS);
        }
        return weapon;
    }

    Equipment chooseEquipment() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch(reader.readLine()){

            case "skin armor": setEquipment(Equipment.SKIN_ARMOR);
                break;
            case "chain armor": setEquipment(Equipment.CHAIN_ARMOR);
                break;
            case "armor": setEquipment(Equipment.ARMOR);
                break;
        }
        return equipment;
    }

    public Manual getResult() {
        return new Manual (type , companion, weapon, equipment);
    }
}
